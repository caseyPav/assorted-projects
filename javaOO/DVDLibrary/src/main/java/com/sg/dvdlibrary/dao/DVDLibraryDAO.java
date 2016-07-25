/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.dto.DVDLibrary;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author casey
 */
public class DVDLibraryDAO {

    //read in information from file
    public DVDLibrary readInFile() throws IOException {
        DVDLibrary dvdLib = new DVDLibrary();
        try (BufferedReader br = new BufferedReader(new FileReader("DVDLibrary.txt"))) {
            String fileRead = br.readLine();
            while (fileRead != null) {
                String[] tokenize = fileRead.split("::");
                String title = tokenize[0];
                String releaseDate = tokenize[1];
                String rating = tokenize[2];
                String director = tokenize[3];
                String studio = tokenize[4];
                String userNote = tokenize[5];
                DVD temp = new DVD(title, releaseDate, rating, director, studio, userNote);
                dvdLib.getDVDList().add(temp);
                fileRead = br.readLine();
            }
        }
        return dvdLib;
    }
    //Save modified list to file
    public void saveDVDsToFile(DVDLibrary dvdLib) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("DVDLibrary.txt"));
        for (DVD a : dvdLib.getDVDList()) {
            pw.write(a.toStringEncoded() + "\n");
        }
        pw.close();
    }

    //add dvd object made duing ui prompts
    public DVDLibrary addDVD(DVDLibrary dvdLib, DVD update) {
        dvdLib.getDVDList().add(update);
        return dvdLib;

    }
    //remove DVD's by title 
    public boolean removeDVD(DVDLibrary dvdLib, String removeDVD) {
        DVD temp = null;
        for (DVD a : dvdLib.getDVDList()) {
            if (a.getTitle() != null && a.getTitle().contains(removeDVD)) {
                temp = a;
            }
        }
        dvdLib.getDVDList().remove(temp);
        return true;
    }
    //search DVD's by title 
    public DVD findTitle(DVDLibrary dvdLib, String findTitle) {
        DVD temp = null;
        for (DVD a : dvdLib.getDVDList()) {
            if (a.getTitle() != null && a.getTitle().contains(findTitle)) {
                temp = a;
            }
        }
        return temp;
    }
}
