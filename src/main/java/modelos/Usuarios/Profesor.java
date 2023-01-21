package modelos.Usuarios;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import modelos.Clase;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:33
 */
public class Profesor extends Empleado implements Serializable{

    public List<Clase> clase;

    public Profesor(Enum turno, String contrasena, String correo, String dni, LocalDate fechaNacimiento, String nombre, String telefono, List<Clase> clase) {
        super(turno, contrasena, correo, dni, fechaNacimiento, nombre, telefono);
        this.clase = clase;
    }

    public List<Clase> getClase() {
        return clase;
    }

    public void setClase(List<Clase> clase) {
        this.clase = clase;
    }

}//end Profesor
