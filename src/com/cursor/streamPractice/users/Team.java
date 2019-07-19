package com.cursor.streamPractice.users;

public enum Team {
    VALOR("Team Valor"),
    MYSTIC("Team Mystic"),
    INSTINCT("Team Instinct");

    private String name;

    Team(String name){
        this.name= name;
    }

    public String toString(){
        return name;
    }
}
