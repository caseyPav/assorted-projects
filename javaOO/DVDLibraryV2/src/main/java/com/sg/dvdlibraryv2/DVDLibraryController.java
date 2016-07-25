/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryv2;

import com.sg.dvdlibraryv2.dao.DvdLibraryIMPL;
import com.sg.dvdlibraryv2.dto.DVD;
import com.sg.dvdlibraryv2.ui.DVDLibraryUI;

/**
 *
 * @author ca$ey
 */
public class DVDLibraryController {

    DvdLibraryIMPL dvdLib = new DvdLibraryIMPL();
    DVDLibraryUI ui = new DVDLibraryUI();

    public void run() {

        //MAIN SWITCH STATEMENT
        int userSelection = 0;
        while (userSelection != 12) {

            userSelection = ui.displayMenu();

            switch (userSelection) {
                case 1://ADD DVD
                    DVD a = ui.add();
                    dvdLib.add(a);
                    break;
                case 2://REMOVE DVD
                    int s = ui.getById();
                    dvdLib.remove(s);
                    break;
                case 3://PRINT ALL 
                    ui.listAll(dvdLib.listAll());
                    break;
                case 4://SEARCH BY RATING
                    String r = ui.getByRating();
                    ui.listAll(dvdLib.getByRating(r));
                    break;
                case 5://SEARCH BY STUDIO
                    String q = ui.getByStudio();
                    ui.listAll(dvdLib.getByStudio(q));
                    break;
                case 6://SEARCH BY DIRECTOR
                    String w = ui.getByDirector();
                    ui.listAll(dvdLib.getByDirector(w));
                    break;
                case 7://DVD'S RELEASED IN LAST X YEARS
                    long years = ui.lookBackTime();
                    ui.listAll(dvdLib.lastUserSelectYears(years));
                    break;
                case 8://NEWEST DVD
                    ui.printNewestAge(dvdLib.newestAge());
                    break;
                case 9://OLDEST DVD
                    ui.printOldestAge(dvdLib.oldestAge());
                    break;
                case 10://AVERAGE AGE 
                    ui.printAverageAge(dvdLib.avgAge());
                    break;
                case 11://PERCENTAGE WITH NOTES 
                    ui.listAvgNotes(dvdLib.avgNotes());
                    break;

                default:
                    return;
            }
        }
    }

}
