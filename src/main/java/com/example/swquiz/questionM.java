package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionM {

    public void AnsM1(MouseEvent mouseEvent) {

    }

    public void AnsM2(MouseEvent mouseEvent) {

    }

    public void AnsM3(MouseEvent mouseEvent) {

    }

    public void AnsM4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionN.fxml");
    }
}
