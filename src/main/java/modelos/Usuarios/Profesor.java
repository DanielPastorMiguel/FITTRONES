package modelos.Usuarios;

import java.util.Date;
import modelos.Clase;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:33
 */
public class Profesor extends Empleado {

    public Clase clase;

    public Profesor(int codEmpleado, Enum turno, String contrasena, String correo, String dni, Date fechaNacimiento, String nombre, String telefono) {
        super(codEmpleado, turno, contrasena, correo, dni, fechaNacimiento, nombre, telefono);
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

}//end Profesor
