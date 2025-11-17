module com.example.nabilcv {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nabilcv to javafx.fxml;
    exports com.example.nabilcv;
}