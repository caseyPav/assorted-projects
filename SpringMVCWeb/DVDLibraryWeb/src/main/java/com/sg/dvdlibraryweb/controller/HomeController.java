/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryweb.controller;

import com.sg.dvdlibraryweb.dao.DvdLibraryDao;
import com.sg.dvdlibraryweb.model.Dvd;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {

    private DvdLibraryDao dao;

    @Inject
    public HomeController(DvdLibraryDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String displayHomePage() {
        return "home";
    }

    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Dvd getDvd(@PathVariable("id") int id) {
        return dao.getDvdById(id);
    }

    @RequestMapping(value = "/dvd", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Dvd createDvd(@Valid @RequestBody Dvd dvd) {
        dao.addDvd(dvd);
        return dvd;
    }

    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDvd(@PathVariable("id") int id) {
        dao.removeDvd(id);
    }

    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putDvd(@PathVariable("id") int id, @RequestBody Dvd dvd) {
        dvd.setDvdId(id);
        dao.updateDvd(dvd);
    }

    @RequestMapping(value = "/dvd", method = RequestMethod.GET)
    @ResponseBody
    public List<Dvd> getAllDvds() {
        return dao.getAllDvds();
    }

    // dummy movies
    @RequestMapping(value = "loadDvds", method = RequestMethod.POST)
    public String loadDvds() {
        Dvd d1 = new Dvd();
        d1.setTitle("Manos: The Hands of Fate");
        d1.setReleaseDate("1996/11/15");
        d1.setMpaaRating("NR");
        d1.setDirector("Harold P Warren");
        d1.setStudio("Sun City Films");

        dao.addDvd(d1);

        Dvd d2 = new Dvd();
        d2.setTitle("Mac and Me");
        d2.setReleaseDate("1988/8/12");
        d2.setMpaaRating("PG");
        d2.setDirector("Stewart Raffill");
        d2.setStudio("Orion Pictures");

        dao.addDvd(d2);

        Dvd d3 = new Dvd();
        d3.setTitle("El Topo");
        d3.setReleaseDate("1971/4/16");
        d3.setMpaaRating("NR");
        d3.setDirector("Alejandro Jordorowsky");
        d3.setStudio("ABKCO Films");

        dao.addDvd(d3);
       
        return "redirect:home";
    }

}
