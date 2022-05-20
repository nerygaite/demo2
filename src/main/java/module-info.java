module nya.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    opens nya.demo1 to javafx.fxml, javafx.graphics;
}