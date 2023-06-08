package com.example.pattern.model;

public class VrachtAuto extends Product{

    private double laadvermogen;
    private  double motorinhoud;

    public VrachtAuto(String merk, double laadvermogen, double motorinhoud) {
        super(merk);
        this.laadvermogen = laadvermogen;
        this.motorinhoud = motorinhoud;
    }

    public double getLaadvermogen() {
        return laadvermogen;
    }

    public double getMotorinhoud() {
        return motorinhoud;
    }


    @Override
    public double getHuurPrijs() {
        return 0.10 * laadvermogen;
    }

    @Override
    public double getVerzekeringPrijs() {
        return 0.01 * motorinhoud;
    }
}
