package com.example.pattern.Factory;

import com.example.pattern.model.PersonenAuto;
import com.example.pattern.model.Product;

public class PersonenautoFactory implements ProductFactory {
    @Override
    public Product createProduct(String type, String merk, String extraInfo) {
        // Extra info is de motorinhoud en gewicht voor Personenauto
        String[] info = extraInfo.split(","); //Assume the format is "motorinhoud,gewicht"
        double motorinhoud = Double.parseDouble(info[0]);
        double gewicht = Double.parseDouble(info[1]);
        return new PersonenAuto(merk,motorinhoud, gewicht);
    }
}
