package org.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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

        Scene scene = new Scene(vbox, 500, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

        primarPage = new VBox(10);
        primarPage.getChildren().add(new Button("Pagina Primar"));

        cetateanPage = new VBox(10);
        cetateanPage.getChildren().add(new Button("Pagina Cetățean"));

        primarButton.setOnAction(e -> {
            afisarePaginaPrimar();
        });

        cetateanButton.setOnAction(e -> {
            afisarePaginaCetatean();
        });
    }

    private void afisarePaginaPrimar() {
        primaryStage.setTitle("Pagina Primar");

        // Creare interfață de autentificare
        GridPane loginGrid = new GridPane();
        loginGrid.setAlignment(Pos.CENTER);
        loginGrid.setHgap(10);
        loginGrid.setVgap(10);
        loginGrid.setPadding(new Insets(25));

        Label numeLabel = new Label("Nume:");
        TextField numeField = new TextField();
        Label prenumeLabel = new Label("Prenume:");
        TextField prenumeField = new TextField();

        loginGrid.add(numeLabel, 0, 0);
        loginGrid.add(numeField, 1, 0);
        loginGrid.add(prenumeLabel, 0, 1);
        loginGrid.add(prenumeField, 1, 1);

        Button loginButton = new Button("Autentificare");
        loginButton.setOnAction(e -> {
            String nume = numeField.getText();
            String prenume = prenumeField.getText();
            // Verificarea autentificării și alte acțiuni specifice primarului
            // ...

            // După autentificare, puteți afișa pagina primarului
            primaryStage.getScene().setRoot(primarPage);
        });

        loginGrid.add(loginButton, 1, 2);

        Scene loginScene = new Scene(loginGrid, 500, 300);
        primaryStage.setScene(loginScene);
    }

    private void afisarePaginaCetatean() {
        primaryStage.setTitle("Pagina Cetățean");
        primaryStage.getScene().setRoot(cetateanPage);
        // Creare interfață de autentificare
        GridPane loginGrid = new GridPane();
        loginGrid.setAlignment(Pos.CENTER);
        loginGrid.setHgap(10);
        loginGrid.setVgap(10);
        loginGrid.setPadding(new Insets(25));

        Label numeLabel = new Label("Nume:");
        TextField numeField = new TextField();
        Label prenumeLabel = new Label("Prenume:");
        TextField prenumeField = new TextField();

        loginGrid.add(numeLabel, 0, 0);
        loginGrid.add(numeField, 1, 0);
        loginGrid.add(prenumeLabel, 0, 1);
        loginGrid.add(prenumeField, 1, 1);

        Button loginButton = new Button("Autentificare");
        loginButton.setOnAction(e -> {
            String nume = numeField.getText();
            String prenume = prenumeField.getText();
            // Verificarea autentificării și alte acțiuni specifice cetățeanului
            // ...

            // După autentificare, puteți afișa pagina cetățeanului
            primaryStage.getScene().setRoot(cetateanPage);
        });

        loginGrid.add(loginButton, 1, 2);

        Scene loginScene = new Scene(loginGrid, 500, 300);
        primaryStage.setScene(loginScene);
    }


}