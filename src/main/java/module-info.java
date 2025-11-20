module com.xacaton.xacaton_platform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.xacaton.xacaton_platform to javafx.fxml;
    exports com.xacaton.xacaton_platform;
}