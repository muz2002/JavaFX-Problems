module com.example.modifiedcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modifiedcalculator to javafx.fxml;
    exports com.example.modifiedcalculator;
}