package com.xacaton.xacaton_platform;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        stage.setResizable(false);
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Super platform of students!");
        stage.setScene(scene);
        stage.show();
    }
}
