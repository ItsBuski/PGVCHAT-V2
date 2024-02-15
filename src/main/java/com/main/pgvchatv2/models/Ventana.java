package com.main.pgvchatv2.models;

import com.main.pgvchatv2.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class Ventana {
    /**
     * @Method registerV
     * @Description Cambio de ventana de loginView a registerView, para creación del usuario.
     */
    public static void registerV() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/register-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("PGV Register");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @Method logginV
     * @Description Cambio de ventana de registerView a logginView donde se muestran la pantalla de inicio de sesion.
     */
    public static void logginV() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/loggin-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("PGV Loggin");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @Method mainV
     * @Description Cambio de ventana de logginView a mainView donde se muestran la lista de notas del usuario.
     */
    public static void mainV() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/main-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("PGV chats");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void chatV() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/chat-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("AQUÍ NOMBRE DEL USUARIO");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @Method cerrarV
     * @Description Método para cerrar ventanas.
     * @param label Parametro recogido de la escena para obtener la ventana a cerrar.
     */
    public static void cerrarV(Label label) {
        Stage stage = (Stage) label.getScene().getWindow();
        stage.close();
    }
}