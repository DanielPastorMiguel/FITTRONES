package modelos;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import modelos.OrdenadoActividadesStrategy.IntEstrategiaOrdenadoActividades;
import modelos.Usuarios.Usuario;
import modelos.AlquilerDecorator.Pista;
import java.util.List;
import modelos.AlquilerDecorator.Luces;
import modelos.AlquilerDecorator.Material;
import modelos.DescuentosComposite.Descuento;
import modelos.DescuentosComposite.DescuentoCompuesto;
import modelos.DescuentosComposite.DescuentoJoven;
import modelos.DescuentosComposite.DescuentoLunes;
import modelos.DescuentosComposite.DescuentoSocio;
import modelos.Usuarios.Cliente;
import modelos.Usuarios.Empleado;
import modelos.Usuarios.Monitor;
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

    private static List<Usuario> usuariosRegistrados = new ArrayList<>();
    private static List<Actividad> listaActividades = new ArrayList<>();
    private static List<Clase> listaClases = new ArrayList<>();
    private static List<Pista> listaPistas = new ArrayList<>();
    private static List<Factura> listaFacturas = new ArrayList<>();

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

    /**
     * Añade luces a la pista
     *
     * @param p
     * @return
     */
    public Pista anadirLucesPista(Pista p) {
        Pista pista;
        pista = new Luces(p);
        return pista;
    }

    /**
     * Añade material a la pista
     *
     * @param p
     * @return
     */
    public Pista anadirMaterial(Pista p) {
        Pista pista;
        pista = new Material(p);
        return pista;
    }

    /**
     * Añade una nueva pista clonando la ultima que hay en la lista
     *
     * @throws CloneNotSupportedException
     */
    public void anadirNuevaPista() throws CloneNotSupportedException {
        Pista p, nueva;
        p = listaPistas.get(listaPistas.size() - 1);
        nueva = (Pista) p.clone();
        listaPistas.add(nueva);
    }

    /**
     * Alquila una pista
     *
     * @param deporte
     * @param usuario
     * @param dia
     * @param hora
     * @param numPista
     */
    public void alquilarPista(Usuario usuario, String deporte, String dia, String hora, int numPista) {
        for (Pista p : listaPistas) {
            if (p.getTipo().equals(deporte)) {
                if (p.getNumPista() == numPista + 1) {
                    HashMap alquilerMap;
                    switch (dia) {
                        case "LUNES":
                            alquilerMap = p.getAlquilerLunes();
                            alquilerMap.put(hora, usuario);
                            p.setAlquilerLunes(alquilerMap);
                            break;
                        case "MARTES":
                            alquilerMap = p.getAlquilerMartes();
                            alquilerMap.put(hora, usuario);
                            p.setAlquilerMartes(alquilerMap);
                            break;
                        case "MIERCOLES":
                            alquilerMap = p.getAlquilerMiercoles();
                            alquilerMap.put(hora, usuario);
                            p.setAlquilerMiercoles(alquilerMap);
                            break;
                        case "JUEVES":
                            alquilerMap = p.getAlquilerJueves();
                            alquilerMap.put(hora, usuario);
                            p.setAlquilerJueves(alquilerMap);
                            break;
                        case "VIERNES":
                            alquilerMap = p.getAlquilerViernes();
                            alquilerMap.put(hora, usuario);
                            p.setAlquilerViernes(alquilerMap);
                            break;
                        default:
                            alquilerMap = null;
                    }
                }
            }
        }
    }

    public Pista getPista(String deporte, int numPista) {
        for (Pista p : listaPistas) {
            if (p.getTipo().equals(deporte) && p.getNumPista() == numPista + 1) {
                return p;
            }
        }
        return null;
    }

    public List<Usuario> getClientesYSocios() {
        List<Usuario> lista = new ArrayList<>();
        for (Usuario user : usuariosRegistrados) {
            if (user.getClass() == Cliente.class || user.getClass() == Socio.class) {
                lista.add(user);
            }
        }
        return lista;
    }

    public List<Actividad> getActividadesUsuario(Usuario user) {
        List<Actividad> lista = new ArrayList<>();
        for (Actividad act : listaActividades) {
            if (act.getUsuariosInscritos().contains(user)) {
                lista.add(act);
            }
        }
        return lista;
    }

    public Descuento getDescuento(Usuario usuario) {
        DescuentoCompuesto dCompuesto = new DescuentoCompuesto();
        if (usuario.getClass() == Socio.class) {
            dCompuesto.añadirDescuento(new DescuentoSocio());
        }
        if (esJoven(usuario.getFechaNacimiento())) {
            dCompuesto.añadirDescuento(new DescuentoJoven());
        }
        if (esLunes()) {
            dCompuesto.añadirDescuento(new DescuentoLunes());
        }

        if (dCompuesto.getListaDescuentos().size() == 1) {
            return dCompuesto.getListaDescuentos().get(0); //si solo hay un descuento, devuelve ese descuento, si no, devuelve descuentoCompuesto
        }
        return dCompuesto;
    }

    /**
     * Comprueba si desde hoy hasta una fecha dada han pasado mas o menos de 26 años
     *
     * @param fechaNacimiento
     * @return True si han pasado menos de 26 años, false si han pasado más.
     */
    private boolean esJoven(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaActualMenos26Años = fechaActual.minusYears(26);
        return fechaNacimiento.isAfter(fechaActualMenos26Años);
    }

    /**
     * Comprueba si hoy es lunes
     *
     * @return True si es lunes, false si no lo es.
     */
    private boolean esLunes() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(Date.from(Instant.now()));
        return cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY;
    }

    public void generarFactura(String concepto, Descuento descuento, Usuario usuario, double precio) {
        Factura f = new Factura(listaFacturas.size(), concepto, descuento, usuario, LocalDate.now(), precio);
        listaFacturas.add(f);

        String nombreArchivo = f.getId() + "_" + usuario.getCorreo() + ".txt";
        PrintWriter DocumentoVenta;
        try {
            DocumentoVenta = new PrintWriter(new BufferedWriter(new FileWriter("src/main/java/facturas/" + nombreArchivo)));
            DocumentoVenta.println("Id factura: " + String.valueOf(f.getId()));
            DocumentoVenta.println("Usuario: " + usuario.getCorreo());
            if (usuario.getClass() == Socio.class) DocumentoVenta.println("Codigo socio: " + String.valueOf(((Socio) usuario).getId()));
            DocumentoVenta.println("Concepto: " + concepto);
            DocumentoVenta.println("Fecha: " + String.valueOf(f.getFecha()));
            DocumentoVenta.println(descuento.getDescripcion());
            DocumentoVenta.println("Precio: " + precio);
            DocumentoVenta.close();
        } catch (IOException ex) {
            System.out.println("ERROR al generar la factura");
        }
    }
    
    public void vaciarPista(Pista p){
        p.getAlquilerLunes().forEach((k,v) -> p.getAlquilerLunes().put(k, null));
        p.getAlquilerMartes().forEach((k,v) -> p.getAlquilerMartes().put(k, null));
        p.getAlquilerMiercoles().forEach((k,v) -> p.getAlquilerMiercoles().put(k, null));
        p.getAlquilerJueves().forEach((k,v) -> p.getAlquilerJueves().put(k, null));
        p.getAlquilerViernes().forEach((k,v) -> p.getAlquilerViernes().put(k, null));
    }

    /**
     * Apunta un socio a una clase
     *
     * @param socio
     * @param clase
     * @return 1 si se ha añadido corectamente, 0 si ya estaba apuntado y -1 si esta llena la clase
     */
    public int apuntarSocioClase(Socio socio, Clase clase) {
        return clase.apuntarSocioClase(socio);
    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    public void anadirActividad(Actividad act) {
        listaActividades.add(act);
    }

    public void anadirClase(Clase clase) {
        listaClases.add(clase);
    }

    public void anadirPista(Pista pista) {
        listaPistas.add(pista);
    }

    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public List<Actividad> getActividades() {
        return listaActividades;
    }

    public List<Clase> getClases() {
        return listaClases;
    }

    public Clase getClase(String tipoClase, String nivel) {
        for (Clase clase : listaClases) {
            if (String.valueOf(clase.getTipo()).equals(tipoClase) && String.valueOf(clase.getNivel()).equals(nivel)) {
                return clase;
            }
        }
        return null;
    }

    public List<Socio> getSocios() {
        List<Socio> listasocios = new ArrayList<>();
        for (Usuario user : usuariosRegistrados) {
            if (user.getClass() == Socio.class) {
                listasocios.add((Socio) user);
            }
        }
        return listasocios;
    }

    public Socio getSocio(String correo) {
        for (Socio s : getSocios()) {
            if (s.getCorreo().equals(correo)) {
                return s;
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
        estrategiaOrdenadoActividades.ordenarActividades(listaActividades);
    }

    public List<Pista> getPistas() {
        return listaPistas;
    }

    public List<Pista> getPistasFutbol() {
        List<Pista> pf = new ArrayList<>();
        for (Pista p : listaPistas) {
            if (p.getTipo().equals("FUTBOL")) {
                pf.add(p);
            }
        }
        return pf;
    }

    public List<Pista> getPistasPadel() {
        List<Pista> pf = new ArrayList<>();
        for (Pista p : listaPistas) {
            if (p.getTipo().equals("PADEL")) {
                pf.add(p);
            }
        }
        return pf;
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
    public void guardarDatos() {
        try {
            //si hay datos, los guardamos
            if (!usuariosRegistrados.isEmpty() || !listaClases.isEmpty() || !listaActividades.isEmpty() || !listaPistas.isEmpty()) {
                /**
                 * ***** Serialización de los objetos ********
                 */
                //serializacion de los usuarios
                FileOutputStream ostreamUsers = new FileOutputStream("src/main/java/datosSerializados/usuariosRegistrados.dat");
                ObjectOutputStream oosUsers = new ObjectOutputStream(ostreamUsers);
                //guardamos el array de los usuarios
                oosUsers.writeObject(usuariosRegistrados);
                ostreamUsers.close();

                //serializacion de las clases
                FileOutputStream ostreamClases = new FileOutputStream("src/main/java/datosSerializados/clases.dat");
                ObjectOutputStream oosClases = new ObjectOutputStream(ostreamClases);
                //guardamos el array de las clases
                oosClases.writeObject(listaClases);
                ostreamClases.close();

                //serializacion de las actividades
                FileOutputStream ostreamAct = new FileOutputStream("src/main/java/datosSerializados/actividades.dat");
                ObjectOutputStream oosAct = new ObjectOutputStream(ostreamAct);
                //guardamos el array de las actividades
                oosAct.writeObject(listaActividades);
                ostreamAct.close();

                //serializacion de las pistas
                FileOutputStream ostreamPistas = new FileOutputStream("src/main/java/datosSerializados/pistas.dat");
                ObjectOutputStream oosPistas = new ObjectOutputStream(ostreamPistas);
                //guardamos el array de las pistas
                oosPistas.writeObject(listaPistas);
                ostreamPistas.close();
                
                //serializacion de las facturas
                FileOutputStream ostreamFacturas = new FileOutputStream("src/main/java/datosSerializados/facturas.dat");
                ObjectOutputStream oosFacturas = new ObjectOutputStream(ostreamFacturas);
                //guardamos el array de las pistas
                oosFacturas.writeObject(listaFacturas);
                ostreamFacturas.close();

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
    public void cargarDatos() {
        try {
            //lectura de los objetos de tipo usuario
            FileInputStream istreamUsr = new FileInputStream("src/main/java/datosSerializados/usuariosRegistrados.dat");
            ObjectInputStream oisUsr = new ObjectInputStream(istreamUsr);
            usuariosRegistrados = (ArrayList) oisUsr.readObject();
            istreamUsr.close();

            //lectura de los objetos de tipo clases
            FileInputStream istreamClases = new FileInputStream("src/main/java/datosSerializados/clases.dat");
            ObjectInputStream oisClase = new ObjectInputStream(istreamClases);
            listaClases = (ArrayList) oisClase.readObject();
            istreamClases.close();

            //lectura de los objetos de tipo actividades
            FileInputStream istreamAct = new FileInputStream("src/main/java/datosSerializados/actividades.dat");
            ObjectInputStream oisAct = new ObjectInputStream(istreamAct);
            listaActividades = (ArrayList) oisAct.readObject();
            istreamAct.close();

            //lectura de los objetos de tipo pista
            FileInputStream istreamPistas = new FileInputStream("src/main/java/datosSerializados/pistas.dat");
            ObjectInputStream oisPistas = new ObjectInputStream(istreamPistas);
            listaPistas = (ArrayList) oisPistas.readObject();
            istreamPistas.close();
            
            //lectura de los objetos de tipo factura
            FileInputStream istreamFacturas = new FileInputStream("src/main/java/datosSerializados/facturas.dat");
            ObjectInputStream oisFacturas = new ObjectInputStream(istreamFacturas);
            listaPistas = (ArrayList) oisFacturas.readObject();
            istreamFacturas.close();

        } catch (IOException ioe) {
            System.out.println("Error de tipo IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnf) {
            System.out.println("Error de clase no encontrada: " + cnf.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargar datos
}//end Aplicacion
