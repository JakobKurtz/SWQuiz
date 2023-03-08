package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionQ {

    public void AnsQ1(MouseEvent mouseEvent) {

    }

    public void AnsQ2(MouseEvent mouseEvent) {

    }

    public void AnsQ3(MouseEvent mouseEvent) {

    }

    public void AnsQ4(MouseEvent mouseEvent) {

    }

    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event, "hello-view.fxml");
    }
}
