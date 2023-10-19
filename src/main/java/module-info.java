module com.example.serializacionbien {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.serializacionbien to javafx.fxml;
    exports com.example.serializacionbien;
    exports com.example.serializacionbien.controlador;
    opens com.example.serializacionbien.controlador to javafx.fxml;
}