package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionP {

    @FXML
    Button AnsP1;
    @FXML
    Button AnsP2;
    @FXML
    Button AnsP3;
    @FXML
    Button AnsP4;
    @FXML
    Button s;
    @FXML
    ImageView picP;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    public void AnsP1(MouseEvent mouseEvent) {
        picP.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsP1.setVisible(false);
        AnsP2.setVisible(false);
        AnsP3.setVisible(false);
        AnsP4.setVisible(false);
    }

    public void AnsP2(MouseEvent mouseEvent) {
        picP.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsP1.setVisible(false);
        AnsP2.setVisible(false);
        AnsP3.setVisible(false);
        AnsP4.setVisible(false);
    }

    public void AnsP3(MouseEvent mouseEvent) {
        picP.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsP1.setVisible(false);
        AnsP2.setVisible(false);
        AnsP3.setVisible(false);
        AnsP4.setVisible(false);
    }

    public void AnsP4(MouseEvent mouseEvent) {
        picP.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsP1.setVisible(false);
        AnsP2.setVisible(false);
        AnsP3.setVisible(false);
        AnsP4.setVisible(false);
    }

    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionQ.fxml");
    }
}
