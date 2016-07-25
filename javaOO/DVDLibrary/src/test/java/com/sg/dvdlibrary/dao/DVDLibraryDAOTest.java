/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.dto.DVDLibrary;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author casey
 */
public class DVDLibraryDAOTest {

    DVDLibrary dvdlib = new DVDLibrary();
    DVDLibraryDAO b = new DVDLibraryDAO();
    DVD g = new DVD("Test", "Test", "Test", "Test", "Test", "test");
    DVD n = new DVD("Test", "Test", "Test", "test", "Test", "test");
    String y = "Test";
    int expected, actual;

    public DVDLibraryDAOTest() {
    }
    @Test
    public void addDVDTest() {
        b.addDVD(dvdlib, n);
        expected = 1;
        actual = dvdlib.getDVDList().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDVDTest() {
        b.addDVD(dvdlib, n);
        b.removeDVD(dvdlib, y);
        expected = 0;
        actual = dvdlib.getDVDList().size();
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void findTitleTest() {
        b.addDVD(dvdlib, n);
        expected = 1;
        actual = dvdlib.getDVDList().size();
        Assert.assertEquals(expected, actual);
    }
}
