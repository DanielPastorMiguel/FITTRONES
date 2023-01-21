package modelos.FabricaRutina;

import java.io.Serializable;
import java.util.List;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:34
 */
public class Rutina implements Serializable{

    private List<Ejercicio> ejerciciosEmpuje;
    private List<Ejercicio> ejerciciosTiron;
    private List<Ejercicio> ejerciciosPierna;

    public Rutina(List<Ejercicio> ejerciciosEmpuje, List<Ejercicio> ejerciciosTiron, List<Ejercicio> ejerciciosPierna) {
        this.ejerciciosEmpuje = ejerciciosEmpuje;
        this.ejerciciosTiron = ejerciciosTiron;
        this.ejerciciosPierna = ejerciciosPierna;
    }

    public List<Ejercicio> getEjerciciosEmpuje() {
        return ejerciciosEmpuje;
    }

    public List<Ejercicio> getEjerciciosTiron() {
        return ejerciciosTiron;
    }

    public List<Ejercicio> getEjerciciosPierna() {
        return ejerciciosPierna;
    }

}//end Rutina
