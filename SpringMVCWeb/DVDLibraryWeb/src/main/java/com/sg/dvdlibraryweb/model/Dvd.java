/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryweb.model;

import java.util.Objects;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Dvd {

    private int dvdId;
    //@NotBlank
    //@NotEmpty(message = "Movies Need Titles.")
    //@Length(max = 50, message = "Title must be no more than 50 characters in length.")
    private String title;
    //@NotBlank
    //@NotEmpty(message = "Must Have Release Date!")
   //@Length(max = 50, message = "Something Broke.")
    //@Pattern(regexp = "(((19|20)\\\\d\\\\d/0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01]))", message = "you broke the box")
    private String releaseDate;
    //@NotBlank
    //@NotEmpty(message = "Movies Need Ratings.")
    //@Pattern(regexp = "NR|NC-17|R|PG-13|PG|G|UR")
    private String mpaaRating;
   // @NotBlank
   // @NotEmpty(message = "Movies Need Directors.")
  //  @Length(max = 50, message = "Name must be no more than 50 characters in length.")
    private String director;
  //  @NotBlank
  //  @NotEmpty(message = "Movies Need Studios.")
   // @Length(max = 50, message = "Studio must be no more than 50 characters in length.")
    private String studio;
    private String note;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.getDvdId();
        hash = 37 * hash + Objects.hashCode(this.title);
        hash = 37 * hash + Objects.hashCode(this.releaseDate);
        hash = 37 * hash + Objects.hashCode(this.mpaaRating);
        hash = 37 * hash + Objects.hashCode(this.director);
        hash = 37 * hash + Objects.hashCode(this.studio);
        hash = 37 * hash + Objects.hashCode(this.note);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final Dvd other = (Dvd) obj;

        if (this.dvdId != other.dvdId) {
            return false;
        }

        if (!Objects.equals(this.title, other.title)) {
            return false;
        }

        if (!Objects.equals(this.releaseDate, other.releaseDate)) {
            return false;
        }

        if (!Objects.equals(this.mpaaRating, other.mpaaRating)) {
            return false;
        }

        if (!Objects.equals(this.director, other.director)) {
            return false;
        }

        if (!Objects.equals(this.studio, other.studio)) {
            return false;
        }
        return true;
    }

    public int getDvdId() {
        return dvdId;
    }

    public void setDvdId(int dvdId) {
        this.dvdId = dvdId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
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
