/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryv2.dto;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author apprentice
 */
public class DVD {

    private int id;
    private String title;
    private LocalDate releaseDate;
    private String mpaaRating;
    private String director;
    private String studio;
    private String note;

    public DVD(int id, String title, LocalDate releaseDate, String mpaaRating, String director, String studio, String note) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.mpaaRating = mpaaRating;
        this.director = director;
        this.studio = studio;
        this.note = note;

    }

    @Override
    public String toString() {
        return "||ID #: " + Integer.toString(id) + "||TITLE: " + title + " ||RELEASED ON: " + releaseDate + " ||MPAA RATING: " + mpaaRating + " ||DIRECTED BY: " + director + " ||DISTRIBUTED BY: " + studio + "\nNOTES:" + note;
    }

    public long getDVDAge() {
        Period p = getReleaseDate().until(LocalDate.now());
        return p.getYears();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
