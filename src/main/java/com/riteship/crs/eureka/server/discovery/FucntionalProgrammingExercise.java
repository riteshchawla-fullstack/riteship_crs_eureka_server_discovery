package com.riteship.crs.eureka.server.discovery;

import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FucntionalProgrammingExercise {

    public static void main(String[] args) {

        //Task-1 Get the List of Strings from below list which contains digits using Stream API
        List<String> nameAndDigitsList = Arrays.asList("John123Right", "Steve", "Bob453Anthony", "Kanika",
                "Ritu678");



        // Task 2
        // Client is getting error while accessing the file TaskOne.xml and the error is

        //Cannot Access RiteShip.xml file becuase it is being used by some other process

        // The Task is complete the code below
        Thread threadOne = new Thread(() -> {
            File file = new File("C:\\RiteShip.xml");
            try {
                InputStream is = new FileInputStream(file);

            } catch(Exception ex) {

            }
        });

    }
}
