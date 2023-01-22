package modelos.DescuentosComposite;

import java.util.ArrayList;
import java.util.List;

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
    
    public DescuentoCompuesto(){
        listaDescuentos = new ArrayList<>();
    }

    public List<Descuento> getListaDescuentos() {
        return listaDescuentos;
    }

    /**
     * Añade un nuevo descuento
     *
     * @param descuento
     */
    public void añadirDescuento(Descuento descuento) {
        listaDescuentos.add(descuento);
    }

    /**
     * Elimina un descuento aplicado
     *
     * @param descuento
     */
    public void eliminarDescuento(Descuento descuento) {
        listaDescuentos.remove(descuento);
    }
    
    /**
     * Devuelve la descripcion de los descuentos aplicados
     * @return 
     */
    @Override
    public String getDescripcion() {
        String descripcion = "";
        for(Descuento d: listaDescuentos){
            descripcion += d.getDescripcion() + "\n";
        }
        return descripcion;
    }

    /**
     * Devuelve todos los descuentos aplicados
     * @return 
     */
    @Override
    public double getPorcentajeDescuento() {
        double porcentaje = 0;
        for(Descuento d: listaDescuentos) {
            porcentaje += d.getPorcentajeDescuento();
        }
        return porcentaje;
    }

}//end DescuentoCompuesto
