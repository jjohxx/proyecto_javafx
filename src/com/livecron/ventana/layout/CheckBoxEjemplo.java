package com.livecron.ventana.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxEjemplo extends Application {

    private Stage ventanaPrincipal;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ventanaPrincipal = primaryStage;
        ventanaPrincipal.setTitle("Check Box ejemplos");

        CheckBox box1 = new CheckBox("Red Bull");
        CheckBox box2 = new CheckBox("Monster Energy");
        CheckBox box3 = new CheckBox("Chocolate");
        CheckBox box4 = new CheckBox("Gomitas");
        CheckBox box5 = new CheckBox("Papas fritas");
        box2.setSelected(true);

        Button button = new Button("Aplicar orden");
        button.setOnAction(event -> manejarOpciones(box1, box2, box3, box4, box5));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, box3, box4, box5, button);

        ventanaPrincipal.setScene(new Scene(layout, 300, 250));
        ventanaPrincipal.show();
    }

    private void manejarOpciones(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4, CheckBox box5) {
        String mensaje = "Aplicar orden\n";

        if (box1.isSelected()) {
            mensaje = mensaje + box1.getText() + "\n";
        }

        if (box2.isSelected()) {
            mensaje = mensaje + box2.getText() + "\n";
        }

        if (box3.isSelected()) {
            mensaje = mensaje + box3.getText() + "\n";
        }

        if (box4.isSelected()) {
            mensaje = mensaje + box4.getText() + "\n";
        }

        if (box5.isSelected()) {
            mensaje = mensaje + box5.getText() + "\n";
        }

        System.out.println(mensaje);
    }

}
