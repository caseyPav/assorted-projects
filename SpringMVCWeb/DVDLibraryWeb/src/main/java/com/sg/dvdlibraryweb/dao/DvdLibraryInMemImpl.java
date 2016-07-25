/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryweb.dao;

import com.sg.dvdlibraryweb.model.Dvd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class DvdLibraryInMemImpl implements DvdLibraryDao {

    /**
     * @return the dvdIdCounter
     */
    public static int getDvdIdCounter() {
        return dvdIdCounter;
    }

    /**
     * @param aDvdIdCounter the dvdIdCounter to set
     */
    public static void setDvdIdCounter(int aDvdIdCounter) {
        dvdIdCounter = aDvdIdCounter;
    }

    private Map<Integer, Dvd> dvdMap = new HashMap<>();

    private static int dvdIdCounter = 0;

    @Override
    public Dvd addDvd(Dvd dvd) {

        dvd.setDvdId(getDvdIdCounter());
        setDvdIdCounter(getDvdIdCounter() + 1);
        dvdMap.put(dvd.getDvdId(), dvd);
        return dvd;
    }

    @Override
    public void removeDvd(int dvdId) {
        dvdMap.remove(dvdId);
    }

    @Override
    public void updateDvd(Dvd dvd) {
        dvdMap.put(dvd.getDvdId(), dvd);
    }

    @Override
    public List<Dvd> getAllDvds() {
        Collection<Dvd> c = dvdMap.values();
        return new ArrayList(c);
    }

    @Override
    public Dvd getDvdById(int dvdId) {
        return dvdMap.get(dvdId);
    }

    @Override
    public List<Dvd> searchContacts(Map<SearchTerm, String> criteria) {

        String titleCriteria = criteria.get(SearchTerm.TITLE);
        String releaseDateCriteria = criteria.get(SearchTerm.RELEASE_DATE);
        String mpaaRatingCriteria = criteria.get(SearchTerm.MPAA_RATING);
        String directorCriteria = criteria.get(SearchTerm.DIRECTOR);
        String studioCriteria = criteria.get(SearchTerm.STUDIO);

        Predicate<Dvd> titleMatches;
        Predicate<Dvd> releaseDateMatches;
        Predicate<Dvd> mpaaRatingMatches;
        Predicate<Dvd> directorMatches;
        Predicate<Dvd> studioMatches;

        Predicate<Dvd> truePredicate = (c) -> {
            return true;
        };

        titleMatches = (titleCriteria == null || titleCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getTitle().equals(titleCriteria);
        releaseDateMatches = (releaseDateCriteria == null || releaseDateCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getReleaseDate().equals(releaseDateCriteria);
        mpaaRatingMatches = (mpaaRatingCriteria == null || mpaaRatingCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getMpaaRating().equals(mpaaRatingCriteria);
        directorMatches = (directorCriteria == null || directorCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getDirector().equals(directorCriteria);
        studioMatches = (studioCriteria == null || studioCriteria.isEmpty())
                ? truePredicate
                : (c) -> c.getStudio().equals(studioCriteria);

        return dvdMap.values().stream()
                .filter(titleMatches
                        .and(releaseDateMatches)
                        .and(mpaaRatingMatches)
                        .and(directorMatches)
                        .and(studioMatches))
                .collect(Collectors.toList());

    }

}
