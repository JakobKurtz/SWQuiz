package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionE {


    @FXML
    Button AnsE1;
    @FXML
    Button AnsE2;
    @FXML
    Button AnsE3;
    @FXML
    Button AnsE4;
    @FXML
    Button s;
    @FXML
    ImageView picE;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    public void AnsE1(MouseEvent mouseEvent) {
        picE.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsE1.setVisible(false);
        AnsE2.setVisible(false);
        AnsE3.setVisible(false);
        AnsE4.setVisible(false);
    }

    public void AnsE2(MouseEvent mouseEvent) {
        picE.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsE1.setVisible(false);
        AnsE2.setVisible(false);
        AnsE3.setVisible(false);
        AnsE4.setVisible(false);
    }

    public void AnsE3(MouseEvent mouseEvent) {
        picE.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsE1.setVisible(false);
        AnsE2.setVisible(false);
        AnsE3.setVisible(false);
        AnsE4.setVisible(false);
    }

    public void AnsE4(MouseEvent mouseEvent) {
        picE.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsE1.setVisible(false);
        AnsE2.setVisible(false);
        AnsE3.setVisible(false);
        AnsE4.setVisible(false);
    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionF.fxml");
    }
}
