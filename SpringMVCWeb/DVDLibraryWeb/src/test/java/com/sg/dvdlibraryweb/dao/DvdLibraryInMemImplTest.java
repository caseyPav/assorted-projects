/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryweb.dao;

import com.sg.dvdlibraryweb.model.Dvd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class DvdLibraryInMemImplTest {

    DvdLibraryDao dao = new DvdLibraryInMemImpl();



    int expected, actual;

    @Test
    public void testAddDvd1() {
        dao = new DvdLibraryInMemImpl();
        Dvd d1 = new Dvd();
        d1.setTitle("Manos: The Hands of Fate");
        d1.setReleaseDate("11/15/1966");
        d1.setMpaaRating("NR");
        d1.setDirector("Harold P Warren");
        d1.setStudio("Sun City Films");
        dao.addDvd(d1);

        Dvd d2 = new Dvd();
        d1.setTitle("Manos: The Hands of Fate");
        d1.setReleaseDate("11/15/1966");
        d1.setMpaaRating("NR");
        d1.setDirector("Harold P Warren");
        d1.setStudio("Sun City Films");
        dao.addDvd(d2);
        
        expected = 2;
        actual = dao.getAllDvds().size();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddDvd2() {
        dao = new DvdLibraryInMemImpl();
        Dvd d1 = new Dvd();
        d1.setTitle("Manos: The Hands of Fate");
        d1.setReleaseDate("11/15/1966");
        d1.setMpaaRating("NR");
        d1.setDirector("Harold P Warren");
        d1.setStudio("Sun City Films");
        dao.addDvd(d1);
        
        expected = 1;
        actual = dao.getAllDvds().size();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddDvd3() {
        dao = new DvdLibraryInMemImpl();
        Dvd d1 = new Dvd();
        d1.setTitle("Manos: The Hands of Fate");
        d1.setReleaseDate("11/15/1966");
        d1.setMpaaRating("NR");
        d1.setDirector("Harold P Warren");
        d1.setStudio("Sun City Films");
        dao.addDvd(d1);

        Dvd d2 = new Dvd();
        d1.setTitle("Manos: The Hands of Fate");
        d1.setReleaseDate("11/15/1966");
        d1.setMpaaRating("NR");
        d1.setDirector("Harold P Warren");
        d1.setStudio("Sun City Films");
        dao.addDvd(d2);

        Dvd d3 = new Dvd();
        d3.setTitle("El Topo");
        d3.setReleaseDate("4/16/1971");
        d3.setMpaaRating("NR");
        d3.setDirector("Alejandro Jordorowsky");
        d3.setStudio("ABKCO Films");
        dao.addDvd(d3);

        expected = 3;
        actual = dao.getAllDvds().size();
        assertEquals(expected, actual);
    }

}
