package modelos.AlquilerDecorator;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:04
 */
public abstract class AlquilerPistaDecorador extends Pista {

    public Pista alquilerPista;

    public AlquilerPistaDecorador(Pista alquilerPista) {
        this.alquilerPista = alquilerPista;
    }

    public Pista getAlquilerPista() {
        return alquilerPista;
    }

    public void setAlquilerPista(Pista alquilerPista) {
        this.alquilerPista = alquilerPista;
    }
    

    @Override
    public abstract String getDescripcion();

    @Override
    public abstract double getPrecio();
    
 
}//end AlquilerPistaDecorador
