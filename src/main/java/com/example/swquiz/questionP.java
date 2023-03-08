package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionP {

    public void AnsP1(MouseEvent mouseEvent) {

    }

    public void AnsP2(MouseEvent mouseEvent) {

    }

    public void AnsP3(MouseEvent mouseEvent) {

    }

    public void AnsP4(MouseEvent mouseEvent) {

    }

    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionQ.fxml");
    }
}
