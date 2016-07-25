/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary;

import java.io.IOException;

/**
 * * @author casey pavelko
 * rest of group: Xin Li & Darian Iczkowski
 */
public class DVDLibraryApp {
    public static void main(String[] args) throws IOException {
        
        DVDLibraryController c = new DVDLibraryController();
        c.run();
    }
    
}
