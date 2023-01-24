package modelos.Usuarios;

import java.io.Serializable;
import java.time.LocalDate;
import modelos.proxyProteccion.IntCliente;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:08
 */
public class Cliente extends Usuario implements Serializable, IntCliente {

    public Cliente(String contrasena, String correo, String dni, LocalDate fechaNacimiento, String nombre, String telefono) {
        super(contrasena, correo, dni, fechaNacimiento, nombre, telefono);
    }

    /**
     * Obtiene la informacion del cliente
     * @return 
     */
    @Override
    public String getInformacionCliente() {
        String datos = "Nombre: " + getNombre() + ";Correo: " + getCorreo() + ";Dni: " + getDni() + ";Fecha nacimiento: " + getFechaNacimiento() + ";Telefono: " + getTelefono() + ";Contraseña: " + getContrasena();
        return datos;
    }

}//end Cliente
