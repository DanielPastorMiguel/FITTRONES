package modelos.FabricaRutina;

import java.util.List;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:34
 */
public class Rutina {

    private List<Ejercicio> ejerciciosEmpuje;
    private List<Ejercicio> ejerciciosTiron;
    private List<Ejercicio> ejerciciosPierna;

    public Rutina(List<Ejercicio> ejerciciosEmpuje, List<Ejercicio> ejerciciosTiron, List<Ejercicio> ejerciciosPierna) {
        this.ejerciciosEmpuje = ejerciciosEmpuje;
        this.ejerciciosTiron = ejerciciosTiron;
        this.ejerciciosPierna = ejerciciosPierna;
    }

}//end Rutina
