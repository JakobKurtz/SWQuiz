package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionG {

    @FXML
    Button AnsG1;
    @FXML
    Button AnsG2;
    @FXML
    Button AnsG3;
    @FXML
    Button AnsG4;
    @FXML
    Button s;
    @FXML
    ImageView picG;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");

    public void AnsG1(MouseEvent mouseEvent) {
        picG.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsG1.setVisible(false);
        AnsG2.setVisible(false);
        AnsG3.setVisible(false);
        AnsG4.setVisible(false);
    }

    public void AnsG2(MouseEvent mouseEvent) {
        picG.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsG1.setVisible(false);
        AnsG2.setVisible(false);
        AnsG3.setVisible(false);
        AnsG4.setVisible(false);
    }

    public void AnsG3(MouseEvent mouseEvent) {
        picG.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsG1.setVisible(false);
        AnsG2.setVisible(false);
        AnsG3.setVisible(false);
        AnsG4.setVisible(false);
    }

    public void AnsG4(MouseEvent mouseEvent) {
        picG.setImage(wrong);
        //System.out.println(picA.getImage().getUrl());
        AnsG1.setVisible(false);
        AnsG2.setVisible(false);
        AnsG3.setVisible(false);
        AnsG4.setVisible(false);
    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionH.fxml");
    }
}
