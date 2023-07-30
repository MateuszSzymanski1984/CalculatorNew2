module com.devwider.fx.calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    exports mateuszs.calculator.service;
    opens mateuszs.calculator.service to javafx.fxml;
    exports mateuszs.calculator.service.operation;
    opens mateuszs.calculator.service.operation to javafx.fxml;
    exports mateuszs.calculator.controller;
    opens mateuszs.calculator.controller to javafx.fxml;
    exports mateuszs.calculator;
    opens mateuszs.calculator to javafx.fxml;
}