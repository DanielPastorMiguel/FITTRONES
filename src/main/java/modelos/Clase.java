package modelos;

import modelos.Usuarios.IntSuscriptor;
import java.util.HashMap;

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

    public Clase(HashMap horario, int inscritos, Enum nivel, int numPista, int plazasMax, Enum tipo, IntSuscriptor intSuscriptor) {
        this.horario = horario;
        this.inscritos = inscritos;
        this.nivel = nivel;
        this.numPista = numPista;
        this.plazasMax = plazasMax;
        this.tipo = tipo;
        this.intSuscriptor = intSuscriptor;
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

    public void desuscribirse() {

    }

    public void notificarSuscriptores() {

    }

    public void suscribirse() {

    }

    @Override
    public String toString() {
        return "Clase{" + "horario=" + horario + ", inscritos=" + inscritos + ", nivel=" + nivel + ", numPista=" + numPista + ", plazasMax=" + plazasMax + ", tipo=" + tipo + ", intSuscriptor=" + intSuscriptor + '}';
    }
}//end Clase
