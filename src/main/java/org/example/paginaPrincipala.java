package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.DateConectare.*;

public class paginaPrincipala extends Application {
    private Stage primaryStage;
    private VBox creeazaCont;
    private VBox contulMeu;
    private static dateConturi dc = new dateConturi();
    private static paginaCreazaCont paginaCreazaCont;

    public static void adaugaContPrimar(datePrimar p){
        dc.adaugaParimar(p);
    }
    public static void adaugaContCetatean(dateCetatean c){
        dc.adaugaCetatean(c);
    }

    public static boolean verifyP(datePrimar p){
        if(
                p.getNume() != null && p.getPrenume() != null && p.getEmail() != null && p.getOras()!= null && p.getUsername()!=null &&
                        p.getTelefon() != null && p.getCodPrimar() != null && p.getParola()!=null
        )
        return dc.verificaCredentialePrimar(p);
        else return false;
    }

    public static boolean verifyC(dateCetatean c){
        return dc.verificaCredentialeCedatean(c);
    }


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

        paginaCreazaCont = new paginaCreazaCont();
        creeazaButton.setOnAction(e -> {
            paginaCreazaCont.afisareCreareCont(primaryStage,creeazaCont);
        });
    }

}
