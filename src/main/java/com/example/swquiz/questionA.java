package com.example.swquiz;

import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionA {

    public void AnsA1(MouseEvent event) {

    }

    public void AnsA2(MouseEvent event) {

    }

    public void AnsA3(MouseEvent event) {

    }

    public void AnsA4(MouseEvent event) {

    }

    public void nextQuestion(MouseEvent event) throws IOException {

        ChangeScene.changeScene(event, "QuestionB.fxml");
    }
}
