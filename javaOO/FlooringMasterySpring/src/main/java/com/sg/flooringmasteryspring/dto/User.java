/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.dto;

/**
 *
 * @author apprentice
 */
public class User {

    private String username;
    private String password;
    private String saveKey;

    public User(String username, String password, String saveKey) {
        this.username = username;
        this.password = password;
        this.saveKey = saveKey;
    }

    public String toStringXML() {
        return saveKey + ".xml";
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the saveKey
     */
    public String getSaveKey() {
        return saveKey;
    }

    /**
     * @param saveKey the saveKey to set
     */
    public void setSaveKey(String saveKey) {
        this.saveKey = saveKey;
    }

}
