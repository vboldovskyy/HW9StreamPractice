package com.cursor.streamPractice.users;

import java.util.Date;

public class User {
    private String email;
    private Date loginDate;
    private Team team;

    User(String email, Date loginDate, Team team){
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    String getEmail(){
        return email;
    }

    Date getLoginDate(){
        return loginDate;
    }

    Team getTeam(){
        return team;
    }
    public String toString(){
        return email+" "+loginDate.toString()+team.toString();
    }

}
