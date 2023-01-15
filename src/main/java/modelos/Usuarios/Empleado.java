package modelos.Usuarios;

import java.time.LocalDate;
import modelos.Aplicacion;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:16
 */
public class Empleado extends Usuario {

    private final int codEmpleado;
    private Enum turno;

    public Empleado(Enum turno, String contrasena, String correo, String dni, LocalDate fechaNacimiento, String nombre, String telefono) {
        super(contrasena, correo, dni, fechaNacimiento, nombre, telefono);
        this.codEmpleado = new Aplicacion().getNumEmpleados() + 1;
        this.turno = turno;
    }

}//end Empleado
