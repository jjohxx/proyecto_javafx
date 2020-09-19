package com.livecron.ventana.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxEjemplo extends Application {

    private Stage ventanaPrincipal;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ventanaPrincipal = primaryStage;
        ventanaPrincipal.setTitle("Choice Box Ejemplo");

        ChoiceBox<String> cajaSelecion = new ChoiceBox<>();
        cajaSelecion.getItems().add("Manzanas");
        cajaSelecion.getItems().add("Bananas");
        cajaSelecion.getItems().addAll("Frutilla", "Sandia", "Naranja",  "Piña", "Mandarina", "Pera");
        cajaSelecion.setValue("Bananas");
        cajaSelecion.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue)
                        -> System.out.println(" Valor anterior: " + oldValue + "\nValor nuevo :" + newValue));

        Button button = new Button("Click aqui!");
        button.setOnAction(event -> imprimirFrutaSeleccionada(cajaSelecion));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(cajaSelecion, button);

        ventanaPrincipal.setScene(new Scene(layout, 300, 250));
        ventanaPrincipal.show();
    }

    private void imprimirFrutaSeleccionada(ChoiceBox<String> cajaSelecion) {
        String fruta = cajaSelecion.getValue();
        System.out.println(" Fruta seleciona : " + fruta);
    }
}
