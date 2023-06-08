package com.example.pattern.Controller;

import com.example.pattern.model.Product;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class OverviewController {
    @FXML
    private ListView<Product> productListView;

    @FXML
    private void initialize() {
        // Hier kan je de productListView initialiseren met de lijst van producten
    }

    @FXML
    private void productClicked() {
        // Hier kan je de logica implementeren om naar het detailvenster te gaan voor het geselecteerde product
    }
}
