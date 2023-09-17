package com.calculator.javafxadditioncalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML private TextField firstNumberTextField;
    @FXML private TextField secondNumberTextField;
    @FXML private TextField answerTextField;
    @FXML
    public void submitAnswer() {
        try{
            int firstNumber = Integer.parseInt(firstNumberTextField.getText());
            int secondNumber = Integer.parseInt(secondNumberTextField.getText());

            answerTextField.setText(String.valueOf(firstNumber + secondNumber));

        }catch(NumberFormatException e){
            double firstNumber = Double.parseDouble(firstNumberTextField.getText());
            double secondNumber = Double.parseDouble(secondNumberTextField.getText());

            answerTextField.setText(String.valueOf(firstNumber + secondNumber));
        }


    }
}