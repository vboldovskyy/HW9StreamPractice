package com.cursor.streamPractice;

import com.cursor.streamPractice.boxes.BoxProcessor;
import com.cursor.streamPractice.boxes.Protector;
import com.cursor.streamPractice.functionalInterface.DecisionMaker;
import com.cursor.streamPractice.movies.MovieProcessor;
import com.cursor.streamPractice.users.UserProcessor;

import java.util.List;
import java.util.Random;

class AppRunner {
    private static final int ENTRIES_IN_LIST = 20;
    void run(){
        testFunctionalInterface();
        filterUsers();
        processMovies();
        processBoxes();
    }

    private void testFunctionalInterface(){
        System.out.println("1. This functional interface provides an answer to the most important question in woman's life");
        System.out.println("That is: \"Will you marry me?\"");
        System.out.println("Let's see what it decides:\n");
        DecisionMaker decisionMaker = ()-> new Random().nextBoolean() ? "Not a chance" : "Of course I will";
        System.out.println(decisionMaker.willYouMarryMe());
    }

    private void filterUsers(){
        UserProcessor userProcessor = new UserProcessor();
        System.out.println("\n2. Generate a list of 20 users, filter them by last login date and group by teams:");
        System.out.println(userProcessor.filterUsers(userProcessor.generateUserList(ENTRIES_IN_LIST)));
    }

    private void processMovies(){
        MovieProcessor movieProcessor = new MovieProcessor(ENTRIES_IN_LIST);
        System.out.println("\n3. Let's generate 20 movies and count them by genre:");
        System.out.println(movieProcessor.calculateMoviesByGenre());
        System.out.println("Now let's calculate average prices by genre:");
        System.out.println(movieProcessor.calculateAveragePriceByGenre());
    }

    private void processBoxes(){
        System.out.println("\n4. Let's create 20 boxes with 10 things each, about half of which will be fragile:");
        BoxProcessor boxProcessor = new BoxProcessor(ENTRIES_IN_LIST);
        List<Protector> protectedThings = boxProcessor.wrapAllFragileThingsInBoxes();
        System.out.println("After processing we got "+protectedThings.size()+ " wrapped up fragile things.");
        if(boxProcessor.areAllFragile(protectedThings))
        {
            System.out.println("And all of them are indeed fragile.");
        }
    }
}
