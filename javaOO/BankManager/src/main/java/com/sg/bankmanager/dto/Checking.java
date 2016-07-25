/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bankmanager.dto;

import com.sg.bankmanager.dto.Account;

/**
 *
 * @author apprentice
 */
public class Checking extends Account {

    @Override
    public boolean deposit(int amt) {
        if (amt <= 10000) {
            checkingBalance = (getCheckingBalance() + amt);
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean withdrawl(int amt) {
        if (amt <= getCheckingBalance()) {
            checkingBalance = (getCheckingBalance() - amt);
            return true;
        } else {
            return false;
        }
    }

}
