package com.example.swquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class questionJ {
    @FXML
    Button AnsJ1;
    @FXML
    Button AnsJ2;
    @FXML
    Button AnsJ3;
    @FXML
    Button AnsJ4;
    @FXML
    Button s;
    @FXML
    ImageView picJ;

    Image correct = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\correct.png");

    //Image quiz = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\QUIZ.jpg");

    Image wrong = new Image("C:\\class folder\\Year 2\\Q1\\New folder\\SWQuiz\\src\\main\\resources\\Assets\\wrog.png");
    public void AnsJ1(MouseEvent mouseEvent) {
        picJ.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsJ1.setVisible(false);
        AnsJ2.setVisible(false);
        AnsJ3.setVisible(false);
        AnsJ4.setVisible(false);
    }

    public void AnsJ2(MouseEvent mouseEvent) {
        picJ.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsJ1.setVisible(false);
        AnsJ2.setVisible(false);
        AnsJ3.setVisible(false);
        AnsJ4.setVisible(false);
    }

    public void AnsJ3(MouseEvent mouseEvent) {
        picJ.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsJ1.setVisible(false);
        AnsJ2.setVisible(false);
        AnsJ3.setVisible(false);
        AnsJ4.setVisible(false);
    }

    public void AnsJ4(MouseEvent mouseEvent) {
        picJ.setImage(correct);
        //System.out.println(picA.getImage().getUrl());
        AnsJ1.setVisible(false);
        AnsJ2.setVisible(false);
        AnsJ3.setVisible(false);
        AnsJ4.setVisible(false);
    }
    @FXML
    public void nextQuestion(MouseEvent event) throws IOException {

        //HelloApplication.sh.activate("QuestionB");
        ChangeScene.changeScene(event,"questionK.fxml");
    }
}
