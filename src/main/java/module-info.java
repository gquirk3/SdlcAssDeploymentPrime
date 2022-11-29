module com.example.sdlcassdeploymentprime {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sdlcassdeploymentprime to javafx.fxml;
    exports com.example.sdlcassdeploymentprime;
}