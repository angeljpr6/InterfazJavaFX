package com.example.serializacionbien.controlador;

import com.example.serializacionbien.modelo.Persona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonaController implements Initializable {
// a
    @FXML
    public TextField textoEdad;
    @FXML
    public TextField textoDNI;
    @FXML
    public TextField textoDireccion;
    @FXML
    TextField textoNombre;

    @FXML
    Button enviar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void click(ActionEvent actionEvent) {
        Persona persona = new Persona(textoNombre.getText(),textoDireccion.getText(),textoDNI.getText(),Integer.parseInt(textoEdad.getText()));
        persona.escribirPersona();

    }
}
