/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryv2.dao;

import com.sg.dvdlibraryv2.dto.DVD;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface DVDLibraryInterface {

    public void add(DVD dvd);

    public void remove(int id);

    public List<DVD> listAll();

    public DVD getById(int id);

    public List<DVD> getByTitle(String title);

    public List<DVD> getByRating(String rating);

    public List<DVD> getByStudio(String studio);

    public List<DVD> getByDirector(String director);

    public double avgNotes();

    public double avgAge();
    
    public long newestAge();
    
    public long oldestAge();
    
    public List<DVD> lastUserSelectYears(long numberOfYears);

}
