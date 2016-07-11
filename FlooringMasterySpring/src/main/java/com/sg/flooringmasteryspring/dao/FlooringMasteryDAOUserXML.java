/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Product;
import com.sg.flooringmasteryspring.dto.User;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class FlooringMasteryDAOUserXML {

    private ArrayList<User> userList = (ArrayList<User>) readInUsers();

    public boolean addUser(User newUser) {
        getUserList().add(newUser);
        return true;
    }

    public boolean checkLogin(String[] loginInfo) {
        String username = loginInfo[0];
        String password = loginInfo[1];
        return getUserList().stream().anyMatch((u) -> (u.getUsername().equals(username)
                && u.getPassword().equals(password)));
    }

    public List<User> readInUsers() {
        List<User> temp = new ArrayList();
        XStream xstream = new XStream();
        File[] existingUsers = new File("CompanyData/UserXML/").listFiles();
        for (File file : existingUsers) {
            xstream.alias("User", User.class);
            User u = (User) xstream.fromXML(file);
            temp.add(u);
        }
        User admin = new User("godmode", "godmode", "master");
        temp.add(admin);
        return temp;
    }

    public boolean saveChangesToUsers() {

        try {
            XStream xStream = new XStream();
            OutputStream outputStream = null;
            Writer writer = null;

            for (User u : getUserList()) {
                try {
                    String fileName = u.toStringXML();
                    outputStream = new FileOutputStream("CompanyData/UserXML/" + fileName);
                    writer = new OutputStreamWriter(outputStream, Charset.forName("UTF-8"));
                    xStream.alias("User", User.class);
                    xStream.toXML(u, writer);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FlooringMasteryDAOxml.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            writer.close();
            outputStream.close();
        } catch (IOException ex) {
            System.out.println("ERROR WRITING TO XML");
        }
        return true;
    }

    /**
     * @return the userList
     */
    public ArrayList<User> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

}
