package com.example.pattern;

import com.example.pattern.model.Product;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Program program;



    public static Program getProgram() {return program;}
    @Override
    public void start(Stage stage) throws Exception {


        program = new Program(stage);
        program.startProgram();
    }



    public static void main(String[] args) {
        launch();
    }
}