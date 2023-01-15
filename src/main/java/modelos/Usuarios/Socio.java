package modelos.Usuarios;

import java.time.LocalDate;
import modelos.proxyProteccion.IntCliente;
import java.util.List;
import modelos.Actividad;
import modelos.Aplicacion;
import modelos.Clase;
import modelos.DietaBuilder.Dieta;
import modelos.proxyProteccion.ProxyProteccionClientes;
import modelos.FabricaRutina.Rutina;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:35
 */
public class Socio extends Usuario implements IntCliente, IntSuscriptor {

    private final int id;
    public Clase clase;
    public Dieta dieta;
    public Rutina rutina;
    public Actividad actividad;
    public ProxyProteccionClientes proxyProteccionClientes;
    private List<String> listaNotificaciones;

    public Socio(String contrasena, String correo, String dni, LocalDate fechaNacimiento, String nombre, String telefono) {
        super(contrasena, correo, dni, fechaNacimiento, nombre, telefono);
        id = new Aplicacion().getNumSocios() + 1;
    }

    public int getId() {
        return id;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public ProxyProteccionClientes getProxyProteccionClientes() {
        return proxyProteccionClientes;
    }

    public void setProxyProteccionClientes(ProxyProteccionClientes proxyProteccionClientes) {
        this.proxyProteccionClientes = proxyProteccionClientes;
    }

    public List<String> getListaNotificaciones() {
        return listaNotificaciones;
    }

    public void setListaNotificaciones(List<String> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }

    public void actualizar() {

    }

    public String getInformacionCliente() {
        String datos = "Nombre: " + getNombre() + "; Correo: " + getCorreo() + "; Dni: " + getDni() + "; Fecha nacimiento: " + getFechaNacimiento() + "; Telefono: " + getTelefono() + "; Contraseña: " + getContrasena();
        return datos;
    }
}//end Socio
