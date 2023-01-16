package modelos.FabricaRutina;

import java.util.List;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:19
 */
public abstract class FabricaRutina {

    protected List<String> listaEjerciciosEmpuje = List.of("Press banca", "Press militar", "Press frances", "Cruce de cables");
    protected List<String> listaEjerciciosTiron = List.of("Remo con barra", "Curl biceps", "Jalon al pecho", "Remo gironda");
    protected List<String> listaEjerciciosPierna = List.of("Sentadilla", "Prensa", "RDL", "Extension cuadriceps");

    public abstract Rutina crearEjercicios();

}
