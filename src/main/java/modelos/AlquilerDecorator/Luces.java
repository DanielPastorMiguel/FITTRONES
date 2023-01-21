package modelos.AlquilerDecorator;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:29
 */
public class Luces extends PistaDecorador {

    public Luces(Pista pista) {
        super(pista);
    }


    @Override
    public String getDescripcion() {
        return pista.getDescripcion() + " + luces";
    }

    @Override
    public double getPrecio() {
        return pista.getPrecio() + 2.50;
    }


}//end Luces