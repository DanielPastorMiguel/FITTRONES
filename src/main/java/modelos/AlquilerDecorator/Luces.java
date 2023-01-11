package modelos.AlquilerDecorator;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:29
 */
public class Luces extends AlquilerPistaDecorador {

    public Luces(AlquilerPista alquilerPista) {
        super(alquilerPista);
    }


    @Override
    public String getDescripcion() {
        return alquilerPista.getDescripcion() + ", con luces";
    }

    @Override
    public double getPrecio() {
        return alquilerPista.getPrecio() + 2.50;
    }


}//end Luces