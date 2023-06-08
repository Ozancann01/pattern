package com.example.pattern;

import com.example.pattern.observer.Observer;

public class Medewerker implements Observer {
    private String username;
    private String wachtwoord;

    public Medewerker(String username, String wachtwoord) {
        this.username = username;
        this.wachtwoord = wachtwoord;
    }

    @Override
    public void update() {
        System.out.println("Het product is verhuurd!");
    }
}