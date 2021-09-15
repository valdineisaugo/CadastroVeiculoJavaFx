module com.example.cadastroveiculo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cadastroveiculo to javafx.fxml;
    exports com.example.cadastroveiculo;
}