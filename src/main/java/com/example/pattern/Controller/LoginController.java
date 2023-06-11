package com.example.pattern.Controller;

import com.example.pattern.Main;
import com.example.pattern.Medewerker;
import com.example.pattern.emums.Screens;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class LoginController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    public void initialize() {
        // you can add code here to be executed once your UI components are ready
        loginButton.setOnAction(e -> loginButtonAction());
    }


    private Medewerker medewerker = new Medewerker("admin", "password");

    @FXML
    private void loginButtonAction() {
        String inputUsername = usernameField.getText();
        String inputPassword = passwordField.getText();

        if (inputUsername.equals(medewerker.getUsername()) && inputPassword.equals(medewerker.getWachtwoord())) {
            // Login successful
            Main.getProgram().switchScreen(Screens.MENU);

        } else {
            // Login failed
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Invalid username or password!");
            alert.showAndWait();
        }
    }
}

