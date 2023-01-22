package modelos.DescuentosComposite;

import modelos.Usuarios.Socio;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:10
 */
public abstract class Descuento {

    public double porcentajeDescuento;
    public String descripcion;

    public Descuento(double porcentajeDesccuento, String tipoDescuento) {
        this.porcentajeDescuento = porcentajeDesccuento;
        this.descripcion = tipoDescuento;
    }
    
    public Descuento(){}

    /* ------------------- MÉTODOS ABSTRACTOS -------------*/
    
    /**
     * Devuelve el tipo del descuento
     *
     * @return
     */
    public abstract String getDescripcion();

    /**
     * Devuelve el porcentaje de descuentos
     *
     * @return
     */
    public abstract double getPorcentajeDescuento();
}
