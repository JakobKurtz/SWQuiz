package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionQ {

    @FXML
    Button AnsQ1;
    @FXML
    Button AnsQ2;
    @FXML
    Button AnsQ3;
    @FXML
    Button AnsQ4;
    @FXML
    Button s;
    @FXML
    ImageView picQ;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    public void AnsQ1(MouseEvent mouseEvent) {

    }

    public void AnsQ2(MouseEvent mouseEvent) {

    }

    public void AnsQ3(MouseEvent mouseEvent) {

    }

    public void AnsQ4(MouseEvent mouseEvent) {

    }

    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event, "hello-view.fxml");
    }
}
