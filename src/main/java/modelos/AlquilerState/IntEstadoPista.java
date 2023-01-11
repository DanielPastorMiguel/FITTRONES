package modelos.AlquilerState;

import modelos.AlquilerDecorator.AlquilerPista;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:26
 */
public interface IntEstadoPista {

        /**
         * Modifica el estado de la pista
         * @param pista 
         */
	public void alquilarPista(AlquilerPista pista);

}