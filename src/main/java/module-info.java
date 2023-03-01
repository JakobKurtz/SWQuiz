module com.example.swquiz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swquiz to javafx.fxml;
    exports com.example.swquiz;
}