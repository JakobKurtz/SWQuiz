package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionH {

    @FXML
    Button AnsH1;
    @FXML
    Button AnsH2;
    @FXML
    Button AnsH3;
    @FXML
    Button AnsH4;
    @FXML
    Button s;
    @FXML
    ImageView picH;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");
    public void AnsH1(MouseEvent mouseEvent) {

    }

    public void AnsH2(MouseEvent mouseEvent) {

    }

    public void AnsH3(MouseEvent mouseEvent) {

    }

    public void AnsH4(MouseEvent mouseEvent) {

    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionI.fxml");
    }
}
