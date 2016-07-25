/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dto;

import java.util.ArrayList;

/**
 *
 * @author casey
 */
public class DVDLibrary {

    private ArrayList<DVD> DVDList = new ArrayList<DVD>();

    /**
     * @return the DVDList
     */
    public ArrayList<DVD> getDVDList() {
        return DVDList;
    }

    /**
     * @param DVDList the DVDList to set
     */
    public void setDVDList(ArrayList<DVD> DVDList) {
        this.DVDList = DVDList;
    }
}
