package org.example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
        import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
        import javafx.stage.Stage;
/*
public class paginaPrimar{
    public void afisarePagina() {
        Stage stage = new Stage();

        VBox primarPage = new VBox(10);
        primarPage.getChildren().add(new Button("Pagina Primar"));

        Scene scene = new Scene(primarPage, 500, 300);
        stage.setScene(scene);
        stage.show();
    }

}*/

public class paginaPrimar{
    public static void afisarePaginaPrimar(Stage primaryStage,VBox primarPage ) {
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


}