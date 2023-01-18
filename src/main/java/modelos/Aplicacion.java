package modelos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelos.FormulariosMediator.Mediador;
import modelos.OrdenadoActividadesStrategy.IntEstrategiaOrdenadoActividades;
import modelos.Usuarios.Usuario;
import modelos.AlquilerDecorator.Pista;
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

    private static Aplicacion instancia;

    private IntEstrategiaOrdenadoActividades estrategiaOrdenadoActividades;
    private Pista alquilerPista;
    private Aplicacion aplicacion;
    private Mediador mediador;

    private static List<Usuario> usuariosRegistrados = new ArrayList<>();
    private static List<Actividad> actividades = new ArrayList<>();
    private static List<Clase> clases = new ArrayList<>();
    private static List<Pista> pistas = new ArrayList<>();

    private Sauna sauna = new Sauna();
    private Usuario usuarioLogueado;

    /**
     * Patron Singleton
     *
     * @return
     */
    public static Aplicacion getInstancia() {
        if (instancia == null) {
            instancia = new Aplicacion();
        }
        return instancia;
    }

    private Aplicacion() {
    }

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
        if (correo.equals("admin@fittrones.com") && contrasena.equals("admin")) {
            return LoginEnum.ADMIN;
        }
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getCorreo().equals(correo)) {
                if (usuario.getContrasena().equals(contrasena)) {
                    usuarioLogueado = usuario;

                    if (usuario.getClass().equals(Cliente.class)) {
                        return LoginEnum.CLIENTE;
                    }
                    if (usuario.getClass().equals(Socio.class)) {
                        return LoginEnum.SOCIO;
                    }
                    if (usuario.getClass().equals(Recepcionista.class)) {
                        return LoginEnum.RECEPCIONISTA;
                    }
                    if (usuario.getClass().equals(Profesor.class)) {
                        return LoginEnum.PROFESOR;
                    }
                    if (usuario.getClass().equals(Monitor.class)) {
                        return LoginEnum.MONITOR;
                    }
                } else {
                    return LoginEnum.ERROR_CONTRASENA;
                }
            }
        }
        return LoginEnum.ERROR_CORREO;
    }

    private boolean existeCorreo(String correo) {
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getCorreo().equals(correo)) {
                return true;
            }
        }
        return false;
    }

    public void alquilarPista() {

    }

    public boolean apuntarSocioClase(Socio socio, Clase clase) {
        return clase.apuntarSocioClase(socio);
    }

    public void generarFactura() {

    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    public Sauna getSauna() {
        return sauna;
    }

    public void anadirActividad(Actividad act) {
        actividades.add(act);
    }

    public void anadirClase(Clase clase) {
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

    public Clase getClase(String tipoClase, String nivel) {
        for (Clase clase : clases) {
            if (String.valueOf(clase.getTipo()).equals(tipoClase) && String.valueOf(clase.getNivel()).equals(nivel)) {
                return clase;
            }
        }
        return null;
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

    public int getNumEmpleados() {
        int num = 0;
        for (Usuario user : usuariosRegistrados) {
            if (user.getClass().equals(Empleado.class)) {
                num++;
            }
        }
        return num;
    }

    public int getNumSocios() {
        int num = 0;
        for (Usuario user : usuariosRegistrados) {
            if (user.getClass().equals(Socio.class)) {
                num++;
            }
        }
        return num;
    }

    /**
     * guarda los datos de las listas de la aplicacione en su archivo de datos correspondiente
     */
    public static void guardarDatos() {
        try {
            //si hay datos, los guardamos
            if (!usuariosRegistrados.isEmpty() || !clases.isEmpty() || !actividades.isEmpty() || !pistas.isEmpty()) {
                /**
                 * ***** Serialización de los objetos ********
                 */
                //serializacion de los usuarios
                FileOutputStream ostreamUsers = new FileOutputStream("usuariosRegistrados.dat");
                ObjectOutputStream oosUsers = new ObjectOutputStream(ostreamUsers);
                //guardamos el array de los usuarios
                oosUsers.writeObject(usuariosRegistrados);
                ostreamUsers.close();

                //serializacion de las clases
                FileOutputStream ostreamClases = new FileOutputStream("clases.dat");
                ObjectOutputStream oosClases = new ObjectOutputStream(ostreamClases);
                //guardamos el array de las clases
                oosClases.writeObject(clases);
                ostreamClases.close();

                //serializacion de las actividades
                FileOutputStream ostreamAct = new FileOutputStream("actividades.dat");
                ObjectOutputStream oosAct = new ObjectOutputStream(ostreamAct);
                //guardamos el array de las actividades
                oosAct.writeObject(actividades);
                ostreamAct.close();
                
                //serializacion de las pistas
                FileOutputStream ostreamPistas = new FileOutputStream("actividades.dat");
                ObjectOutputStream oosPistas = new ObjectOutputStream(ostreamPistas);
                //guardamos el array de las pistas
                oosPistas.writeObject(pistas);
                ostreamPistas.close();
                
            } else {
                System.out.println("Error, no hay datos...");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }//fin guardar datos

    /**
     * carga los datos de sus archivos correspondientes
     */
    public static void cargarDatos() {
        try {
            //lectura de los objetos de tipo usuario
            FileInputStream istreamUsr = new FileInputStream("clientes.dat");
            ObjectInputStream oisUsr = new ObjectInputStream(istreamUsr);
            usuariosRegistrados = (ArrayList) oisUsr.readObject();
            istreamUsr.close();
            
            //lectura de los objetos de tipo clases
            FileInputStream istreamClases = new FileInputStream("productos.dat");
            ObjectInputStream oisClase = new ObjectInputStream(istreamClases);
            clases = (ArrayList) oisClase.readObject();
            istreamClases.close();
            
            //lectura de los objetos de tipo actividades
            FileInputStream istreamAct= new FileInputStream("actividades.dat");
            ObjectInputStream oisAct = new ObjectInputStream(istreamAct);
            actividades = (ArrayList) oisAct.readObject();
            istreamAct.close();
            
            //lectura de los objetos de tipo AlquilerPista
            FileInputStream istreamPistas = new FileInputStream("pistas.dat");
            ObjectInputStream oisPistas = new ObjectInputStream(istreamPistas);
            pistas = (ArrayList) oisPistas.readObject();
            istreamPistas.close();
            
        } catch (IOException ioe) {
            System.out.println("Error de tipo IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnf) {
            System.out.println("Error de clase no encontrada: " + cnf.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargar datos
}//end Aplicacion
