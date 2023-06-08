package com.example.pattern.model;
public class PersonenAuto extends Product {
    private double gewicht;
    private double motorinhoud;

    public PersonenAuto(String merk, double gewicht, double motorinhoud) {
        super(merk);
        this.gewicht = gewicht;
        this.motorinhoud = motorinhoud;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getMotorinhoud() {
        return motorinhoud;
    }

    @Override
    public double getHuurPrijs() {
        return 50.0; // Huurprijs is 50 euro per dag
    }

    @Override
    public double getVerzekeringPrijs() {
        return 0.01 * motorinhoud; // Verzekering is 0,01 euro per cc motorinhoud per dag
    }
}