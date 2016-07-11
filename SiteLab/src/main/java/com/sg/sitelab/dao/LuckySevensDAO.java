/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.sitelab.dao;

import java.util.Random;
import org.springframework.stereotype.Repository;

/**
 *
 * @author apprentice
 */
@Repository("luckyDao")
public class LuckySevensDAO {

    public String[] playLuckySevens(int userBet) {

        int wallet = userBet;
        int maxWallet;
        int maxWalletCount;
        int die1;
        int die2;
        int count;

        count = 0;
        maxWallet = 0;
        maxWalletCount = 0;

        while (wallet > 0) {
            count++;
            Random generator = new Random();

            die1 = generator.nextInt(6) + 1;
            die2 = generator.nextInt(6) + 1;

            if (die1 + die2 == 7) {
                wallet += 4;
            } else {
                wallet -= 1;
            }

            if (maxWallet < wallet) {
                maxWallet = wallet;
                maxWalletCount = count;
            }

        }

        String countStr = Integer.toString(count);
        String maxMoneyStr = Integer.toString(maxWalletCount);
        String maxWalletStr = Integer.toString(maxWallet);

        String[] results = {countStr, maxMoneyStr, maxWalletStr};

        return results;
    }

}
