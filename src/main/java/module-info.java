module com.javafx_demo1.javafx_demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx_demo1.javafx_demo1 to javafx.fxml;
    exports com.javafx_demo1.javafx_demo1;
}