module com.mycompany.t18buscar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.t18buscar to javafx.fxml;
    exports com.mycompany.t18buscar;
}
