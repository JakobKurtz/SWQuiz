package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionK {

    public void AnsK1(MouseEvent mouseEvent) {

    }

    public void AnsK2(MouseEvent mouseEvent) {

    }

    public void AnsK3(MouseEvent mouseEvent) {

    }

    public void AnsK4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionL.fxml");
    }
}
