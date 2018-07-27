package org.ac.hackathon;

import org.ac.hackathon.persistence.model.Requests;
import org.ac.hackathon.persistence.model.User;

import java.util.LinkedList;

/**
 * Created by codecadet on 26/07/2018.
 */
public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Maria");
        user.setId(1);
        user.setLocal("Lisboa");
        user.setContact("9999999999");
        user.setPassword("000");

        LinkedList requests = new LinkedList();
        LinkedList foodPreferences = new LinkedList();
        LinkedList themesPreferences = new LinkedList();

        requests.add("banana");
        requests.add("cenoura");
        requests.add("batata");

        foodPreferences.add("Couve lombarda");
        foodPreferences.add("Couve Roxa");
        foodPreferences.add("Alface");

        themesPreferences.add("Ikea Chairs");
        themesPreferences.add("Blue Sky");
        themesPreferences.add("Special Dolls");

        user.setRequests(requests);
        user.setRequests(foodPreferences);
        user.setRequests(themesPreferences);


        System.out.println(requests);
        System.out.println(foodPreferences);
        System.out.println(themesPreferences);
        System.out.println(user);


        Requests requests1 = new Requests();
        requests1.setId(1);
        requests1.setState(2);
        System.out.println(requests1);

    }


}
