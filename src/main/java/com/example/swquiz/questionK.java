package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionK {
    @FXML
    Button AnsK1;
    @FXML
    Button AnsK2;
    @FXML
    Button AnsK3;
    @FXML
    Button AnsK4;
    @FXML
    Button s;
    @FXML
    ImageView picK;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");
    public void AnsK1(MouseEvent mouseEvent) {
        picK.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsK1.setVisible(false);
        AnsK2.setVisible(false);
        AnsK3.setVisible(false);
        AnsK4.setVisible(false);
    }

    public void AnsK2(MouseEvent mouseEvent) {
        picK.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsK1.setVisible(false);
        AnsK2.setVisible(false);
        AnsK3.setVisible(false);
        AnsK4.setVisible(false);
    }

    public void AnsK3(MouseEvent mouseEvent) {
        picK.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsK1.setVisible(false);
        AnsK2.setVisible(false);
        AnsK3.setVisible(false);
        AnsK4.setVisible(false);
    }

    public void AnsK4(MouseEvent mouseEvent) {
        picK.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsK1.setVisible(false);
        AnsK2.setVisible(false);
        AnsK3.setVisible(false);
        AnsK4.setVisible(false);
    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionL.fxml");
    }
}
