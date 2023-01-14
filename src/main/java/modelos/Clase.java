package modelos;

import java.util.ArrayList;
import modelos.Usuarios.IntSuscriptor;
import java.util.HashMap;
import java.util.List;
import modelos.Usuarios.Socio;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:07
 */
public class Clase {

    private HashMap horario;
    private int inscritos;
    private Enum nivel;
    private int numPista;
    private int plazasMax;
    private Enum tipo;
    public IntSuscriptor intSuscriptor;
    private List<Socio> sociosInscritos = new ArrayList<>();
    private List<Socio> sociosInscritosNotificaciones = new ArrayList<>();

    public Clase(HashMap horario, int inscritos, Enum nivel, int numPista, int plazasMax, Enum tipo, IntSuscriptor intSuscriptor, List<Socio> sociosInscritos) {
        this.horario = horario;
        this.inscritos = inscritos;
        this.nivel = nivel;
        this.numPista = numPista;
        this.plazasMax = plazasMax;
        this.tipo = tipo;
        this.intSuscriptor = intSuscriptor;
        this.sociosInscritos = sociosInscritos;
    }

    public Clase() {
    }

    public HashMap getHorario() {
        return horario;
    }

    public void setHorario(HashMap horario) {
        this.horario = horario;
    }

    public int getInscritos() {
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    public Enum getNivel() {
        return nivel;
    }

    public void setNivel(Enum nivel) {
        this.nivel = nivel;
    }

    public int getNumPista() {
        return numPista;
    }

    public void setNumPista(int numPista) {
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

    public IntSuscriptor getIntSuscriptor() {
        return intSuscriptor;
    }

    public void setIntSuscriptor(IntSuscriptor intSuscriptor) {
        this.intSuscriptor = intSuscriptor;
    }

    /**
     * Apunta el socio a la clase
     *
     * @param s
     */
    public void apuntarSocioClase(Socio s) {
        if (this.plazasMax == this.inscritos) {
            suscribirse(s);
        } else {
            sociosInscritos.add(s);
        }
    }

    /**
     * Desapunta el socio de la clase
     *
     * @param s
     */
    public void desapuntarSocioClase(Socio s) {
        if (this.plazasMax == this.inscritos) {
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
            s.getListaNotificaciones().add("La clase: " + this.getTipo() + " tiene: " + (this.plazasMax - this.inscritos) + " plazas disponibles");
        }
    }

    @Override
    public String toString() {
        return "Clase{" + "horario=" + horario + ", inscritos=" + inscritos + ", nivel=" + nivel + ", numPista=" + numPista + ", plazasMax=" + plazasMax + ", tipo=" + tipo + ", intSuscriptor=" + intSuscriptor + '}';
    }
}//end Clase
