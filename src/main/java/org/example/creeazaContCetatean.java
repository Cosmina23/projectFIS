package org.example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class creeazaContCetatean {

    public static void afisarePaginaCetatean(Stage primaryStage, VBox cetateanPage) {
        primaryStage.setTitle("Pagina Cetățean");
        //primaryStage.getScene().setRoot(cetateanPage);
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
        Label orasLabel = new Label("Oras/Sat:");
        TextField orasField = new TextField();
        Label telefonLabel = new Label("Telefon:");
        TextField telefonField = new TextField();
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Parola:");
        TextField passwordField = new TextField();
        Label confirmpassLabel = new Label("Confirma parola:");
        TextField confirmpassField = new TextField();

        loginGrid.add(numeLabel, 0, 0);
        loginGrid.add(numeField, 1, 0);
        loginGrid.add(prenumeLabel, 0, 1);
        loginGrid.add(prenumeField, 1, 1);
        loginGrid.add(orasLabel,0,2);
        loginGrid.add(orasField,1,2);
        loginGrid.add(telefonLabel,0,3);
        loginGrid.add(telefonField,1,3);
        loginGrid.add(emailLabel,0,4);
        loginGrid.add(emailField,1,4);
        loginGrid.add(usernameLabel,0,5);
        loginGrid.add(usernameField,1,5);
        loginGrid.add(passwordLabel,0,6);
        loginGrid.add(passwordField,1,6);
        loginGrid.add(confirmpassLabel,0,7);
        loginGrid.add(confirmpassField,1,7);

        Button loginButton = new Button("Autentificare");
        loginButton.setOnAction(e -> {
            String nume = numeField.getText();
            String prenume = prenumeField.getText();
            String oras = orasField.getText();
            String telefon = telefonField.getText();
            String email = emailField.getText();
            String username = usernameField.getText();
            String password = passwordField.getText();
            String confirmpass = confirmpassField.getText();
            // Verificarea autentificării și alte acțiuni specifice cetățeanului
            // ...

            // După autentificare, puteți afișa pagina cetățeanului
            primaryStage.getScene().setRoot(cetateanPage);
        });

        loginGrid.add(loginButton, 1, 9);

        Scene loginScene = new Scene(loginGrid, 500, 500);
        primaryStage.setScene(loginScene);
    }
}
