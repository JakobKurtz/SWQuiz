package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionF {

    public void AnsF1(MouseEvent mouseEvent) {

    }

    public void AnsF2(MouseEvent mouseEvent) {

    }

    public void AnsF3(MouseEvent mouseEvent) {

    }

    public void AnsF4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionG.fxml");
    }
}
