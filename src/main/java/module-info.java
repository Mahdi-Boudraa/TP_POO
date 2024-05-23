module com.example.tppoo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.tppoo to javafx.fxml;
    exports com.example.tppoo;
}