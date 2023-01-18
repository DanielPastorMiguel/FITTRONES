package modelos.AlquilerDecorator;

import java.io.Serializable;
import java.util.HashMap;
import modelos.Usuarios.Cliente;
import modelos.Usuarios.Socio;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:02
 */
public class Pista implements Serializable, Cloneable {

    private HashMap alquilerLunes;
    private HashMap alquilerMartes;
    private HashMap alquilerMiercoles;
    private HashMap alquilerJueves;
    private HashMap alquilerViernes;

    private String descripcion;
    private Enum numPista;
    private double precio;

    public Pista(HashMap alquilerLunes, HashMap alquilerMartes, HashMap alquilerMiercoles, HashMap alquilerJueves, HashMap alquilerViernes, Enum numPista, String descripcion) {

        this.alquilerLunes = alquilerLunes;
        this.alquilerMartes = alquilerMartes;
        this.alquilerMiercoles = alquilerMiercoles;
        this.alquilerJueves = alquilerJueves;
        this.alquilerViernes = alquilerViernes;

        this.numPista = numPista;
        this.precio = 10;
        this.descripcion = descripcion; //Pista padel o  Pista futbol... con material o luces o ambas

    }

    public Pista() {
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

    public HashMap getAlquilerJueves() {
        return alquilerJueves;
    }

    public void setAlquilerJueves(HashMap alquilerJueves) {
        this.alquilerJueves = alquilerJueves;
    }

    public HashMap getAlquilerViernes() {
        return alquilerViernes;
    }

    public void setAlquilerViernes(HashMap alquilerViernes) {
        this.alquilerViernes = alquilerViernes;
    }

    public Enum getNumPista() {
        return numPista;
    }

    public void setNumPista(Enum numPista) {
        this.numPista = numPista;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pista otra = null;
        try {
            // Clona el objeto: copia superficial.
            otra = (Pista) super.clone();
            // Ahora hacemos copia profunda.
            otra.alquilerLunes = (HashMap) alquilerLunes.clone();
            otra.alquilerMartes = (HashMap) alquilerMartes.clone();
            otra.alquilerMiercoles = (HashMap) alquilerMiercoles.clone();
            otra.alquilerJueves = (HashMap) alquilerJueves.clone();
            otra.alquilerViernes = (HashMap) alquilerViernes.clone();
        } catch (CloneNotSupportedException e) {
        }
        return otra;
    }

}//end pista
