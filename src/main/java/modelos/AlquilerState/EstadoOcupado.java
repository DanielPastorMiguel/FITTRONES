package modelos.AlquilerState;

import modelos.AlquilerDecorator.Pista;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:17
 */
public class EstadoOcupado implements IntEstadoPista {

	public EstadoOcupado(){

	}


    @Override
    public void alquilarPista(Pista pista) {
        System.out.println("Alquilando pista: "  + pista.getNumPista());
        
    }
}//end EstadoOcupado