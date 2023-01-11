package modelos.DescuentosComposite;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:12
 */
public class DescuentoSocio extends Descuento {

    public DescuentoSocio(double porcentajeDesccuento, String tipoDescuento) {
        super(porcentajeDesccuento, tipoDescuento);
    }

    @Override
    public void añadirDescuento(Descuento descuento) {
    }

    @Override
    public void eliminarDescuento(Descuento descuento) {
    }

    @Override
    public String getDescripcion() {
        return "Descuento socio";
    }

    @Override
    public int getAllPorcentajeDescuentos() {
        return 10;
    }
}//end DescuentoSocio
