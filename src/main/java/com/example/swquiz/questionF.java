package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionF {

    @FXML
    Button AnsF1;
    @FXML
    Button AnsF2;
    @FXML
    Button AnsF3;
    @FXML
    Button AnsF4;
    @FXML
    Button s;
    @FXML
    ImageView picF;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    public void AnsF1(MouseEvent mouseEvent) {

    }

    public void AnsF2(MouseEvent mouseEvent) {

    }

    public void AnsF3(MouseEvent mouseEvent) {

    }

    public void AnsF4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionG.fxml");
    }
}
