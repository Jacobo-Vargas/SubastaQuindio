module com.example.subastasquindio {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires org.mapstruct;

    opens com.example.subastasquindio to javafx.fxml;
    exports com.example.subastasquindio;
}