package modelos.AlquilerDecorator;

import java.util.HashMap;
import modelos.AlquilerState.IntEstadoPista;
import modelos.Usuarios.Cliente;
import modelos.Usuarios.Socio;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:02
 */
public class AlquilerPista {

    private HashMap alquilerLunes;
    private HashMap alquilerMartes;
    private HashMap alquilerMiercoles;
    private HashMap alquilerJueves;
    private HashMap alquilerViernes;
    private String complementos;
    private int numPista;
    private double precio;
    private String descripcion;
    public IntEstadoPista estadoPista;
    public Cliente cliente;
    public Socio socio;

    public AlquilerPista(HashMap alquilerLunes, HashMap alquilerMartes, HashMap alquilerMiercoles, HashMap alquilerJueves, HashMap alquilerViernes, String complementos, int numPista, String descripcion, IntEstadoPista estadoPista, Cliente cliente, Socio socio) {
        this.alquilerLunes = alquilerLunes;
        this.alquilerMartes = alquilerMartes;
        this.alquilerMiercoles = alquilerMiercoles;
        this.alquilerJueves = alquilerJueves;
        this.alquilerViernes = alquilerViernes;
        this.complementos = complementos;
        this.numPista = numPista;
        this.precio = 10;
        this.descripcion = descripcion; //Pista padel o  Pista futbol...
        this.estadoPista = estadoPista;
        this.cliente = cliente;
        this.socio = socio;
    }

    public AlquilerPista() {
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

    public String getComplementos() {
        return complementos;
    }

    public void setComplementos(String complementos) {
        this.complementos = complementos;
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

    public IntEstadoPista getEstadoPista() {
        return estadoPista;
    }

    public void setEstadoPista(IntEstadoPista estadoPista) {
        this.estadoPista = estadoPista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

}//end AlquilerPista
