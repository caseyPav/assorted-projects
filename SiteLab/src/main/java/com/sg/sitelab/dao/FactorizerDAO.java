/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.sitelab.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author apprentice
 */
@Repository("factorizerDao")
public class FactorizerDAO {

    public String[] runFactorizer(int userNumber) {

        int factorNumber = 1;

        int factor = userNumber;
        List<String> factorsList = new ArrayList<String>();

        //factor the number and display results
        while (factorNumber <= factor) {
            if (factor % factorNumber == 0) {
                String s = Integer.toString(factorNumber);
                factorsList.add(s);
            }
            factorNumber++;
        }

        String allTheFactors = String.join(", ", factorsList);

        //check for perfect number
        int perfectCheck = 0;
        String perfectResult = "";
        for (int n = 1; n <= factor / 2; n++) {
            if (factor % n == 0) {
                perfectCheck += n;
            }
        }
        if (perfectCheck == factor) {
            perfectResult = factor + " is a perfect number";

        } else {
            perfectResult = factor + " is not a perfect number";

        }

        // check for prime
        int primeCheck = 2;
        int primeCheckResult = 0;
        String primeResult;

        while (primeCheck <= factor / 2) {
            if (factor % primeCheck == 0) {
                primeCheckResult = 1;
            }
            primeCheck++;
        }
        if (primeCheckResult == 1) {
            primeResult = factor + " is not a prime number.";
        } else {
            primeResult = factor + " is a prime number.";
        }

        String[] factorResults = {allTheFactors, perfectResult, primeResult};

        return factorResults;

    }

}
