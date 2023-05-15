package org.example;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class paginaStart{
    //private Stage primaryStage;
    private static VBox primarPage;
    private static VBox cetateanPage;
    /*
    public static void launchApp(String[] args){
        launch(args);
    }


    public static void main(String[] args) {
        launch(args);
    }
*/

    public static void afisareCreareCont (Stage primaryStage, VBox creeazaCont) {
        primaryStage.setTitle("Creeaza cont");

        Button primarButton = new Button("Primar");
        Button cetateanButton = new Button("Cetatean");

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(primarButton, cetateanButton);



        primarPage = new VBox(10);
        primarPage.getChildren().add(new Button("Pagina Primar"));

        cetateanPage = new VBox(10);
        cetateanPage.getChildren().add(new Button("Pagina Cetățean"));

        primarButton.setOnAction(e -> {
            creeazaContPrimar.afisarePaginaPrimar(primaryStage, primarPage);
        });

        cetateanButton.setOnAction(e -> {
            creeazaContCetatean.afisarePaginaCetatean(primaryStage, cetateanPage);
        });
    }
}