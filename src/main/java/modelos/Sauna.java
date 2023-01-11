package modelos;

import modelos.Usuarios.Socio;
import java.util.HashMap;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:34
 */
public class Sauna implements IntActividad {

    private HashMap alquilerJueves;
    private HashMap alquilerLunes;
    private HashMap alquilerMartes;
    private HashMap alquilerMiercoles;
    private HashMap alquilerViernes;
    public Socio socio; //creo que sobra

    public Sauna() {

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

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Sauna{" + "alquilerJueves=" + alquilerJueves + ", alquilerLunes=" + alquilerLunes + ", alquilerMartes=" + alquilerMartes + ", alquilerMiercoles=" + alquilerMiercoles + ", alquilerViernes=" + alquilerViernes + ", socio=" + socio + '}';
    }


    
}//end Sauna
