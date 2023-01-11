package modelos.Usuarios;

import java.util.Date;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:16
 */
public class Empleado extends Usuario {

    private int codEmpleado;
    private Enum turno;

    public Empleado(int codEmpleado, Enum turno, String contrasena, String correo, String dni, Date fechaNacimiento, String nombre, String telefono) {
        super(contrasena, correo, dni, fechaNacimiento, nombre, telefono);
        this.codEmpleado = codEmpleado;
        this.turno = turno;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }
}//end Empleado
