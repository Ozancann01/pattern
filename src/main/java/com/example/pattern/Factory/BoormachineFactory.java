package com.example.pattern.Factory;

import com.example.pattern.model.Boormachine;
import com.example.pattern.model.Product;

public class BoormachineFactory implements ProductFactory {
    @Override
    public Product createProduct(String type, String merk, String extraInfo) {
        // Extra info is het type voor Boormachine
        String boormachineType = extraInfo;
        return new Boormachine(boormachineType, merk);
    }
}