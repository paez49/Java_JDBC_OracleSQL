package org.example.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root =
                FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Admin.fxml")));

        Scene scene = new Scene(root);
        stage.setTitle("Sistema Integrado de Transporte Público 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
