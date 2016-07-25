/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.dto.DVDLibrary;

/**
 *
 * @author casey
 */
public class DVDLibraryUI {

    ConsoleIO console = new ConsoleIO();

    //MAIN MENU    
    public int displayMenu() {

        console.promptForPrintPrompt("  DVD LIBRARY MENU");
        console.promptForPrintPrompt("======================");
        console.promptForPrintPrompt("1. ADD DVD TO LIBRARY");
        console.promptForPrintPrompt("2. DELETE DVD FROM LIBRARY");
        console.promptForPrintPrompt("3. FIND DVD INFORMATION");
        console.promptForPrintPrompt("4. LIST NUMBER OF DVD'S");
        console.promptForPrintPrompt("5. LIST ALL DVD'S");
        console.promptForPrintPrompt("6. EDIT DVD INFORMATION");
        console.promptForPrintPrompt("7. QUIT");

        return console.promptForIntWithRange("Please Select an Option: ", 1, 7);
    }

    //UI for add title
    public DVD add() {
        console.promptForPrintPrompt("PLEASE ENTER INFORMATION FOR A NEW ENTRY");
        console.promptForPrintPrompt("++++++++++++++++++++++++++++++++++++++++");
        console.promptForString("");
        String title = console.promptForString("DVD TITLE: ");
        String releaseDate = console.promptForString("RELEASE DATE: ");
        String rating = console.promptForString("RATING: ");
        String director = console.promptForString("DIRECTOR: ");
        String studio = console.promptForString("STUDIO: ");
        String userNote = console.promptForString("NOTES: ");

        DVD add = new DVD(title, releaseDate, rating, director, studio, userNote);

        return add;
    }

    //UI for remove entry
    public String remove() {
        console.promptForString("");
        console.promptForPrintPrompt("ENTER TITLE TO REMOVE");
        console.promptForPrintPrompt("--------------------");
        String title = console.promptForString("TITLE: ");
        return title;
    }

    //UI for find title 
    public String findTitle() {
        console.promptForString("");
        console.promptForPrintPrompt("ENTER DVD TITLE TO FIND");
        console.promptForPrintPrompt("-----------------------");
        String title = console.promptForString("TITLE: ");

        return title;
    }

    //UI for print single title
    public void printTitle(DVD print) {
        console.promptForPrintPrompt(print.toString());
    }

    //UI for # of titles in Library
    public void sizeOfList(DVDLibrary dvdLib) {
        console.promptForString("");
        int size = dvdLib.getDVDList().size();
        console.promptForPrintPrompt("CURRENT NUMBER OF ENTRIES:  ");
        console.promptForPrintInt(size);
    }

    //UI for list all titles
    public void listAll(DVDLibrary dvdLib) {
        for (DVD a : dvdLib.getDVDList()) {
            console.promptForPrintPrompt(a.toString());
        }
    }

    //UI to select field to edit
    public int printEditOptions(DVD editTarget) {
        int choice;
        console.promptForPrintPrompt(editTarget.toString());
        console.promptForPrintPrompt("===========================");
        console.promptForPrintPrompt("PLEASE SELECT FIELD TO EDIT");
        console.promptForPrintPrompt("          1. TITLE");
        console.promptForPrintPrompt("          2. RELEASE DATE");
        console.promptForPrintPrompt("          3. RATING");
        console.promptForPrintPrompt("          4. DIRECTOR");
        console.promptForPrintPrompt("          5. STUDIO");
        console.promptForPrintPrompt("          6. ADD A NOTE");
        console.promptForPrintPrompt("          7. EXIT");
        choice = console.promptForIntWithRange("PLEASE ENTER YOUR CHOICE", 1, 7);
        console.promptForString("");
        return choice;
    }

    public void editTitle(DVD toEdit) {
        String newTitle = console.promptForString("NEW TITLE: ");
        toEdit.setTitle(newTitle);
    }

    public void editReleaseDate(DVD toEdit) {
        String newReleaseDate = console.promptForString("NEW RELEASE DATE: ");
        toEdit.setReleaseDate(newReleaseDate);
    }

    public void editRating(DVD toEdit) {
        String newRating = console.promptForString("NEW RATING: ");
        toEdit.setRating(newRating);
    }

    public void editDirector(DVD toEdit) {
        String newDirector = console.promptForString("NEW DIRECTOR: ");
        toEdit.setDirector(newDirector);
    }

    public void editStudio(DVD toEdit) {
        String newStudio = console.promptForString("NEW STUDIO: ");
        toEdit.setStudio(newStudio);
    }

    public void editUserNote(DVD toEdit) {
        String newUserNote = console.promptForString("PLEASE ENTER YOUR NOTE: ");
        toEdit.setUserNote(newUserNote);
    }

}
