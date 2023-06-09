package com.example.pattern;


import com.example.pattern.emums.Screens;
import com.example.pattern.model.Product;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Program {

    private Stage primaryStage;
    private Screens currentScreen;
    private Scene scene;
    private Product selectedProduct;

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product product) {
        this.selectedProduct = product;
    }

    private Medewerker medewerker;


    public Program(Stage primaryStage) {
        this.primaryStage = primaryStage;

    }


    public Medewerker getCurrentUser() {return this.medewerker;}
    public void setCurrentUser(Medewerker medewerker) {
        if(medewerker == null) return;
        this.medewerker = medewerker;
    }




    public void startProgram() throws IOException {
        this.primaryStage.setTitle("Pattern Opdracht");


        new File("saved").mkdir();


        this.switchScreen(Screens.LOGIN);
        this.primaryStage.show();
    }

    public void switchScreen(Screens screen) {
        this.currentScreen = screen;



        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/screens/" + screen.getFileName() + ".fxml"));
            this.scene = new Scene(fxmlLoader.load());
            this.applyCSS(this.currentScreen);
            this.primaryStage.setScene(scene);
            bindWindowSize();
        } catch (Exception ex) {
            System.err.println("Could not load screen: " + screen + " or " + screen.getFileName() + ".fxml or " + screen.getFileName() + ".css.");
            ex.printStackTrace();
        }
    }



    private void bindWindowSize() {
        Screen screen = Screen.getPrimary();
        Rectangle2D visualBounds = screen.getVisualBounds();
        this.primaryStage.setMaxHeight(visualBounds.getHeight());
        this.primaryStage.setMaxWidth(visualBounds.getWidth());

        this.primaryStage.minWidthProperty().bind(scene.widthProperty());
        this.primaryStage.minHeightProperty().bind(scene.heightProperty());




    }

    private void applyCSS(Screens screen) {

        String css = getClass().getResource("/css/" + screen.getFileName() + ".css").toExternalForm();


        this.scene.getStylesheets().clear();
        this.scene.getStylesheets().addAll( css);

    }

}

