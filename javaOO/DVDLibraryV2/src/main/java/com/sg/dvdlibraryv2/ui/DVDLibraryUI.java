/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryv2.ui;

import com.sg.dvdlibraryv2.dto.DVD;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class DVDLibraryUI {
    
    ConsoleIO console = new ConsoleIO();

    //MAIN MENU    
    public int displayMenu() {
        
        console.promptForPrintPrompt("  DVD LIBRARY MENU");
        console.promptForPrintPrompt("======================");
        console.promptForPrintPrompt("1.  ADD DVD TO LIBRARY");
        console.promptForPrintPrompt("2.  DELETE DVD FROM LIBRARY");
        console.promptForPrintPrompt("3.  LIST ALL DVD'S");
        console.promptForPrintPrompt("4.  SEARCH BY RATING");
        console.promptForPrintPrompt("5.  SEARCH BY STUDIO");
        console.promptForPrintPrompt("6.  SEARCH BY DIRECTOR");
        console.promptForPrintPrompt("7.  DVD'S REALEASED IN THE LAST x YEARS: ");
        console.promptForPrintPrompt("8.  NEWEST DVD");
        console.promptForPrintPrompt("9.  OLDEST DVD");
        console.promptForPrintPrompt("10. AVERAGE AGE OF DVD'S");
        console.promptForPrintPrompt("11. PERCENTAGE OF ENTRIES WITH NOTES");
        console.promptForPrintPrompt("12. QUIT");
        
        return console.promptForIntWithRange("Please Select an Option: ", 1, 12);
    }

    //UI for add title
    public DVD add() {
        console.promptForPrintPrompt("PLEASE ENTER INFORMATION FOR A NEW ENTRY");
        console.promptForPrintPrompt("++++++++++++++++++++++++++++++++++++++++");
        console.promptForString("");
        int id = console.promptForInt("ID NUMBER: ");
        console.promptForString("");
        String title = console.promptForString("DVD TITLE: ");
        LocalDate releaseDate = console.promptForLocalDate("RELEASE DATE YYYY-MM-DD: ");
        String mpaaRating = console.promptForString("RATING: ");
        String director = console.promptForString("DIRECTOR: ");
        String studio = console.promptForString("STUDIO: ");
        String note = console.promptForString("NOTES: ");
        
        DVD add = new DVD(id, title, releaseDate, mpaaRating, director, studio, note);
        
        return add;
    }

    //UI to search by id
    public int getById() {
        console.promptForString("");
        console.promptForPrintPrompt("PLEASE ENTER TITLE ID NUMBER");
        console.promptForPrintPrompt("--------------------");
        int id = console.promptForInt("ID: ");
        console.promptForString("");
        return id;
    }

    //UI to search by title 
    public String getByTitle() {
        console.promptForString("");
        console.promptForPrintPrompt("ENTER DVD TITLE TO FIND");
        console.promptForPrintPrompt("-----------------------");
        String title = console.promptForString("TITLE: ");
        
        return title;
    }

    //UI to search by rating 
    public String getByRating() {
        console.promptForString("");
        console.promptForPrintPrompt("ENTER RATING TO SEARCH BY");
        console.promptForPrintPrompt("-----------------------");
        String rating = console.promptForString("RATING: ");
        
        return rating;
    }

    //UI to search by studio
    public String getByStudio() {
        console.promptForString("");
        console.promptForPrintPrompt("ENTER STUDIO TO SEARCH BY");
        console.promptForPrintPrompt("-----------------------");
        String studio = console.promptForString("STUDIO: ");
        
        return studio;
    }

    //UI to search by director
    public String getByDirector() {
        console.promptForString("");
        console.promptForPrintPrompt("ENTER DIRECTOR TO SEARCH BY");
        console.promptForPrintPrompt("-----------------------");
        String director = console.promptForString("DIRECTOR: ");
        
        return director;
    }

    //UI for list all titles
    public void listAll(List<DVD> dvdLib) {
        for (DVD a : dvdLib) {
            console.promptForPrintPrompt(a.toString());
        }
    }

    //UI FOR AVG NOTES
    public void listAvgNotes(double avg) {
        console.promptForPrintPrompt(avg + "% of entries contain notes");
    }

    //UI to get long to filter by release date
    public long lookBackTime() {
        console.promptForString("");
        console.promptForPrintPrompt("MOVIES RELEASED IN LAST 'X' YEARS");
        console.promptForPrintPrompt("---------------------------------");
        long years = console.promptForLong("# OF YEARS: ");
        console.promptForString("");
        return years;
    }

    //UI for newest
        public void printNewestAge(long newest) {
        console.promptForPrintPrompt("THE NEWEST DVD IN YOUR COLLECTION IS " + newest + "YEARS OLD");
    } 
    //UI for olderst
                public void printOldestAge(long oldest) {
        console.promptForPrintPrompt("THE OLDEST DVD IN YOUR COLLECTION IS " + oldest + "YEARS OLD");
    } 
    //ui for average age
    public void printAverageAge(double average) {
        console.promptForPrintPrompt("THE AVERAGE AGE OF YOUR COLLECTION IS " + average + "YEARS");
    }    
    
}
