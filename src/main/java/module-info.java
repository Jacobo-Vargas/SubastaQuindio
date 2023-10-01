module com.example.subastasquindio {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.kordamp.bootstrapfx.core;
    requires org.mapstruct;

    opens com.example.subastasquindio to javafx.fxml;
    opens com.example.subastasquindio.model to javafx.graphics;
    opens com.example.subastasquindio.mapping.mappers to org.mapstruct;

    exports com.example.subastasquindio.model;
    exports com.example.subastasquindio.exceptions;
    exports com.example.subastasquindio.mapping.dto;

    exports com.example.subastasquindio;
    exports com.example.subastasquindio.viewController;
    opens com.example.subastasquindio.viewController to javafx.fxml;
}