/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dto;

/**
 *
 * @author casey
 */
public class DVD {
    private String title;
    private String releaseDate;
    private String rating;
    private String director;
    private String studio;
    private String userNote;
    
    public DVD(String title, String releaseDate, String rating, String director, String studio, String userNote){
    this.title = title;
    this.releaseDate = releaseDate;
    this.rating = rating;
    this.director = director;
    this.studio = studio;
    this.userNote = userNote;
    }
    
    @Override
    public String toString(){
    return title + " ||RELEASED ON: " + releaseDate + " ||MPAA RATING: " + rating + " ||DIRECTED BY: " + director + " ||DISTRIBUTED BY: " + studio + "\nNOTES:" + userNote;}

    public String toStringEncoded(){
    return title + "::" + releaseDate + "::" + rating + "::" + director + "::" + studio + "::" + userNote;}
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return the rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the studio
     */
    public String getStudio() {
        return studio;
    }

    /**
     * @param studio the studio to set
     */
    public void setStudio(String studio) {
        this.studio = studio;
    }

    /**
     * @return the userNote
     */
    public String getUserNote() {
        return userNote;
    }

    /**
     * @param userNote the userNote to set
     */
    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }
    
}
