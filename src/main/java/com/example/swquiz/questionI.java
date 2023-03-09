package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionI {


    @FXML
    Button AnsI1;
    @FXML
    Button AnsI2;
    @FXML
    Button AnsI3;
    @FXML
    Button AnsI4;
    @FXML
    Button s;
    @FXML
    ImageView picI;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");
    public void AnsI1(MouseEvent mouseEvent) {
        picI.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsI1.setVisible(false);
        AnsI2.setVisible(false);
        AnsI3.setVisible(false);
        AnsI4.setVisible(false);
    }

    public void AnsI2(MouseEvent mouseEvent) {
        picI.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsI1.setVisible(false);
        AnsI2.setVisible(false);
        AnsI3.setVisible(false);
        AnsI4.setVisible(false);
    }

    public void AnsI3(MouseEvent mouseEvent) {
        picI.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsI1.setVisible(false);
        AnsI2.setVisible(false);
        AnsI3.setVisible(false);
        AnsI4.setVisible(false);
    }

    public void AnsI4(MouseEvent mouseEvent) {
        picI.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsI1.setVisible(false);
        AnsI2.setVisible(false);
        AnsI3.setVisible(false);
        AnsI4.setVisible(false);
    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionJ.fxml");
    }
}
