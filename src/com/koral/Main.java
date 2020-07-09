package com.koral;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        User bashar = new User();
        //bashar.setId(1);
        bashar.setUserName("pop");
        bashar.setEmail("popsmokea@gmail.com");
        bashar.setPassword("YUtHnfjdncvfcd");

        User greg = new User();
        greg.setUserName("just_greg");
        greg.setEmail("greggo@gmail.com");
        greg.setPassword("jbrfjfporkokdjnclm");

        User shrek = new User();
        //shrek.setId(1);
        shrek.setUserName("shrekke");
        shrek.setEmail("fiona@gmail.com");
        shrek.setPassword("fnjedk");

        User popsmoke = new User();
        //popsmoke.setId(1);
        popsmoke.setUserName("therealpopsmoke");
        popsmoke.setEmail("rippopsmoke@gmail.com");
        popsmoke.setPassword("YUefdstHvfcd");

        User fifty_cent = new User();
        //fifty_cent.setId(1);
        fifty_cent.setUserName("50cent");
        fifty_cent.setEmail("50cent@gmail.com");
        fifty_cent.setPassword("YUtHvfcd");

        UserDAO db = new UserDAO();
        db.create(bashar);
        db.create(greg);
        db.create(shrek);
        db.create(popsmoke);
        db.create(fifty_cent);

        System.out.println("ALL USERS");
        User[] all = db.findAll();
        for (User u : all) {
            System.out.println(u);
        }

        db.delete(1);
        db.delete(2);
        db.delete(3);
        db.delete(4);
        db.delete(5);

        User userToUpdate = db.read(1);
        userToUpdate.setUserName("Arkadiusz");
        userToUpdate.setEmail("arek@coderslab.pl");
        userToUpdate.setPassword("superPassword");
        db.update(userToUpdate);

        System.out.println("UPDATED USER");
        System.out.println(db.read(1));

    }
}
