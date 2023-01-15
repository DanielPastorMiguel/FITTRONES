package modelos.Usuarios;

import java.time.LocalDate;
import java.util.List;
import modelos.Actividad;
import modelos.DietaBuilder.Dieta;
import modelos.DietaBuilder.DietaBuilder;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:31
 */
public class Monitor extends Empleado {

    private List<Socio> listaSocios;
    private List<Actividad> actividad;
    private DietaBuilder dietaBuilder;

    public Monitor(List<Socio> listaSocios, List<Actividad> actividad, Enum turno, String contrasena, String correo, String dni, LocalDate fechaNacimiento, String nombre, String telefono) {
        super(turno, contrasena, correo, dni, fechaNacimiento, nombre, telefono);
        this.listaSocios = listaSocios;
        this.actividad = actividad;
    }

   

    public void añadirSocio(Socio s) {
        listaSocios.add(s);
    }

    public void eliminaSocio(Socio s) {
        listaSocios.remove(s);
    }

    /**
     * Establece el tipo de dietabuilder que se desea
     *
     * @param dietaBuilder
     */
    public void setDietaBuilder(DietaBuilder dietaBuilder) {
        this.dietaBuilder = dietaBuilder;
    }

    public Dieta getListaDietas() {
        return dietaBuilder.getDieta();
    }

    /**
     * Crea la dieta
     */
    public void crearListaDietas() {
        dietaBuilder.crearMenuLunes();
        dietaBuilder.crearMenuMartes();
        dietaBuilder.crearMenuMiercoles();
        dietaBuilder.crearMenuJueves();
        dietaBuilder.crearMenuViernes();
        dietaBuilder.crearMenuSabado();
        dietaBuilder.crearMenuDomingo();
    }
}//end Monitor
