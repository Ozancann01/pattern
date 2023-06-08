package com.example.pattern.model;
import com.example.pattern.Klant;
import com.example.pattern.Medewerker;
import com.example.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    private String merk;
    private Klant klant;
    private Medewerker medewerker;
    private double huurPrijs;
    private List<Observer> observers = new ArrayList<>();

    public Product(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
        notifyObservers();
    }

    public Medewerker getMedewerker() {
        return medewerker;
    }

    public void setMedewerker(Medewerker medewerker) {
        this.medewerker = medewerker;
        notifyObservers();
    }

    public abstract double getHuurPrijs();

    public abstract double getVerzekeringPrijs();

    public double berekenVerzekering(boolean verzekeren) {
        if (verzekeren) {
            return getVerzekeringPrijs();
        }
        return 0.0;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
