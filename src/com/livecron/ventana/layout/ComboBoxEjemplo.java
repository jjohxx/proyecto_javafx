package com.livecron.ventana.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxEjemplo extends Application {

    private Stage ventanaPrincipal;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ventanaPrincipal = primaryStage;
        ventanaPrincipal.setTitle("Combo Box Ejemplo");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Titanic",
                "La vida es bella",
                "Yo antes de ti",
                "Facebook",
                "Simpson la pelila"
        );
        comboBox.setPromptText("Cual es tu pelicula favorita?");
        comboBox.setOnAction(event -> System.out.println("Usuario seleciono la pelicula: " + comboBox.getValue()));
        comboBox.setEditable(true);

        Button button = new Button("Click aqui!");
        button.setOnAction(event -> System.out.println("Usuario seleciono la pelicula: " + comboBox.getValue()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        ventanaPrincipal.setScene(new Scene(layout, 300, 250));
        ventanaPrincipal.show();
    }

}
