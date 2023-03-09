package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionA {

    //ans2 is correct

    @FXML
    Button AnsA1;
    @FXML
    Button AnsA2;
    @FXML
    Button AnsA3;
    @FXML
    Button AnsA4;

    @FXML
    Button s;
    @FXML
    ImageView picA;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    @FXML
    public void AnsA1(MouseEvent event) {
       picA.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsA1.setVisible(false);
        AnsA2.setVisible(false);
        AnsA3.setVisible(false);
        AnsA4.setVisible(false);
    }
    @FXML
    public void AnsA2(MouseEvent event) {
        picA.setImage(correct);

        AnsA1.setVisible(false);
        AnsA2.setVisible(false);
        AnsA3.setVisible(false);
        AnsA4.setVisible(false);
    }
    @FXML
    public void AnsA3(MouseEvent event) {
        picA.setImage(wrong);

        AnsA1.setVisible(false);
        AnsA2.setVisible(false);
        AnsA3.setVisible(false);
        AnsA4.setVisible(false);
    }
    @FXML
    public void AnsA4(MouseEvent event) {
        picA.setImage(wrong);

        AnsA1.setVisible(false);
        AnsA2.setVisible(false);
        AnsA3.setVisible(false);
        AnsA4.setVisible(false);
    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionB.fxml");
    }
}
