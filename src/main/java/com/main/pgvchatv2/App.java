package com.main.pgvchatv2;

import com.main.pgvchatv2.models.Ventana;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Ventana.logginV();
    }

    public static void main(String[] args) {
        launch();
    }
}