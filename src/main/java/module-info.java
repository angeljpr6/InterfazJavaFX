module com.example.serializacionbien {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.serializacionbien to javafx.fxml;
    exports com.example.serializacionbien;
}