package com.livecron.ventana.salida;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VentanaConfirmacion {

    private static boolean respuesta;

    public static boolean mostrar(String mensaje) {
        Stage ventana = new Stage();
        ventana.initModality(Modality.APPLICATION_MODAL);
        ventana.setTitle("Ventana de confirmacion de salida");
        ventana.setWidth(350);

        Label label = new Label(mensaje);
        Button botonSi = new Button("Si");
        Button botonNo = new Button("No");

        botonSi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                respuesta = true;
                ventana.close();
            }
        });

        botonNo.setOnAction(event -> {
            respuesta = false;
            ventana.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, botonSi, botonNo);
        layout.setAlignment(Pos.CENTER);

        ventana.setScene(new Scene(layout));
        ventana.showAndWait();

        return respuesta;
    }
}
