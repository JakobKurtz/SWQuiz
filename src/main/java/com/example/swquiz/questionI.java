package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionI {

    public void AnsI1(MouseEvent mouseEvent) {

    }

    public void AnsI2(MouseEvent mouseEvent) {

    }

    public void AnsI3(MouseEvent mouseEvent) {

    }

    public void AnsI4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionJ.fxml");
    }
}
