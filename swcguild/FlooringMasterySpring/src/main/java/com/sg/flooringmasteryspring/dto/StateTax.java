/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.dto;

/**
 *
 * @author apprentice
 */
public class StateTax {

    private String stateFull;
    private String stateAbv;
    private double stateTax;

    public StateTax(String stateFull, String stateAbv, double stateTax) {
        this.stateFull = stateFull;
        this.stateAbv = stateAbv;
        this.stateTax = stateTax;
    }

    
    
        @Override
    public String toString() {
        return stateFull + "::" + stateAbv + "::" + Double.toString(stateTax);
    }
    
    
    
    
    
    
    //=========================================================================//
    //================GETTERS& SETTERS=========================================//
    
    
    /**
     * @return the stateFull
     */
    public String getStateFull() {
        return stateFull;
    }

    /**
     * @param stateFull the stateFull to set
     */
    public void setStateFull(String stateFull) {
        this.stateFull = stateFull;
    }

    /**
     * @return the stateAbv
     */
    public String getStateAbv() {
        return stateAbv;
    }

    /**
     * @param stateAbv the stateAbv to set
     */
    public void setStateAbv(String stateAbv) {
        this.stateAbv = stateAbv;
    }

    /**
     * @return the stateTax
     */
    public double getStateTax() {
        return stateTax;
    }

    /**
     * @param stateTax the stateTax to set
     */
    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

}
