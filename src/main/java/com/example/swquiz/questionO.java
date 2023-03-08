package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionO {

    public void AnsO1(MouseEvent mouseEvent) {

    }

    public void AnsO2(MouseEvent mouseEvent) {

    }

    public void AnsO3(MouseEvent mouseEvent) {

    }

    public void AnsO4(MouseEvent mouseEvent) {

    }

    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event, "questionP.fxml");
    }
}
