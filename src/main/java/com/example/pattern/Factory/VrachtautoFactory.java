package com.example.pattern.Factory;

import com.example.pattern.model.Product;
import com.example.pattern.model.VrachtAuto;

public class VrachtautoFactory implements ProductFactory {
    @Override
    public Product createProduct(String type, String merk, String extraInfo) {
        // Extra info is het laadvermogen en motorinhoud voor Vrachtauto
        String[] info = extraInfo.split(","); //Assume the format is "laadvermogen,motorinhoud"
        double laadvermogen = Double.parseDouble(info[0]);
        double motorinhoud = Double.parseDouble(info[1]);
        return new VrachtAuto(merk,laadvermogen, motorinhoud);
    }
}