package org.example;

import javafx.scene.Scene;
        import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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

    private TextField userIdField ;

    private PasswordField passwordField ;

    private void login() {
        String userId = userIdField.getText();
        String password = passwordField.getText();

        // etc...
    }
    public void afisare(){
        this.login();
    }
}