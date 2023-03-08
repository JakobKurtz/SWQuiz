package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionA {

    @FXML
    public void AnsA1(MouseEvent event) {

    }
    @FXML
    public void AnsA2(MouseEvent event) {

    }
    @FXML
    public void AnsA3(MouseEvent event) {

    }
    @FXML
    public void AnsA4(MouseEvent event) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionB.fxml");
    }
}
