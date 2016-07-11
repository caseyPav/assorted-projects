package com.sg.flooringmasteryspring.dto;

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

    public String toStringXML() {
        return stateFull + ".xml";
    }
    //=========================================================================//
    //================GETTERS& SETTERS=========================================//

    public String getStateFull() {
        return stateFull;
    }

    public void setStateFull(String stateFull) {
        this.stateFull = stateFull;
    }

    public String getStateAbv() {
        return stateAbv;
    }

    public void setStateAbv(String stateAbv) {
        this.stateAbv = stateAbv;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

}
