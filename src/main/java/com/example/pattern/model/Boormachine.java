package com.example.pattern.model;

public class Boormachine extends Product {
    private String type;

    public Boormachine(String merk, String type) {
        super(merk);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public double getHuurPrijs() {
        return 5.0; // Huurprijs is 5 euro per dag
    }

    @Override
    public double getVerzekeringPrijs() {
        return 1.0; // Verzekering is 1 euro per dag
    }
}