package com.livecron.ventana.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneEjemplo extends Application {

    private Stage ventanaPrincipal;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ventanaPrincipal = primaryStage;
        ventanaPrincipal.setTitle("GridPane Ejemplo");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(8);
        grid.setVgap(10);

        Label nombreDeUsuarioLabel = new Label("Nombre de usuario :");
        GridPane.setConstraints(nombreDeUsuarioLabel, 0, 0);

        TextField nombreDeUsuarioEntrada = new TextField("Anonimo");
        GridPane.setConstraints(nombreDeUsuarioEntrada, 1, 0);

        Label contraseniaLabel = new Label("Contraseña :");
        GridPane.setConstraints(contraseniaLabel, 0, 1);

        PasswordField contraseniaEntrada = new PasswordField();
        GridPane.setConstraints(contraseniaEntrada, 1, 1);

        Button botonIngresar = new Button("Ingresar");
        GridPane.setConstraints(botonIngresar, 1, 2);

        grid.getChildren().addAll(nombreDeUsuarioLabel, nombreDeUsuarioEntrada, contraseniaLabel,
                contraseniaEntrada, botonIngresar);

        ventanaPrincipal.setScene(new Scene(grid, 400, 400));
        ventanaPrincipal.show();
    }
}
