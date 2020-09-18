package com.livecron;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tituto Ventana");

        Button button1 = new Button("Click aqui");
        Button button2 = new Button("Button 1");
        Button button3 = new Button("Button 2");
//        button.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        button1.setOnAction(event -> {
            System.out.println("Ingreso al button click aqui");
            System.out.println("Click aqui");
        });

        VBox layout = new VBox();
        layout.getChildren().addAll(button1, button2, button3);

        Scene scene = new Scene(layout, 500, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
