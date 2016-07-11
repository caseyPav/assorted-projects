/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.sitelab.dao;

import org.springframework.stereotype.Repository;

/**
 *
 * @author apprentice
 */
@Repository("tipDao")
public class TipCalcDAO {

    public String[] runTipCalc(double userCheck, double userTip) {

        double tipAmt = ((userCheck) * (userTip / 100d));

        double totalD = userCheck + tipAmt;

        String tip = Double.toString(tipAmt);
        String total = Double.toString(totalD);

        String[] result = {tip, total};

        return result;
    }
}
