package modelos.Usuarios;

import java.io.Serializable;
import java.time.LocalDate;
import modelos.proxyProteccion.IntCliente;
import modelos.proxyProteccion.ProxyProteccionClientes;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:33
 */
public class Recepcionista extends Empleado implements IntCliente, Serializable{

    public ProxyProteccionClientes proxyProteccionClientes = new ProxyProteccionClientes();

    public Recepcionista(Enum turno, String contrasena, String correo, String dni, LocalDate fechaNacimiento, String nombre, String telefono) {
        super(turno, contrasena, correo, dni, fechaNacimiento, nombre, telefono);
    }

    public void setUsuario(Socio s) {
        proxyProteccionClientes.setSocio(s);
    }

    public void setUsuario(Cliente c) {
        proxyProteccionClientes.setCliente(c);
    }

    @Override
    public String getInformacionCliente() {
        return proxyProteccionClientes.getInformacionCliente();
    }
}//end Recepcionista
