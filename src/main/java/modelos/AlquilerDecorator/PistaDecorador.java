package modelos.AlquilerDecorator;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:04
 */
public abstract class PistaDecorador extends Pista {

    public Pista pista;

    public PistaDecorador(Pista pista) {
        this.pista = pista;
    }

    public Pista getpista() {
        return pista;
    }

    public void setpista(Pista pista) {
        this.pista = pista;
    }
    

    @Override
    public abstract String getDescripcion();

    @Override
    public abstract double getPrecio();
    
 
}//end pistaDecorador
