package com.livecron.ventana.salida;

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
        ventanaPrincipal.setTitle("Ventana para confirmacion de salida");
        ventanaPrincipal.setOnCloseRequest(event -> {
            event.consume();
            cerrarAplicacion();
        });

        Button button = new Button("Mostrar ventana de salir");
        button.setOnAction(event -> cerrarAplicacion());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        ventanaPrincipal.setScene(new Scene(layout, 600, 400));
        ventanaPrincipal.show();
    }

    private void cerrarAplicacion() {
        boolean respuesta = VentanaConfirmacion.mostrar("Estas seguro de querer salir de la ventana?");
        System.out.println("Respuesta : " + respuesta);

        if (respuesta) {
            ventanaPrincipal.close();
        }
    }
}
