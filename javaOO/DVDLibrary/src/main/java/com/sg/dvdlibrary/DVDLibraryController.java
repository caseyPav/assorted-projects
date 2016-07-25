/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary;

import com.sg.dvdlibrary.dao.DVDLibraryDAO;
import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.dto.DVDLibrary;
import com.sg.dvdlibrary.ui.DVDLibraryUI;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author casey
 */
public class DVDLibraryController {

    public void run() throws FileNotFoundException, IOException {

        DVDLibraryUI ui = new DVDLibraryUI();
        DVDLibraryDAO dao = new DVDLibraryDAO();
        DVDLibrary dvdLib = dao.readInFile();

        //main program control loop
        int userSelection = 0;
        while (userSelection != 7) {

            userSelection = ui.displayMenu();
            OUTER:
            switch (userSelection) {
                case 1://ADD DVD
                    DVD a = ui.add();
                    dao.addDVD(dvdLib, a);
                    dao.saveDVDsToFile(dvdLib);
                    break;
                case 2://REMOVE DVD
                    String s = ui.remove();
                    dao.removeDVD(dvdLib, s);
                    dao.saveDVDsToFile(dvdLib);
                    break;
                case 3://FIND DVD
                    String d = ui.findTitle();
                    DVD f = dao.findTitle(dvdLib, d);
                    ui.printTitle(f);
                    break;
                case 4://DATABASE SIZE
                    ui.sizeOfList(dvdLib);
                    break;
                case 5://PRINT ALL ENTRIES
                    ui.listAll(dvdLib);
                    break;
                case 6://EDIT EXISTING ENTRIES 
                    String g = ui.findTitle();
                    DVD h = dao.findTitle(dvdLib, g);
                    int j = 0;
                    while (j != 7) {
                        j = ui.printEditOptions(h);

                        switch (j) {
                            case 1:
                                ui.editTitle(h);
                                dao.saveDVDsToFile(dvdLib);
                                break;
                            case 2:
                                ui.editReleaseDate(h);
                                dao.saveDVDsToFile(dvdLib);
                                break;
                            case 3:
                                ui.editRating(h);
                                dao.saveDVDsToFile(dvdLib);
                                break;
                            case 4:
                                ui.editDirector(h);
                                dao.saveDVDsToFile(dvdLib);
                                break;
                            case 5:
                                ui.editStudio(h);
                                dao.saveDVDsToFile(dvdLib);
                                break;
                            case 6:
                                ui.editUserNote(h);
                                dao.saveDVDsToFile(dvdLib);
                                break;
                            case 7:
                                break OUTER;
                            default:
                                break;
                        }
                    }

                default:

                    return;
            }
        }
    }
}
