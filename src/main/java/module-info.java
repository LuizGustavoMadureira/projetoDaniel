module org.sgusuario {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    // requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.sgusuario to javafx.fxml;
    exports org.sgusuario;
    exports org.sgusuario.controller;
    opens org.sgusuario.controller to javafx.fxml;
}