package mateuszs.calculator.controller;

import mateuszs.calculator.service.CalculatorService;
import mateuszs.calculator.service.ICalculatorService;
import mateuszs.calculator.service.operation.DoubleArithmeticOperation;
import mateuszs.calculator.service.operation.DoubleCalculatorOperation;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CalculatorController {

    @FXML
    private TextField display;

    private final ICalculatorService service = new CalculatorService<>(DoubleArithmeticOperation.NON, DoubleCalculatorOperation.NON, Double::valueOf);

    @FXML
    protected void onClick(Event event) {
        Button button = (Button) event.getSource();
        String text = button.getText();
        try {
            display.setText(service.append(text));
        } catch (NumberFormatException e) {
            display.setText(e.getMessage());
        }
    }

    @FXML
    protected void onCalculate(Event event) {
        Button button = (Button) event.getSource();
        String text = button.getText();
        try {
            display.setText(service.calculate(text));
        } catch (NumberFormatException e) {
            display.setText(e.getMessage());
        }
    }

    @FXML
    protected void onBack() {
        display.setText(service.back());
    }

    @FXML
    protected void onReset() {
        service.reset();
        display.setText("");
    }
}