package com.livecron.ventana.alerta;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VentanaAlerta extends Stage {

    public VentanaAlerta() {
        inicializarComponents();
    }

    private void inicializarComponents() {
        initModality(Modality.APPLICATION_MODAL);
        setTitle("Ventana de Alerta");

        Label label = new Label();
        label.setText("Esta es una prueba texto");

        Button botonCerrar = new Button("Cerrar ventanta");
        botonCerrar.setOnAction(event -> close());

        VBox cajaVerticalLayout = new VBox(10);
        cajaVerticalLayout.getChildren().addAll(label, botonCerrar);
        cajaVerticalLayout.setAlignment(Pos.CENTER);

        setScene(new Scene(cajaVerticalLayout, 300, 250));
        show();
    }

}
