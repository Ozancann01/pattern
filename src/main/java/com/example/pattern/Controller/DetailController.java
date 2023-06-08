package com.example.pattern.Controller;

import com.example.pattern.model.Product;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DetailController {
    private Product product;

    @FXML
    private Label productNameLabel;

    @FXML
    private void initialize() {
        // Hier kan je de productNameLabel initialiseren met de naam van het product
    }
}
