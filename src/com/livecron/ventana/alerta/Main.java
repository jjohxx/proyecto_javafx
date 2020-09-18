package com.livecron.ventana.alerta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage ventanaPrincipal;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ventanaPrincipal = primaryStage;
        ventanaPrincipal.setTitle("Ventana principal");

        Button button = new Button("Click aqui");
        button.setOnAction(event -> new VentanaAlerta());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        ventanaPrincipal.setScene(new Scene(layout, 500, 450));
        ventanaPrincipal.show();
    }
}
