package com.mycompany.t18buscar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private Label lblMensaje;

    @FXML
    private TextField txtBuscar;

    @FXML
    private TextField txtRandom;
    @FXML
    private void buscar(ActionEvent event) {
        String txt1=txtRandom.getText();
        String txt2=txtBuscar.getText();
        if (txt1.contains(txt2)) {
            lblMensaje.setText("Sí se encontró");
        } else {
            lblMensaje.setText("No se encontró");
        }
    }
}
