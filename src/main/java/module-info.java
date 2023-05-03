module com.example.todolist_section18javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenebuilder_section18javafx to javafx.fxml;
    exports com.example.scenebuilder_section18javafx;
}