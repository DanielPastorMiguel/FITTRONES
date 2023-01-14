package modelos.FabricaRutina;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:20
 */
public class FactoriaAvanzado extends FabricaRutina {

    public Rutina crearEjercicios() {
        List<Ejercicio> ejerciciosEmpuje = new ArrayList<>();
        List<Ejercicio> ejerciciosTiron = new ArrayList<>();
        List<Ejercicio> ejerciciosPierna = new ArrayList<>();

        for (String nombreEj : listaEjerciciosEmpuje) {
            ejerciciosEmpuje.add(new Ejercicio(nombreEj, 12, 4, utiles.Enum.Ejercicio.EMPUJE));
        }
        for (String nombreEj : listaEjerciciosTiron) {
            ejerciciosTiron.add(new Ejercicio(nombreEj, 12, 4, utiles.Enum.Ejercicio.TIRON));
        }
        for (String nombreEj : listaEjerciciosPierna) {
            ejerciciosPierna.add(new Ejercicio(nombreEj, 12, 4, utiles.Enum.Ejercicio.PIERNA));
        }

        return new Rutina(ejerciciosEmpuje, ejerciciosTiron, ejerciciosPierna);
    }
}//end FactoriaAvanzado
