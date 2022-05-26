package co.edu.javeriana.fbd.interfazusuario;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML TextField CajaUsuario;
    @FXML PasswordField CajaPassword;
    @FXML Button BotonLogin;
    @FXML Label CajaError;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void iniciarSesion(ActionEvent event) {
        CajaError.setText("Sesión iniciada.");
    }
}
