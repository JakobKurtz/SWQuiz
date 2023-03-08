package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionn {

    public void AnsN1(MouseEvent mouseEvent) {

    }

    public void AnsN2(MouseEvent mouseEvent) {

    }

    public void AnsN3(MouseEvent mouseEvent) {

    }

    public void AnsN4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionO.fxml");
    }
}
