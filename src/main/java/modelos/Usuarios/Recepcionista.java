package modelos.Usuarios;

import modelos.proxyProteccion.IntCliente;
import java.util.Date;
import modelos.proxyProteccion.ProxyProteccionClientes;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:33
 */
public class Recepcionista extends Empleado implements IntCliente {

    public ProxyProteccionClientes proxyProteccionClientes = new ProxyProteccionClientes();

    public Recepcionista(int codEmpleado, Enum turno, String contrasena, String correo, String dni, Date fechaNacimiento, String nombre, String telefono) {
        super(codEmpleado, turno, contrasena, correo, dni, fechaNacimiento, nombre, telefono);
    }

    public void verInformacionSocio(Socio s) {
        proxyProteccionClientes.setSocio(s);
    }

    public void verInformacionCliente(Cliente c) {
        proxyProteccionClientes.setCliente(c);
    }

    public String getInformacionCliente() {
        return proxyProteccionClientes.getInformacionCliente();
    }
}//end Recepcionista
