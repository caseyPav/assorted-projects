/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbookv2.dto;

/**
 *
 * @author apprentice
 */
public class State {

    private String full;
    private String abv;

    public State(String full, String abv) {
        this.full = full;
        this.abv = abv;
    }

    /**
     * @return the full
     */
    public String getFull() {
        return full;
    }

    /**
     * @param full the full to set
     */
    public void setFull(String full) {
        this.full = full;
    }

    /**
     * @return the abv
     */
    public String getAbv() {
        return abv;
    }

    /**
     * @param abv the abv to set
     */
    public void setAbv(String abv) {
        this.abv = abv;
    }

}
