
package com.swcguild.dvdlibrary.dto;

/**
 *
 * @author warde
 */
public class Dvd {
    
    private int id;
    private String title;
    private int releaseDate;
    private String mpaaRating;
    private String director;
    private String studio;
    private String note;

    public Dvd(int id, String title, int releaseDate, String mpaaRating, String director, String studio, String note) {
        this.id=id;
        this.title=title;
        this.releaseDate= releaseDate;
        this.mpaaRating= mpaaRating;
        this.director=director;
        this.studio=studio;
        this.note= note;
        
    }
   
    @Override
    public String toString(){
    return Integer.toString(id) + title + " ||RELEASED ON: " + Integer.toString(releaseDate) + " ||MPAA RATING: " + mpaaRating + " ||DIRECTED BY: " + director + " ||DISTRIBUTED BY: " + studio + "\nNOTES:" + note;}
    


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

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
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
