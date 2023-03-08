package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionD {

    public void AnsD1(MouseEvent mouseEvent) {

    }

    public void AnsD2(MouseEvent mouseEvent) {

    }

    public void AnsD3(MouseEvent mouseEvent) {

    }

    public void AnsD4(MouseEvent mouseEvent) {

    }

    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionE.fxml");
    }
}
