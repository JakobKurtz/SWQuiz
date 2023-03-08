package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionG {

    public void AnsG1(MouseEvent mouseEvent) {

    }

    public void AnsG2(MouseEvent mouseEvent) {

    }

    public void AnsG3(MouseEvent mouseEvent) {

    }

    public void AnsG4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionH.fxml");
    }
}
