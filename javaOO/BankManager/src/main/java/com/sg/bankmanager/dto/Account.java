/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bankmanager.dto;

/**
 *
 * @author apprentice
 */
public class Account {

    private int pin = 1234;
    protected double checkingBalance = 1000;
    protected double savingsBalance = 1000;

    public boolean checkPin(int pin) {
        if (getPin() == pin) {
            return true;
        } else {
            return false;
        }

    }

    public boolean withdrawl(int amt) {
        boolean done = true;
        return done;
    }

    public boolean deposit(int amt) {
    return true;}

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * @return the checkingBalance
     */
    public double getCheckingBalance() {
        return checkingBalance;
    }

    /**
     * @param checkingBalance the checkingBalance to set
     */
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    /**
     * @return the savingsBalance
     */
    public double getSavingsBalance() {
        return savingsBalance;
    }

    /**
     * @param savingsBalance the savingsBalance to set
     */
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

}
