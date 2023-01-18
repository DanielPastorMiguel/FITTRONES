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
 * @created 06-ene.-2023 17:48:07
 */
public class Clase implements Serializable {

    private HashMap<Enum, LocalTime> horario;
    private int plazasMax;

    private Enum tipo;
    private Enum nivel;
    private Enum numPista;

    private List<Socio> sociosInscritos = new ArrayList<>();
    private List<Socio> sociosInscritosNotificaciones = new ArrayList<>();

    public Clase(HashMap horario, Enum nivel, Enum numPista, Enum tipo, int plazasMax, List<Socio> sociosInscritos) {
        this.horario = horario;
        this.nivel = nivel;
        this.numPista = numPista;
        this.plazasMax = plazasMax;
        this.tipo = tipo;
        this.sociosInscritos = sociosInscritos;
    }
    
    public String getInformacion(){
        return "horario: " + horario.toString();
    }

    public HashMap getHorario() {
        return horario;
    }

    public void setHorario(HashMap horario) {
        this.horario = horario;
    }

    public Enum getNivel() {
        return nivel;
    }

    public void setNivel(Enum nivel) {
        this.nivel = nivel;
    }

    public Enum getNumPista() {
        return numPista;
    }

    public void setNumPista(Enum numPista) {
        this.numPista = numPista;
    }

    public int getPlazasMax() {
        return plazasMax;
    }

    public void setPlazasMax(int plazasMax) {
        this.plazasMax = plazasMax;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    /**
     * Apunta el socio a la clase
     *
     * @param s
     * @return 
     */
    public boolean apuntarSocioClase(Socio s) {
        if (this.plazasMax == this.sociosInscritos.size()) {
            suscribirse(s);
            return false;
        } else {
            sociosInscritos.add(s);
            if (this.plazasMax == this.sociosInscritos.size()) {
                notificarSuscriptores();
            }
            return true;
        }
    }

    /**
     * Desapunta el socio de la clase
     *
     * @param s
     */
    public void desapuntarSocioClase(Socio s) {
        if (this.plazasMax == this.sociosInscritos.size()) {
            notificarSuscriptores();
        }
        this.sociosInscritos.remove(s);
    }

    /**
     * Apunta a un socio a la lista de notificaciones
     *
     * @param s
     */
    public void suscribirse(Socio s) {
        sociosInscritosNotificaciones.add(s);
    }

    /**
     * Desuscribe un socio de la lista de notificaciones
     *
     * @param s
     */
    public void desuscribir(Socio s) {
        sociosInscritosNotificaciones.remove(s);
    }

    /**
     * Notifica a los socios que estan en la lista de notificaciones
     */
    public void notificarSuscriptores() {
        for (Socio s : sociosInscritosNotificaciones) {
            if (this.plazasMax == this.sociosInscritos.size()) {
                s.getListaNotificaciones().add("La clase: " + this.getTipo() + " con nivel: " + this.getNivel() + " se ha llenado");
            } else {
                s.getListaNotificaciones().add("La clase: " + this.getTipo() + " con nivel: " + this.getNivel() + " tiene: " + (this.plazasMax - this.sociosInscritos.size()) + " plazas disponibles");
            }
        }
    }

    @Override
    public String toString() {
        return "Clase{" + "horario=" + horario + ", inscritos=" + sociosInscritos.size() + ", nivel=" + nivel + ", numPista=" + numPista + ", plazasMax=" + plazasMax + ", tipo=" + tipo + ", intSuscriptor=" + '}';
    }
}//end Clase
