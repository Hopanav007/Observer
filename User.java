package com.company;

import java.util.List;

public class User implements Observer{

    private String login;

    public User(String login){
        this.login = login;
    }

    @Override
    public void update(List<String> albums) {
        System.out.println("Dear " + login + "\n We have a new album for you:)\n"+ albums +"\n" );
    }
}
