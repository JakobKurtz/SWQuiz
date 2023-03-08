package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionB {

    public void AnsB1(MouseEvent mouseEvent) {

    }

    public void AnsB2(MouseEvent mouseEvent) {

    }

    public void AnsB3(MouseEvent mouseEvent) {

    }

    public void AnsB4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionC.fxml");
    }

}
