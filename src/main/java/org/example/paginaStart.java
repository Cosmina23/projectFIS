package org.example;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class paginaStart extends Application {
    private Stage primaryStage;
    private VBox primarPage;
    private VBox cetateanPage;
    public static void launchApp(String[] args){
        launch(args);
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        Button primarButton = new Button("Primar");
        Button cetateanButton = new Button("Cetatean");

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(primarButton, cetateanButton);

        Scene scene = new Scene(vbox, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();

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