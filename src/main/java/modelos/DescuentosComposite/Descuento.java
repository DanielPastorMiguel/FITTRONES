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

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public void setDescripcion(String tipoDescuento) {
        this.descripcion = tipoDescuento;
    }


    /* ------------------- MÉTODOS ABSTRACTOS -------------*/
    
    /**
     * Devuelve el tipo del descuento
     *
     * @return
     */
    public abstract String getDescripcion();


    /**
     *
     * @param descuento
     */
    public abstract void añadirDescuento(Descuento descuento);

    /**
     *
     * @param descuento
     */
    public abstract void eliminarDescuento(Descuento descuento);

    /**
     * Devuelve todos los descuentos
     *
     * @return
     */
    public abstract int getAllPorcentajeDescuentos();
}
