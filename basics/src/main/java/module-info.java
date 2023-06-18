module net.javainfo.basics {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens net.javainfo.basics to javafx.fxml;
    exports net.javainfo.basics;
}