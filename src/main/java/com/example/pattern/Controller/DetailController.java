package com.example.pattern.Controller;

import com.example.pattern.Klant;
import com.example.pattern.Medewerker;
import com.example.pattern.model.Product;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.example.pattern.Main;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class DetailController {
    @FXML
    private Label merkLabel,huurprijsLabel ,verzekeringLabel,klantLabel,medewerkerLabel,totaleHuurprijsLabel;
    @FXML
    private Button retourButton;
    @FXML
    private CheckBox verzekerenCheckbox;

    @FXML
    private TextField klantNaamTextField;
    @FXML
    private Button verhuurButton;

    private Product product;

    private Medewerker medewerker;

    @FXML
    public void initialize() {
        product = Main.getProgram().getSelectedProduct();
        merkLabel.setText(product.getMerk());
        huurprijsLabel.setText(String.valueOf(product.getHuurPrijs()));

        // ... Vul de rest van de labels en velden in op basis van de product informatie

        retourButton.setOnAction(event -> {
            // Beëindig de verhuur van het product
            product.setKlant(null);
            product.setMedewerker(null);
            // Verwijder mogelijk andere gegevens gerelateerd aan de verhuur
            // ...

            // Update de UI
            klantLabel.setText(null);
            medewerkerLabel.setText(null);
            retourButton.setDisable(true);
            verzekerenCheckbox.setDisable(false);
            klantNaamTextField.setDisable(false);
            verhuurButton.setDisable(false);
        });

        verzekerenCheckbox.setOnAction(event -> {
            // Update de totale huurprijs op basis van de verzekering status
            if (verzekerenCheckbox.isSelected()) {
                double totaleHuurprijs = product.getHuurPrijs() + product.getVerzekeringPrijs();
                totaleHuurprijsLabel.setText(String.valueOf(totaleHuurprijs));
            } else {
                totaleHuurprijsLabel.setText(String.valueOf(product.getHuurPrijs()));
            }
        });

        verhuurButton.setOnAction(event -> {
            // Verhuur het product
            String klantNaam = klantNaamTextField.getText();
            if (!klantNaam.isBlank()) {
                Klant nieuweKlant = new Klant(klantNaam);
                product.setKlant(nieuweKlant);

                // Voeg hier ook een nieuwe medewerker toe aan het product, als dat nodig is
                // ...

                // Update de UI
                klantLabel.setText(nieuweKlant.getNaam());
                // Update ook het label van de medewerker, als dat nodig is
                // ...
                retourButton.setDisable(false);
                verzekerenCheckbox.setDisable(true);
                klantNaamTextField.setDisable(true);
                verhuurButton.setDisable(true);
            }
        });
        retourButton.setOnAction(event -> {
            // Beëindig de verhuur van het product
            product.setKlant(null);
            product.setMedewerker(null);
            // Verwijder mogelijk andere gegevens gerelateerd aan de verhuur
            // ...

            // Update de UI
            klantLabel.setText(null);
            medewerkerLabel.setText(null);
            retourButton.setDisable(true);
            verzekerenCheckbox.setDisable(false);
            klantNaamTextField.setDisable(false);
            verhuurButton.setDisable(false);
        });

        verzekerenCheckbox.setOnAction(event -> {
            // Update de totale huurprijs op basis van de verzekering status
            if (verzekerenCheckbox.isSelected()) {
                double totaleHuurprijs = product.getHuurPrijs() + product.getVerzekeringPrijs();
                totaleHuurprijsLabel.setText(String.valueOf(totaleHuurprijs));
            } else {
                totaleHuurprijsLabel.setText(String.valueOf(product.getHuurPrijs()));
            }
        });

        verhuurButton.setOnAction(event -> {
            // Verhuur het product
            String klantNaam = klantNaamTextField.getText();
            if (!klantNaam.isBlank()) {
                Klant nieuweKlant = new Klant(klantNaam);
                product.setKlant(nieuweKlant);

                // Voeg hier ook een nieuwe medewerker toe aan het product, als dat nodig is
                // ...

                // Update de UI
                klantLabel.setText(nieuweKlant.getNaam());
                // Update ook het label van de medewerker, als dat nodig is
                // ...
                retourButton.setDisable(false);
                verzekerenCheckbox.setDisable(true);
                klantNaamTextField.setDisable(true);
                verhuurButton.setDisable(true);
            }
        });

    }

    public void setProduct(Product product) {
        this.product = product;

        // Update de UI
        updateUI();

        // Voeg de medewerker toe als observer
        product.addObserver(medewerker);
    }

    private void updateUI() {
        merkLabel.setText(product.getMerk());

        if (product.getKlant() != null) {
            klantLabel.setText(product.getKlant().getNaam());
            verhuurButton.setVisible(false);
            retourButton.setVisible(true);
        } else {
            klantLabel.setText("N/A");
            verhuurButton.setVisible(true);
            retourButton.setVisible(false);
        }

        if (product.getMedewerker() != null) {
            medewerkerLabel.setText(product.getMedewerker().getUsername());
        } else {
            medewerkerLabel.setText("N/A");
        }

        verzekerenCheckbox.setSelected(false);
        huurprijsLabel.setText(String.valueOf(product.getHuurPrijs()));
    }



}


