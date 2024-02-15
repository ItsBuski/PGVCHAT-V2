module com.main.pgvchatv2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.pgvchatv2 to javafx.fxml;
    exports com.main.pgvchatv2;
    exports com.main.pgvchatv2.controllers;
    opens com.main.pgvchatv2.controllers to javafx.fxml;
}