package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class paginaPrincipala extends Application {
    private Stage primaryStage;
    private VBox creeazaCont;
    private VBox contulMeu;

    public static void launchApp(String[] args){
        launch(args);
    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;

        Button creatButton = new Button("Contul meu");
        Button creeazaButton = new Button("Creeaza cont");

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(creatButton, creeazaButton);

        Scene scene = new Scene(vbox, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();

        creeazaCont = new VBox(10);
        creeazaCont.getChildren().add(new Button("Creeaza Cont"));

        contulMeu = new VBox(10);
        contulMeu.getChildren().add(new Button("Contul meu"));

        creeazaButton.setOnAction(e -> {
            paginaStart.afisareCreareCont(primaryStage, creeazaCont);
        });

    }
}
