package com.cursor.streamPractice.boxes;

public class Protector {
    private Thing thing;

    Protector(Thing thing){
        this.thing = thing;
    }
    Thing getThing(){
        return thing;
    }
    public String toString(){
        return "Protected thing";
    }
}
