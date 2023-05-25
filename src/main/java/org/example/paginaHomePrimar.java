package org.example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class paginaHomePrimar {
    private VBox menuBox;
    private Button anunturiButton;
    private Button sondajeButton;
    private Scene scene;
    public void paginaAdaugaAnunt(Stage primaryStage, StackPane adaugaAnunt){
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

        menuBox = new VBox();
        menuBox.setPadding(new Insets(5,5,5,5));
       //menuBox.setAlignment(Pos.TOP_CENTER);
        menuBox.setSpacing(10);

        anunturiButton = new Button("Anunturi");
        sondajeButton = new Button("Sondaje");
        anunturiButton.setStyle("-fx-background-color: #5F75E1; -fx-text-fill: #FFFFFF; -fx-font-size: 18px;");
        sondajeButton.setStyle("-fx-background-color: #9F75E2; -fx-text-fill: #FFFFFF; -fx-font-size: 18px;");

        menuBox.getChildren().addAll(anunturiButton,sondajeButton);
        menuBox.setSpacing(20);
        adaugaAnunt = new StackPane(new HBox(anunturiButton,sondajeButton));

        scene = new Scene(adaugaAnunt, 500, 500);
        primaryStage.setScene(scene);

    }
}
