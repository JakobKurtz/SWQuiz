package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionL {

    @FXML
    Button AnsL1;
    @FXML
    Button AnsL2;
    @FXML
    Button AnsL3;
    @FXML
    Button AnsL4;
    @FXML
    Button s;
    @FXML
    ImageView picL;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    public void AnsL1(MouseEvent mouseEvent) {
        picL.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsL1.setVisible(false);
        AnsL2.setVisible(false);
        AnsL3.setVisible(false);
        AnsL4.setVisible(false);
    }

    public void AnsL2(MouseEvent mouseEvent) {
        picL.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsL1.setVisible(false);
        AnsL2.setVisible(false);
        AnsL3.setVisible(false);
        AnsL4.setVisible(false);
    }

    public void AnsL3(MouseEvent mouseEvent) {
        picL.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsL1.setVisible(false);
        AnsL2.setVisible(false);
        AnsL3.setVisible(false);
        AnsL4.setVisible(false);
    }

    public void AnsL4(MouseEvent mouseEvent) {
        picL.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsL1.setVisible(false);
        AnsL2.setVisible(false);
        AnsL3.setVisible(false);
        AnsL4.setVisible(false);
    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionM.fxml");
    }
}
