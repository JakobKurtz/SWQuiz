package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void startQuiz(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("questionA.fxml");
        ChangeScene.changeScene(event,"questionA.fxml");
    }

    @FXML
    protected void test() {

        System.out.println("works");
    }


}