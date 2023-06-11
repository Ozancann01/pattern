package com.example.pattern.Controller;

import com.example.pattern.Main;
import com.example.pattern.emums.Screens;
import javafx.fxml.FXML;

import javafx.scene.control.ListView;
import javafx.scene.control.Button;

public class BeheerController {

    public Button terugGaan;
    @FXML
    private ListView<String> productSoortenListView;

    @FXML
    private Button toevoegenButton;

    @FXML
    public void initialize() {
        // Voeg de productsoorten toe aan de listview
        productSoortenListView.getItems().addAll("Boormachine", "PersonenAuto", "VrachtAuto");
    }

    @FXML
    public void openToevoegenVenster() {
        Main.getProgram().switchScreen(Screens.TOEVOEGEN);
    }

    @FXML
    private void terugGaan() {

        Main.getProgram().switchScreen(Screens.MENU);
    }

}
