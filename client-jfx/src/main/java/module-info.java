module com.chat.jfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.chat.jfx to javafx.fxml;
    exports com.chat.jfx;
}