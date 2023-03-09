package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionO {

    @FXML
    Button AnsO1;
    @FXML
    Button AnsO2;
    @FXML
    Button AnsO3;
    @FXML
    Button AnsO4;
    @FXML
    Button s;
    @FXML
    ImageView picO;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    public void AnsO1(MouseEvent mouseEvent) {
        picO.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsO1.setVisible(false);
        AnsO2.setVisible(false);
        AnsO3.setVisible(false);
        AnsO4.setVisible(false);
    }

    public void AnsO2(MouseEvent mouseEvent) {
        picO.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsO1.setVisible(false);
        AnsO2.setVisible(false);
        AnsO3.setVisible(false);
        AnsO4.setVisible(false);
    }

    public void AnsO3(MouseEvent mouseEvent) {
        picO.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsO1.setVisible(false);
        AnsO2.setVisible(false);
        AnsO3.setVisible(false);
        AnsO4.setVisible(false);
    }

    public void AnsO4(MouseEvent mouseEvent) {
        picO.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsO1.setVisible(false);
        AnsO2.setVisible(false);
        AnsO3.setVisible(false);
        AnsO4.setVisible(false);
    }

    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event, "questionP.fxml");
    }
}
