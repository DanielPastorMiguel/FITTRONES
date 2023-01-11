package modelos.DescuentosComposite;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:11
 */
public class DescuentoMiercoles extends Descuento {

    public DescuentoMiercoles(double porcentajeDesccuento, String tipoDescuento) {
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
        return " Descuento Miércoles";
    }

    @Override
    public int getAllPorcentajeDescuentos() {
        return 5;
    }
}//end DescuentoMiercoles
