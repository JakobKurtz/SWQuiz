package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionC {

    @FXML
    Button AnsC1;
    @FXML
    Button AnsC2;
    @FXML
    Button AnsC3;
    @FXML
    Button AnsC4;
    @FXML
    Button s;
    @FXML
    ImageView picC;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    public void AnsC1(MouseEvent mouseEvent) {

    }

    public void AnsC2(MouseEvent mouseEvent) {

    }

    public void AnsC3(MouseEvent mouseEvent) {

    }

    public void AnsC4(MouseEvent mouseEvent) {

    }

    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionD.fxml");
    }
}
