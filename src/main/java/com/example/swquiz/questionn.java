package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionn {

    @FXML
    Button AnsN1;
    @FXML
    Button AnsN2;
    @FXML
    Button AnsN3;
    @FXML
    Button AnsN4;
    @FXML
    Button s;
    @FXML
    ImageView picN;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");


    public void AnsN1(MouseEvent mouseEvent) {

    }

    public void AnsN2(MouseEvent mouseEvent) {

    }

    public void AnsN3(MouseEvent mouseEvent) {

    }

    public void AnsN4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionO.fxml");
    }
}
