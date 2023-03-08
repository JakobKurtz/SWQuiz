package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionE {

    public void AnsE1(MouseEvent mouseEvent) {

    }

    public void AnsE2(MouseEvent mouseEvent) {

    }

    public void AnsE3(MouseEvent mouseEvent) {

    }

    public void AnsE4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionF.fxml");
    }
}
