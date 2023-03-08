package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionH {

    public void AnsH1(MouseEvent mouseEvent) {

    }

    public void AnsH2(MouseEvent mouseEvent) {

    }

    public void AnsH3(MouseEvent mouseEvent) {

    }

    public void AnsH4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionI.fxml");
    }
}
