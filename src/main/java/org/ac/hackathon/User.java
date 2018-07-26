package org.ac.hackathon;

import java.util.LinkedList;

/**
 * Created by codecadet on 26/07/2018.
 */
public class User {

    private int id;
    private String name;
    private String local;
    private String contact;
    private String password;
    private String photo;

    private LinkedList <String> foodPreferences;
    private LinkedList <String> themePreferences;
    private LinkedList <Requests> requests;


}
