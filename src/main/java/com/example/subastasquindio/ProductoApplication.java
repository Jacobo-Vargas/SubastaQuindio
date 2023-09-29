package com.example.subastasquindio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class ProductoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SubastaApplication.class.getResource("Producto.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 750, 500);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}
