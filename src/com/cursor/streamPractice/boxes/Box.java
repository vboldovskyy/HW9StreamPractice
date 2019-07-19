package com.cursor.streamPractice.boxes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Box {
    List<Thing> thingList;
    private static final Random RANDOM = new Random();

    Box(int numberOfThings) {
        thingList = new ArrayList<>();
        for (int i = 0; i < numberOfThings; i++)
            thingList.add(new Thing(RANDOM.nextBoolean()));
    }

    List<Thing> getThings(){
        return thingList;
    }

}
