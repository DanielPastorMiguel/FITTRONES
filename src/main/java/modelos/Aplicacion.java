package modelos;

import java.util.ArrayList;
import modelos.FormulariosMediator.Mediador;
import modelos.OrdenadoActividadesStrategy.IntEstrategiaOrdenadoActividades;
import modelos.Usuarios.Usuario;
import modelos.AlquilerDecorator.AlquilerPista;
import java.util.List;
import modelos.Usuarios.Cliente;
import modelos.Usuarios.Empleado;
import modelos.Usuarios.Monitor;
import modelos.Usuarios.Profesor;
import modelos.Usuarios.Recepcionista;
import modelos.Usuarios.Socio;
import utiles.Excepcion;
import utiles.Enum.LoginEnum;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:04
 */
public class Aplicacion {

    private Aplicacion instancia;

    /**
     * Patron Singleton
     *
     * @return
     */
    public Aplicacion getInstancia() {
        if (instancia == null) {
            instancia = new Aplicacion();
        }
        return instancia;
    }

    private IntEstrategiaOrdenadoActividades estrategiaOrdenadoActividades;
    private AlquilerPista alquilerPista;
    private Aplicacion aplicacion;
    private Mediador mediador;

    private Usuario usuarioLogueado;
    private List<Usuario> usuariosRegistrados = new ArrayList<>();
    private List<Actividad> actividades = new ArrayList<>();
    private List<Clase> clases = new ArrayList<>();
    private List<AlquilerPista> pistas = new ArrayList<>();
    private Sauna sauna = new Sauna();

    public void registrarUsuario(Usuario usuario) throws Excepcion {
        if (usuario == null) {
            throw new Excepcion("el cliente introducido no es válido");
        }
        if (!existeCorreo(usuario.getCorreo())) {
            usuariosRegistrados.add(usuario);
        } else {
            throw new Excepcion("el correo introducido ya se encuentra registrado");
        }
    }
    
    public Enum iniciarSesion(String correo, String contrasena) {
        if (correo.equals("admin@fittrones.com") && contrasena.equals("admin")) return LoginEnum.ADMIN;
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getCorreo().equals(correo)) {
                if (usuario.getContrasena().equals(contrasena)) {
                    usuarioLogueado = usuario;
                    
                    if (usuario.getClass().equals(Cliente.class)) return LoginEnum.CLIENTE;
                    if (usuario.getClass().equals(Socio.class)) return LoginEnum.SOCIO;
                    if (usuario.getClass().equals(Recepcionista.class)) return LoginEnum.RECEPCIONISTA;
                    if (usuario.getClass().equals(Profesor.class)) return LoginEnum.PROFESOR;
                    if (usuario.getClass().equals(Monitor.class)) return LoginEnum.MONITOR;
                } else {
                    return LoginEnum.ERROR_CONTRASENA;
                }
            }
        }
        return LoginEnum.ERROR_CORREO;
    }
    
    private boolean existeCorreo(String correo){
        for (Usuario usuario : usuariosRegistrados){
            if (usuario.getCorreo().equals(correo)) return true;
        }
        return false;
    }

    public void alquilarPista() {

    }

    public void apuntarSocioClase() {

    }

    public void generarFactura() {

    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    public Sauna getSauna() {
        return sauna;
    }
    
    public void anadirActividad(Actividad act){
        actividades.add(act);
    }
    
    public void anadirClase(Clase clase){
        clases.add(clase);
    }

    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public List<Clase> getClases() {
        return clases;
    }

    /**
     *
     * @param estrategiaOrdenado
     */
    public void setEstrategiaOrdenadoActividades(IntEstrategiaOrdenadoActividades estrategiaOrdenado) {
        estrategiaOrdenadoActividades = estrategiaOrdenado;
    }

    public void ejecutarEstrategiaOrdenadoActividades() {
        estrategiaOrdenadoActividades.ordenarActividades(actividades);
    }
    
    public int getNumEmpleados(){
        int num = 0;
        for (Usuario user : usuariosRegistrados){
            if (user.getClass().equals(Empleado.class)) num++;
        }
        return num;
    }
    
    public int getNumSocios(){
        int num = 0;
        for (Usuario user : usuariosRegistrados){
            if (user.getClass().equals(Socio.class)) num++;
        }
        return num;
    }
}//end Aplicacion
