package modelos;

import java.util.Date;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:21
 */
public class Factura {

    private int cif;
    private String concepto;
    private int descuento;
    private int dni;
    private Date fecha;
    private int nombre;
    private int precio;
    public Aplicacion aplicacion;

    public Factura() {
    }

    public Factura(int cif, String concepto, int descuento, int dni, Date fecha, int nombre, int precio, Aplicacion aplicacion) {
        this.cif = cif;
        this.concepto = concepto;
        this.descuento = descuento;
        this.dni = dni;
        this.fecha = fecha;
        this.nombre = nombre;
        this.precio = precio;
        this.aplicacion = aplicacion;
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Aplicacion getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }

    @Override
    public String toString() {
        return "Factura{" + "cif=" + cif + ", concepto=" + concepto + ", descuento=" + descuento + ", dni=" + dni + ", fecha=" + fecha + ", nombre=" + nombre + ", precio=" + precio + ", aplicacion=" + aplicacion + '}';
    }

}//end Factura
