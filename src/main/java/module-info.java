module com.example.java2lesson5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java2lesson5 to javafx.fxml;
    exports com.example.java2lesson5;
}