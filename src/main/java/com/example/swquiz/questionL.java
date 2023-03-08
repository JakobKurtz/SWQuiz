package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionL {

    public void AnsL1(MouseEvent mouseEvent) {

    }

    public void AnsL2(MouseEvent mouseEvent) {

    }

    public void AnsL3(MouseEvent mouseEvent) {

    }

    public void AnsL4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionM.fxml");
    }
}
