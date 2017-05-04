package com.example.egonzalez.myapplication.backend;

import com.example.Joker;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {
    private Joker joker;
    public MyBean(){
        joker = new Joker();
    }
    public String getData() {
        return joker.getJoke();
    }

}