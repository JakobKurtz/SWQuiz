package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionM {

    @FXML
    Button AnsM1;
    @FXML
    Button AnsM2;
    @FXML
    Button AnsM3;
    @FXML
    Button AnsM4;
    @FXML
    Button s;
    @FXML
    ImageView picM;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");
    public void AnsM1(MouseEvent mouseEvent) {

    }

    public void AnsM2(MouseEvent mouseEvent) {

    }

    public void AnsM3(MouseEvent mouseEvent) {

    }

    public void AnsM4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionN.fxml");
    }
}
