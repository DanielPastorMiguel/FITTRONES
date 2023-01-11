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

    @Override
    public void añadirDescuento(Descuento descuento) {
    }

    @Override
    public void eliminarDescuento(Descuento descuento) {
    }

    @Override
    public int getAllPorcentajeDescuentos() {
        return 12;
    }

    @Override
    public String getDescripcion() {
        return "Descuento joven";
    }
}//end DescuentoJoven
