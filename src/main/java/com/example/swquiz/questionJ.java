package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionJ {

    public void AnsJ1(MouseEvent mouseEvent) {

    }

    public void AnsJ2(MouseEvent mouseEvent) {

    }

    public void AnsJ3(MouseEvent mouseEvent) {

    }

    public void AnsJ4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionK.fxml");
    }
}
