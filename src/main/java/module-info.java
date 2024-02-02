module com.example.codeide {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.codeide to javafx.fxml;
    exports com.example.codeide;
}