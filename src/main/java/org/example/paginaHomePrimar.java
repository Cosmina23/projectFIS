package org.example;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class paginaHomePrimar {
    private VBox vBox;
    private Scene scene;
    private Menu menuAnunt,menuSondaj;
    private MenuBar menuBar;

    private MenuItem vizualizareAnunt,adaugaAnunt,stergeAnunt;
    private MenuItem vizualizareSondaj,adaugaSondaj,stergeSondaj;
    private TextField anuntTextField;
    private Button publicaAnuntButton;
    BorderPane borderPane = new BorderPane();
    public void paginaAdaugaAnunt(Stage primaryStage, StackPane stackPane){
        primaryStage.setTitle("ADAUGA ANUNT");
        primaryStage.show();


        menuAnunt = new Menu("Anunturi");
        vizualizareAnunt = new MenuItem("Vizualizare Anunturi");
        adaugaAnunt = new MenuItem("Adauga Anunt");
        stergeAnunt = new MenuItem("Sterge Anunt");
        menuAnunt.getItems().addAll(vizualizareAnunt,adaugaAnunt, stergeAnunt);

        menuSondaj = new Menu("Sondaje");
        vizualizareSondaj = new MenuItem("Vizualizare Sondaje");
        adaugaSondaj = new MenuItem("Adauga Sondaj");
        stergeSondaj = new MenuItem("Sterge Sondaj");
        menuSondaj.getItems().addAll(vizualizareSondaj,adaugaSondaj,stergeSondaj);

        menuBar = new MenuBar();
        menuBar.getMenus().addAll(menuAnunt,menuSondaj);
        vBox = new VBox();


        vizualizareAnunt.setStyle("-fx-background-color: #5F75E1; -fx-text-fill: #FFFFFF; -fx-font-size: 18px;");
        stergeAnunt.setStyle("-fx-background-color: #5F75E1; -fx-text-fill: #FFFFFF; -fx-font-size: 18px;");
        adaugaAnunt.setStyle("-fx-background-color: #5F75E1; -fx-text-fill: #FFFFFF; -fx-font-size: 18px;");

        vizualizareSondaj.setStyle("-fx-background-color: green; -fx-text-fill: #FFFFFF; -fx-font-size: 18px;");
        stergeSondaj.setStyle("-fx-background-color: green; -fx-text-fill: #FFFFFF; -fx-font-size: 18px;");
        adaugaSondaj.setStyle("-fx-background-color: green; -fx-text-fill: #FFFFFF; -fx-font-size: 18px;");

        vBox.getChildren().addAll(menuBar);
        vBox.setSpacing(20);
        stackPane = new StackPane(new HBox(menuBar));
        StackPane finalStackPane = stackPane;
        StackPane finalStackPane1 = stackPane;
        StackPane finalStackPane2 = stackPane;
        adaugaAnunt.setOnAction(event -> {
            finalStackPane2.getChildren().clear();

            // Crearea noilor elemente pentru adăugarea anunțului
            anuntTextField = new TextField();
            anuntTextField.setPromptText("Introdu anuntul...");
            publicaAnuntButton = new Button("Publica");

            VBox anuntLayout = new VBox(10);
            anuntLayout.getChildren().addAll(anuntTextField, publicaAnuntButton);

            VBox vbox = new VBox(10);
            vbox.getChildren().addAll(menuBar, anuntLayout);
            VBox.setVgrow(anuntLayout, Priority.ALWAYS);

            finalStackPane2.getChildren().add(vbox);
        });


        scene = new Scene(stackPane, 500, 500);
        primaryStage.setScene(scene);

    }
}
