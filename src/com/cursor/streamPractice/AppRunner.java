package com.cursor.streamPractice;

import com.cursor.streamPractice.functionalInterface.DecisionMaker;
import com.cursor.streamPractice.users.UserProcessor;
import java.util.Random;

public class AppRunner {
    private static final int USERS_IN_LIST = 20;
    void run(){
        testFunctionalInterface();
        filterUsers();
    }

    private void testFunctionalInterface(){
        System.out.println("1. This functional interface provides an answer to the most important question in woman's life");
        System.out.println("That is: \"Will you marry me?\"");
        System.out.println("Let's see what it decides:");
        DecisionMaker decisionMaker = ()-> new Random().nextBoolean() ? "Not a chance" : "Of course I will";
        System.out.println(decisionMaker.willYouMarryMe());
    }

    private void filterUsers(){
        UserProcessor userProcessor = new UserProcessor();
        System.out.println("2. Generate a list of 20 users, filter them by last login date and group by teams:");
        System.out.println(userProcessor.filterUsers(userProcessor.generateUserList(USERS_IN_LIST)));

    }
}
