package modelos;

import java.io.Serializable;
import java.time.LocalDate;
import modelos.DescuentosComposite.Descuento;
import modelos.Usuarios.Usuario;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:21
 */
public class Factura implements Serializable {

    private int id;
    private String concepto;
    private Descuento descuento;
    private Usuario usuario;
    private LocalDate fecha;
    private double precio;

    public Factura() {
    }

    public Factura(int id, String concepto, Descuento descuento, Usuario usuario, LocalDate fecha, double precio) {
        this.id = id;
        this.concepto = concepto;
        this.descuento = descuento;
        this.usuario = usuario;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }  

}//end Factura
