package modelos.Usuarios;

import java.util.Date;
import modelos.ProxyProteccionClientes;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:08
 */
public class Cliente extends Usuario implements IntCliente {

    public ProxyProteccionClientes proxyProteccionClientes;

    public Cliente(String contrasena, String correo, String dni, Date fechaNacimiento, String nombre, String telefono) {
        super(contrasena, correo, dni, fechaNacimiento, nombre, telefono);

    }

    public void getInformacionCliente() {

    }
}//end Cliente
