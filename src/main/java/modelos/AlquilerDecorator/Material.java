package modelos.AlquilerDecorator;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:29
 */
public class Material extends PistaDecorador {

    public Material(Pista pista) {
        super(pista);
    }

    @Override
    public String getDescripcion() {
        return pista.getDescripcion() + " + material";
    }

    @Override
    public double getPrecio() {
        return pista.getPrecio() + 3;
    }

}//end Material
