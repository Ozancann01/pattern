module com.example.pattern {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.pattern.emums;

    opens com.example.pattern to javafx.fxml;
    exports com.example.pattern;
    exports com.example.pattern.Controller;
    opens com.example.pattern.Controller to javafx.fxml;
}