package modelos.DescuentosComposite;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:12
 */
public class DescuentoSocio extends Descuento {

    public DescuentoSocio(double porcentajeDescuento, String tipoDescuento) {
        super(porcentajeDescuento, tipoDescuento);
    }
    
    public DescuentoSocio(){}

    @Override
    public String getDescripcion() {
        return "Descuento socio: "+getPorcentajeDescuento()+"%";
    }

    @Override
    public double getPorcentajeDescuento() {
        return 10;
    }
}//end DescuentoSocio
