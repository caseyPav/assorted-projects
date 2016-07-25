/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryv2.dao;

import com.sg.dvdlibraryv2.dto.DVD;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class DvdLibraryIMPL implements DVDLibraryInterface {

    public List<DVD> DVDList = new ArrayList<DVD>();

    @Override
    public void add(DVD dvd) {
        DVDList.add(dvd);

    }

    @Override
    public void remove(int id) {
        DVD temp = null;
        for (DVD a : DVDList) {
            if (a.getId() == id) {
                temp = a;
            }
        }
        DVDList.remove(temp);
    }

    @Override
    public List<DVD> listAll() {
        return DVDList;
    }

    @Override
    public DVD getById(int id) {
        DVD temp = null;
        for (DVD a : DVDList) {
            if (a.getId() == id) {
                temp = a;
            }
        }
        return temp;
    }

    @Override
    public List<DVD> getByTitle(String title) {
        return DVDList.stream()
                .filter((a) -> (a.getTitle()
                        .equalsIgnoreCase(title))).collect(Collectors.toList());
    }

    @Override
    public List<DVD> getByRating(String rating) {
        return DVDList.stream()
                .filter((a) -> (a.getMpaaRating()
                        .equalsIgnoreCase(rating))).collect(Collectors.toList());
    }

    @Override
    public List<DVD> getByStudio(String studio) {
        return DVDList.stream()
                .filter((a) -> (a.getStudio()
                        .equalsIgnoreCase(studio))).collect(Collectors.toList());
    }

    @Override
    public List<DVD> getByDirector(String director) {
        return DVDList.stream()
                .filter((a) -> (a.getDirector()
                        .equalsIgnoreCase(director))).collect(Collectors.toList());
    }

    @Override
    public double avgNotes() {
        double average;
        List<DVD> temp = DVDList.stream()
                .filter(a -> (a.getNote() != null && !a.getNote().isEmpty()))
                .collect(Collectors.toList());
        average = (temp.size()) / (DVDList.size());
        return average;
    }

    @Override
    public double avgAge() {
        double average;
        average = DVDList.stream()
                .mapToLong(DVD::getDVDAge)
                .average().getAsDouble();
        return average;
    }

    @Override
    public long newestAge() {
        long newest = DVDList.stream()
                .mapToLong(DVD::getDVDAge)
                .min().getAsLong();
        return newest;
    }

    @Override
    public long oldestAge() {
        long oldest = DVDList.stream()
                .mapToLong(DVD::getDVDAge)
                .max().getAsLong();
        return oldest;
    }

    @Override
    public List<DVD> lastUserSelectYears(long numberOfYears) {
        List<DVD> temp = DVDList.stream().filter(a -> a.getDVDAge() < numberOfYears)
                .collect(Collectors.toList());
        return temp;
    }

}
