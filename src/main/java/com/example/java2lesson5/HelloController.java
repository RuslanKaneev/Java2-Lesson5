package com.example.java2lesson5;

import java.net.URL;
import java.security.Key;
import java.util.*;
import java.util.function.Consumer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.input.DataFormat;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class HelloController {
    List<String> listHistory = new LinkedList<>();
    @FXML
    private Button buttonSnd;


    @FXML
    private ListView<String> txtC;

    @FXML
    private TextField txtB;

    @FXML
    private Label txtT;


    @FXML
    private TextArea txtM;


    @FXML
    void initialize() {
        buttonSnd.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String texSend = txtB.getText();
                String user = "Я";
                if(!texSend.isEmpty()){
                    txtM.appendText(String.format("%s   %s :  %s %n", new Date(), user, txtB.getText()));
                    txtB.clear();
                }
            }
        });
        buttonSnd.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER)  {
                    String texSend = txtB.getText();
                    String user = "Я";
                    if(!texSend.isEmpty()){
                        txtM.appendText(String.format("%s   %s :  %s %n", new Date(), user, txtB.getText()));
                        txtB.clear();
                    }
                }
            }


        });

    }

    @FXML
    void initalize() {

    }


}