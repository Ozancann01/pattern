package com.example.pattern.Controller;

import com.example.pattern.Factory.ProductFactory;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import com.example.pattern.model.*;
import java.util.List;

public class ToevoegenController {

    @FXML
    private TextField merkTextField;

    @FXML
    private TextField extraInfoTextField;

    @FXML
    private ComboBox<String> typeComboBox;

    private ProductFactory productFactory;
   private List<Product> producten;  // Dit is je lijst van producten

    public ToevoegenController() {

    }

    @FXML
    public void initialize() {
        // Hier vul je de mogelijke types van producten in
        typeComboBox.getItems().addAll("Boormachine", "PersonenAuto", "VrachtAuto");
    }

    @FXML
    public void toevoegenProduct() {
        // Haal de gegevens op uit de velden
        String merk = merkTextField.getText();
        String type = typeComboBox.getValue();  // Haal de geselecteerde waarde op uit de combobox
        String extraInfo = extraInfoTextField.getText();

        // Gebruik de factory om het product te maken
     //   Product newProduct = productFactory.createProduct(type, merk, extraInfo);

        // Voeg het nieuwe product toe aan het assortiment
      //  producten.add(newProduct);
    }


}
