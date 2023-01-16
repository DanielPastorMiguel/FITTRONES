package modelos.FabricaRutina;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:20
 */
public class FactoriaIntermedio extends FabricaRutina {

    public Rutina crearEjercicios() {
        List<Ejercicio> ejerciciosEmpuje = new ArrayList<>();
        List<Ejercicio> ejerciciosTiron = new ArrayList<>();
        List<Ejercicio> ejerciciosPierna = new ArrayList<>();

        for (String nombreEj : listaEjerciciosEmpuje) {
            ejerciciosEmpuje.add(new Ejercicio(nombreEj, 10, 3, utiles.Enum.EjercicioEnum.EMPUJE));
        }
        for (String nombreEj : listaEjerciciosTiron) {
            ejerciciosTiron.add(new Ejercicio(nombreEj, 10, 3, utiles.Enum.EjercicioEnum.TIRON));
        }
        for (String nombreEj : listaEjerciciosPierna) {
            ejerciciosPierna.add(new Ejercicio(nombreEj, 10, 3, utiles.Enum.EjercicioEnum.PIERNA));
        }

        return new Rutina(ejerciciosEmpuje, ejerciciosTiron, ejerciciosPierna);
    }
}//end FactoriaIntermedio
