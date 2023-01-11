package modelos.Usuarios;

import java.util.Date;
import modelos.ProxyProteccionClientes;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:33
 */
public class Recepcionista extends Empleado implements IntCliente {

    public ProxyProteccionClientes proxyProteccionClientes;

    public Recepcionista(ProxyProteccionClientes proxyProteccionClientes, int codEmpleado, Enum turno, String contrasena, String correo, String dni, Date fechaNacimiento, String nombre, String telefono) {
        super(codEmpleado, turno, contrasena, correo, dni, fechaNacimiento, nombre, telefono);
        this.proxyProteccionClientes = proxyProteccionClientes;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public void getInformacionCliente() {

    }
}//end Recepcionista
