package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionD {

    @FXML
    Button AnsD1;
    @FXML
    Button AnsD2;
    @FXML
    Button AnsD3;
    @FXML
    Button AnsD4;
    @FXML
    Button s;
    @FXML
    ImageView picD;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    public void AnsD1(MouseEvent mouseEvent) {
        picD.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsD1.setVisible(false);
        AnsD2.setVisible(false);
        AnsD3.setVisible(false);
        AnsD4.setVisible(false);
    }

    public void AnsD2(MouseEvent mouseEvent) {
        picD.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsD1.setVisible(false);
        AnsD2.setVisible(false);
        AnsD3.setVisible(false);
        AnsD4.setVisible(false);
    }

    public void AnsD3(MouseEvent mouseEvent) {
        picD.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsD1.setVisible(false);
        AnsD2.setVisible(false);
        AnsD3.setVisible(false);
        AnsD4.setVisible(false);
    }

    public void AnsD4(MouseEvent mouseEvent) {
        picD.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsD1.setVisible(false);
        AnsD2.setVisible(false);
        AnsD3.setVisible(false);
        AnsD4.setVisible(false);
    }

    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionE.fxml");
    }
}
