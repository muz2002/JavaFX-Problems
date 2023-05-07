module com.example.modifiedpainter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modifiedpainter to javafx.fxml;
    exports com.example.modifiedpainter;
}