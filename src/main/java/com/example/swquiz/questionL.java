package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionL {

    @FXML
    Button AnsL1;
    @FXML
    Button AnsL2;
    @FXML
    Button AnsL3;
    @FXML
    Button AnsL4;
    @FXML
    Button s;
    @FXML
    ImageView picL;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    public void AnsL1(MouseEvent mouseEvent) {

    }

    public void AnsL2(MouseEvent mouseEvent) {

    }

    public void AnsL3(MouseEvent mouseEvent) {

    }

    public void AnsL4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionM.fxml");
    }
}
