package modelos;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import modelos.Usuarios.Socio;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:34
 */
public class Sauna implements Serializable{

    private HashMap<LocalTime, List<Socio>> alquilerLunes;
    private HashMap<LocalTime, List<Socio>> alquilerMartes;
    private HashMap<LocalTime, List<Socio>> alquilerMiercoles;
    private HashMap<LocalTime, List<Socio>> alquilerJueves;
    private HashMap<LocalTime, List<Socio>> alquilerViernes;
    private int aforoMax;
    
    public Sauna(){
        alquilerLunes = new HashMap<>(){{put(LocalTime.of(10,0), new ArrayList<>()); put(LocalTime.of(11,0), new ArrayList<>()); put(LocalTime.of(12,0), new ArrayList<>()); put(LocalTime.of(13,0), new ArrayList<>()); put(LocalTime.of(14,0), new ArrayList<>());}};
        alquilerMartes = new HashMap<>(){{put(LocalTime.of(10,0), new ArrayList<>()); put(LocalTime.of(11,0), new ArrayList<>()); put(LocalTime.of(12,0), new ArrayList<>()); put(LocalTime.of(13,0), new ArrayList<>()); put(LocalTime.of(14,0), new ArrayList<>());}};
        alquilerMiercoles = new HashMap<>(){{put(LocalTime.of(10,0), new ArrayList<>()); put(LocalTime.of(11,0), new ArrayList<>()); put(LocalTime.of(12,0), new ArrayList<>()); put(LocalTime.of(13,0), new ArrayList<>()); put(LocalTime.of(14,0), new ArrayList<>());}};
        alquilerJueves = new HashMap<>(){{put(LocalTime.of(10,0), new ArrayList<>()); put(LocalTime.of(11,0), new ArrayList<>()); put(LocalTime.of(12,0), new ArrayList<>()); put(LocalTime.of(13,0), new ArrayList<>()); put(LocalTime.of(14,0), new ArrayList<>());}};
        alquilerViernes = new HashMap<>(){{put(LocalTime.of(10,0), new ArrayList<>()); put(LocalTime.of(11,0), new ArrayList<>()); put(LocalTime.of(12,0), new ArrayList<>()); put(LocalTime.of(13,0), new ArrayList<>()); put(LocalTime.of(14,0), new ArrayList<>());}};
        aforoMax = 5;
    }

    public Sauna(HashMap alquilerLunes, HashMap alquilerMartes, HashMap alquilerMiercoles, HashMap alquilerJueves, HashMap alquilerViernes, int aforoMax) {
        this.alquilerJueves = alquilerJueves;
        this.alquilerLunes = alquilerLunes;
        this.alquilerMartes = alquilerMartes;
        this.alquilerMiercoles = alquilerMiercoles;
        this.alquilerViernes = alquilerViernes;
        this.aforoMax = aforoMax;
    }

    public int getAforoMax() {
        return aforoMax;
    }

    public void setAforoMax(int aforoMax) {
        this.aforoMax = aforoMax;
    }

    public HashMap getAlquilerJueves() {
        return alquilerJueves;
    }

    public void setAlquilerJueves(HashMap alquilerJueves) {
        this.alquilerJueves = alquilerJueves;
    }

    public HashMap getAlquilerLunes() {
        return alquilerLunes;
    }

    public void setAlquilerLunes(HashMap alquilerLunes) {
        this.alquilerLunes = alquilerLunes;
    }

    public HashMap getAlquilerMartes() {
        return alquilerMartes;
    }

    public void setAlquilerMartes(HashMap alquilerMartes) {
        this.alquilerMartes = alquilerMartes;
    }

    public HashMap getAlquilerMiercoles() {
        return alquilerMiercoles;
    }

    public void setAlquilerMiercoles(HashMap alquilerMiercoles) {
        this.alquilerMiercoles = alquilerMiercoles;
    }

    public HashMap getAlquilerViernes() {
        return alquilerViernes;
    }

    public void setAlquilerViernes(HashMap alquilerViernes) {
        this.alquilerViernes = alquilerViernes;
    }

    @Override
    public String toString() {
        return "Sauna{" + "alquilerJueves=" + alquilerJueves + ", alquilerLunes=" + alquilerLunes + ", alquilerMartes=" + alquilerMartes + ", alquilerMiercoles=" + alquilerMiercoles + ", alquilerViernes=" + alquilerViernes + '}';
    }

}//end Sauna
