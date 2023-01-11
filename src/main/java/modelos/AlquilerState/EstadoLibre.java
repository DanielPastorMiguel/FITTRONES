package modelos.AlquilerState;

import modelos.AlquilerDecorator.AlquilerPista;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:17
 */
public class EstadoLibre implements IntEstadoPista {

	public EstadoLibre(){

	}

    @Override
    public void alquilarPista(AlquilerPista pista) {
        System.out.println("Liberando pista: " + pista.getNumPista() );
        
    }

}//end EstadoLibre