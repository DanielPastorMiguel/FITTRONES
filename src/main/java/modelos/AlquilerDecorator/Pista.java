package modelos.AlquilerDecorator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import modelos.Usuarios.Cliente;
import modelos.Usuarios.Socio;
import modelos.Usuarios.Usuario;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:02
 */
public class Pista implements Serializable, Cloneable {

    private HashMap<String, Usuario> alquilerLunes;
    private HashMap<String, Usuario> alquilerMartes;
    private HashMap<String, Usuario> alquilerMiercoles;
    private HashMap<String, Usuario> alquilerJueves;
    private HashMap<String, Usuario> alquilerViernes;
    private int numPista;
    private String tipo;
    private double precio;
    private String descripcion;

    public Pista(HashMap alquilerLunes, HashMap alquilerMartes, HashMap alquilerMiercoles, HashMap alquilerJueves, HashMap alquilerViernes, int numPista, String descripcion, String tipo) {
        this.alquilerLunes = alquilerLunes;
        this.alquilerMartes = alquilerMartes;
        this.alquilerMiercoles = alquilerMiercoles;
        this.alquilerJueves = alquilerJueves;
        this.alquilerViernes = alquilerViernes;
        this.numPista = numPista;
        this.precio = 10;
        this.descripcion = descripcion;
        this.tipo=tipo;
    }
    
    public Pista(){
        
    }
    
    public boolean aAlquilado(Usuario user){
        if (alquilerLunes.values().contains(user)) return true;
        if (alquilerMartes.values().contains(user)) return true;
        if (alquilerMiercoles.values().contains(user)) return true;
        if (alquilerJueves.values().contains(user)) return true;
        return alquilerViernes.values().contains(user);
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

    public String getTipo() {
        return tipo;
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

    public int getNumPista() {
        return numPista;
    }

    public void setNumPista(int numPista) {
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
    public Object clone() throws CloneNotSupportedException {
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
            otra.numPista = numPista + 1;
        } catch (CloneNotSupportedException e) {
        }
        return otra;
    }

}//end pista
