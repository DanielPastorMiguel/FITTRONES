package modelos.FabricaRutina;

import java.util.ArrayList;
import java.util.List;
import utiles.Enum;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:21
 */
public class FactoriaPrincipiante extends FabricaRutina {

    public Rutina crearEjercicios() {
        List<Ejercicio> ejerciciosEmpuje = new ArrayList<>();
        List<Ejercicio> ejerciciosTiron = new ArrayList<>();
        List<Ejercicio> ejerciciosPierna = new ArrayList<>();

        for (String nombreEj : listaEjerciciosEmpuje) {
            ejerciciosEmpuje.add(new Ejercicio(nombreEj, 8, 2, Enum.Ejercicio.EMPUJE));
        }
        for (String nombreEj : listaEjerciciosTiron) {
            ejerciciosTiron.add(new Ejercicio(nombreEj, 8, 2, Enum.Ejercicio.TIRON));
        }
        for (String nombreEj : listaEjerciciosPierna) {
            ejerciciosPierna.add(new Ejercicio(nombreEj, 8, 2, Enum.Ejercicio.PIERNA));
        }

        return new Rutina(ejerciciosEmpuje, ejerciciosTiron, ejerciciosPierna);
    }
}//end FactoriaPrincipiante
