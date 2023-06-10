package com.example.pattern.Controller;

import com.example.pattern.Main;
import com.example.pattern.emums.Screens;
import javafx.application.Platform;
import javafx.fxml.FXML;

public class MenuController {
    @FXML
    private void overviewButtonClicked() {
        // Hier kan je de logica implementeren om naar het overzichtvenster te gaan
        Main.getProgram().switchScreen(Screens.OVERVIEW);
    }

    @FXML
    private void manageButtonClicked() {
        // Hier kan je de logica implementeren om naar het beheervenster te gaan
        Main.getProgram().switchScreen(Screens.BEHEER);
    }

    @FXML
    private void logoutButtonClicked() {
        // Hier kan je de logica implementeren om uit te loggen
        Platform.exit();
    }
}
