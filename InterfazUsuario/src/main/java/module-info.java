module co.edu.javeriana.fbd.interfazusuario {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.javeriana.fbd.interfazusuario to javafx.fxml;
    exports co.edu.javeriana.fbd.interfazusuario;
}