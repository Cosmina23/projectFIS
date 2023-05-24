package org.example;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.application.Application;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import java.awt.*;
import java.util.Collection;

public class adaugaAnunt {
    public static void paginaAdaugaAnunt(Stage primaryStage, StackPane adaugaAnunt){
        primaryStage.setTitle("ADAUGA ANUNT");
        primaryStage.show();


        /*Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.getItems().addAll(openItem, saveItem, exitItem);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);
        adaugaAnunt.getChildren().add(menuBar);
        */
        //cand se apasa butonul de anunturi se afiseaza anunturile publicate de primar

        VBox menuBox = new VBox();
        menuBox.setAlignment(Pos.TOP_CENTER);
        menuBox.setSpacing(10);

        Button anunturiButton = new Button("Anunturi");
        anunturiButton.setStyle("-fx-background-color: #5F75E1; -fx-text-fill: #FFFFFF; -fx-font-size: 18px;");

        menuBox.getChildren().add(anunturiButton);
        adaugaAnunt.getChildren().add(menuBox);

        // Adăugarea label-ului în StackPane
        //adaugaAnunt.getChildren().add(adauga);
        Scene scene = new Scene(adaugaAnunt, 500, 500);
        primaryStage.setScene(scene);

    }
}
