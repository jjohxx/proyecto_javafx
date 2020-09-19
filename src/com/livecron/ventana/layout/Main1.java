package com.livecron.ventana.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main1 extends Application {

    private Stage ventanaPrincipal;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ventanaPrincipal = primaryStage;
        ventanaPrincipal.setTitle("Layouts anidados");

        HBox menuSuperior = new HBox();
        Button buttonA = new Button("A");
        Button buttonB = new Button("B");
        Button buttonC = new Button("C");
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        menuSuperior.getChildren().addAll(buttonA, buttonB, buttonC, buttonD, buttonE);

        VBox menuIzq = new VBox();
        Button buttonF = new Button("F");
        Button buttonG = new Button("G");
        Button buttonH = new Button("H");
        Button buttonI = new Button("I");
        Button buttonJ = new Button("J");
        menuIzq.getChildren().addAll(buttonF, buttonG, buttonH, buttonI, buttonJ);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(menuSuperior);
        borderPane.setRight(menuIzq);

        Scene contenedor = new Scene(borderPane, 500, 500);
        ventanaPrincipal.setScene(contenedor);
        ventanaPrincipal.show();
    }
}
