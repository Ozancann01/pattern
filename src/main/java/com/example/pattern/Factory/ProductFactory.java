package com.example.pattern.Factory;

import com.example.pattern.model.Product;

public interface ProductFactory {
    Product createProduct(String type, String merk, String extraInfo);
}
