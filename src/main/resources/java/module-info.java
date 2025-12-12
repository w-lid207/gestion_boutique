module tp.mini_projet {
    requires javafx.controls;
    requires javafx.fxml;


    opens tp.mini_projet to javafx.fxml;
    exports tp.mini_projet;
}