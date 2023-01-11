package modelos.DescuentosComposite;

import java.util.ArrayList;
import java.util.List;
import modelos.Usuarios.Socio;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:10
 */
public class DescuentoCompuesto extends Descuento {

    private List<Descuento> listaDescuentos;

    public DescuentoCompuesto(double porcentajeDesccuento, String tipoDescuento) {
        super(porcentajeDesccuento, tipoDescuento);
        listaDescuentos = new ArrayList<>();
    }

    /**
     * Añade un nuevo descuento
     *
     * @param descuento
     */
    @Override
    public void añadirDescuento(Descuento descuento) {
        listaDescuentos.add(descuento);
    }

    /**
     * Elimina un descuento aplicado
     *
     * @param descuento
     */
    @Override
    public void eliminarDescuento(Descuento descuento) {
        listaDescuentos.remove(descuento);
    }

    /**
     * Devuelve todos los descuentos aplicados
     * @return 
     */
    @Override
    public int getAllPorcentajeDescuentos() {
        int porcentaje = getAllPorcentajeDescuentos();
        for(Descuento d: listaDescuentos) {
            porcentaje += d.getAllPorcentajeDescuentos();
        }
        return porcentaje;

    }

    @Override
    public String getDescripcion() {
        String descripcion = this.toString();
        for(Descuento d: listaDescuentos){
            descripcion += "\n\t### " + d.getDescripcion();
        }
        return descripcion;
    }

}//end DescuentoCompuesto
