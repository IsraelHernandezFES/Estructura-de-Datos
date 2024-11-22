module fes.aragon.inicio.sistemagestioninventario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens fes.aragon.inicio to javafx.fxml;
    exports fes.aragon.inicio;
}