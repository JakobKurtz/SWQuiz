package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionC {

    public void AnsC1(MouseEvent mouseEvent) {

    }

    public void AnsC2(MouseEvent mouseEvent) {

    }

    public void AnsC3(MouseEvent mouseEvent) {

    }

    public void AnsC4(MouseEvent mouseEvent) {

    }

    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionD.fxml");
    }
}
