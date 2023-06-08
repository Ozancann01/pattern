package com.example.pattern.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void loginButtonClicked() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Hier kan je de inloglogica implementeren, zoals het controleren van de gebruikersnaam en het wachtwoord
        // en het navigeren naar het hoofdmenu als de inloggegevens correct zijn
    }
}
