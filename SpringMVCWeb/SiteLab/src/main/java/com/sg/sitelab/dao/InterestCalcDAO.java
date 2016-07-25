
package com.sg.sitelab.dao;

import com.sg.sitelab.dto.Interest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("interestDao")
public class InterestCalcDAO {

    public List<Interest> runInterestCalc(double userPrincipal, double userInterest, int userYears) {

        double interestRate = userInterest;
        double principal = userPrincipal;
        int length = userYears;

        List<Interest> listToReturn = new ArrayList<Interest>();

        int startYear = 2016;
        int trackYears = 0;
        int loops = length * 4;
        double currentBalanceRoundOff;
        double interestEarnedRoundOff;
        int returnYear;
        double currentBalance = principal;

        for (int count = 0; count <= loops; count++) {

            currentBalance = currentBalance * (1 + ((interestRate / 4d) / 100d));

            if (count % 4 == 0) {
                double interestEarned = currentBalance - principal;
                principal = currentBalance;
                trackYears = trackYears + 1;
                currentBalanceRoundOff = Math.round(currentBalance * 100.0) / 100.0;
                interestEarnedRoundOff = Math.round(interestEarned * 100.0) / 100.0;
                returnYear = (startYear + trackYears);
                Interest newYear = new Interest(returnYear, currentBalanceRoundOff, interestEarnedRoundOff);
                listToReturn.add(newYear);
            }

        }

        return listToReturn;
    }

}
