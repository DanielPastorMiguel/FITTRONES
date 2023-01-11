package modelos.AlquilerDecorator;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:29
 */
public class Material extends AlquilerPistaDecorador {

    public Material(AlquilerPista alquilerPista) {
        super(alquilerPista);
    }

    @Override
    public String getDescripcion() {
        return alquilerPista.getDescripcion() + ", con material";
    }

    @Override
    public double getPrecio() {
        return alquilerPista.getPrecio() + 3;
    }

}//end Material
