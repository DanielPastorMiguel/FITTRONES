package modelos.DescuentosComposite;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:11
 */
public class DescuentoJoven extends Descuento {

    public DescuentoJoven(double porcentajeDesccuento, String tipoDescuento) {
        super(porcentajeDesccuento, tipoDescuento);
    }
    
    public DescuentoJoven(){}

    @Override
    public String getDescripcion() {
        return "Descuento joven: "+getPorcentajeDescuento()+"%";
    }
    
    @Override
    public double getPorcentajeDescuento() {
        return 12;
    }

}//end DescuentoJoven
