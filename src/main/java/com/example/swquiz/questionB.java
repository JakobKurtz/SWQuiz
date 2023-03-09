package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionB {
    //ans3 is correct

    @FXML
    Button AnsB1;
    @FXML
    Button AnsB2;
    @FXML
    Button AnsB3;
    @FXML
    Button AnsB4;
    @FXML
    Button s;
    @FXML
    ImageView picB;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    @FXML
    public void AnsB1(MouseEvent event) {
        picB.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsB1.setVisible(false);
        AnsB2.setVisible(false);
        AnsB3.setVisible(false);
        AnsB4.setVisible(false);
    }
    @FXML
    public void AnsB2(MouseEvent event) {
        picB.setImage(wrong);

        AnsB1.setVisible(false);
        AnsB2.setVisible(false);
        AnsB3.setVisible(false);
        AnsB4.setVisible(false);
    }
    @FXML
    public void AnsB3(MouseEvent event) {
        picB.setImage(correct);

        AnsB1.setVisible(false);
        AnsB2.setVisible(false);
        AnsB3.setVisible(false);
        AnsB4.setVisible(false);
    }
    @FXML
    public void AnsB4(MouseEvent event) {
        picB.setImage(wrong);

        AnsB1.setVisible(false);
        AnsB2.setVisible(false);
        AnsB3.setVisible(false);
        AnsB4.setVisible(false);
    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {


        ChangeScene.changeScene(event,"questionC.fxml");
    }
}
