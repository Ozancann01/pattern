package com.example.pattern.Controller;

import com.example.pattern.Main;
import com.example.pattern.emums.Screens;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ListCell;
import com.example.pattern.model.*;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

public class OverviewController {

    @FXML
    private ListView<Product> productListView;
    @FXML
    private Button detailButton;


    @FXML
    public void initialize() {

        // Load the products from wherever you're storing them
        ObservableList<Product> products = FXCollections.observableArrayList();

        // Create some products
        Boormachine boormachine = new Boormachine("mata","3");
        PersonenAuto personenAuto = new PersonenAuto("mata",302.5,805.9);
        VrachtAuto vrachtauto = new VrachtAuto("lata",508.6,708.6);

        // Add the products to the ObservableList
        products.add(boormachine);
        products.add(personenAuto);
        products.add(vrachtauto);

        // Set a cell factory to display the products in the list view
        productListView.setCellFactory(new Callback<ListView<Product>, ListCell<Product>>() {
            @Override
            public ListCell<Product> call(ListView<Product> param) {
                return new ListCell<Product>() {
                    @Override
                    protected void updateItem(Product item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null) {
                            setText(item.getMerk() + " - " + (item.getKlant() == null ? "Available" : "Not Available"));
                        } else {
                            setText(null);
                        }
                    }
                };
            }
        });

        // Set the items of the list view to be the ObservableList of products
        productListView.setItems(products);


    }


    @FXML
    private void handleDetailButton() {
        Product selectedProduct = productListView.getSelectionModel().getSelectedItem();
        if (selectedProduct != null) {
            openDetailWindow(selectedProduct);
        }
    }



    private void openDetailWindow(Product product) {
        // Save the selected product somewhere it can be accessed by the DetailController
        Main.getProgram().setSelectedProduct(product);

        // Switch to the detail screen
        Main.getProgram().switchScreen(Screens.DETAIL);
    }

}
