/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.gamebot;

import com.sg.gamebot.games.InterestCalc;
import com.sg.gamebot.games.LuckySevens;
import com.sg.gamebot.games.RockPaperScissors;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GameBot {

    private boolean play;

    public void run() {
        InterestCalc ic = new InterestCalc();
        LuckySevens ls = new LuckySevens();
        RockPaperScissors rps = new RockPaperScissors();
        setPlay(true);

        do {

            System.out.println("current games");
            System.out.println(ic.ReturnName());
            System.out.println(ls.ReturnName());
            System.out.println(rps.ReturnName());
            System.out.println("TYPE 'quit' TO QUIT");
            String choice = Selector();
            if (null != choice) {
                switch (choice) {
                    case "ic":
                        ic.Run();
                        break;
                    case "ls":
                        ls.Run();
                        break;
                    case "rps":
                        rps.Run();
                        break;
                    default:
                        setPlay(false);
                        return;
                }
            }

        }while (play = true);

        System.out.println("later days buuudddyyy");

    }

    public String Selector() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }



    /**
     * @return the play
     */
    public boolean isPlay() {
        return play;
    }

    /**
     * @param play the play to set
     */
    public void setPlay(boolean play) {
        this.play = play;
    }
}
