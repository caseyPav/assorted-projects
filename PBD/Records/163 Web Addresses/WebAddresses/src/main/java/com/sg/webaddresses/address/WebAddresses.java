/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.webaddresses.address;

import java.net.URL;
import java.util.Scanner;

class Address {

    String street;
    String city;
    String state;
    int zip;
}

public class WebAddresses {

    public static void main(String[] args) throws Exception {
        URL addys = new URL("HTTPS://cs.leanderisd.org/txt/fake-addresses.txt");
        Address uno;
        Address dos;
        Address tre;
        try (Scanner fin = new Scanner(addys.openStream())) {
            uno = new Address();
            uno.street = fin.nextLine();
            uno.city = fin.nextLine();
            uno.state = fin.next();
            uno.zip = fin.nextInt();
            fin.skip("\n");
            dos = new Address();
            dos.street = fin.nextLine();
            dos.city = fin.nextLine();
            dos.state = fin.next();
            dos.zip = fin.nextInt();
            fin.skip("\n");
            tre = new Address();
            tre.street = fin.nextLine();
            tre.city = fin.nextLine();
            tre.state = fin.next();
            tre.zip = fin.nextInt();
            Address four = new Address();
            four.street = fin.nextLine();
            four.city = fin.nextLine();
            four.state = fin.next();
            four.zip = fin.nextInt();
            fin.skip("\n");
        }

        System.out.println(uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
        System.out.println(dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
        System.out.println(tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
    }
}
