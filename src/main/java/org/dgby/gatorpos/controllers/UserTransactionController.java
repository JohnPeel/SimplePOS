package org.dgby.gatorpos.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.*;

import java.io.IOException;

import org.dgby.gatorpos.SceneManager;

public class UserTransactionController {
    @FXML
    private Button temp;
    @FXML
    private Button dragon_Beer;
    @FXML
    private Label tempLabel;
    @FXML
    private Button homeButton;

    @FXML
    private void onAction(ActionEvent event) {
        tempLabel.setText("Credit card button");
    }

    @FXML
    private void onAction2(ActionEvent event) {
        tempLabel.setText("Dragon Beer added to cart");
        // store more in the database
    }

    public void home_screen(ActionEvent event) throws IOException {
        SceneManager.getInstance().activate("Home");
    }
}
