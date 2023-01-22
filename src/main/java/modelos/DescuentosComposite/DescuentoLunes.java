package modelos.DescuentosComposite;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:11
 */
public class DescuentoLunes extends Descuento {

    public DescuentoLunes(double porcentajeDesccuento, String tipoDescuento) {
        super(porcentajeDesccuento, tipoDescuento);
    }
    
    public DescuentoLunes(){}

    @Override
    public String getDescripcion() {
        return "Descuento lunes: "+getPorcentajeDescuento()+"%";
    }

    @Override
    public double getPorcentajeDescuento() {
        return 5;
    }
}//end DescuentoLunes
