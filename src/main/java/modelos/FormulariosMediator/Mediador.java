package modelos.FormulariosMediator;

import modelos.FormulariosMediator.ComponenteInterfaz;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:30
 */
public interface Mediador {

	//public ComponenteInterfaz m_ComponenteInterfaz;

	/**
	 * 
	 * @param emisor
	 * @param evento
	 */
	public void notificacion(ComponenteInterfaz emisor, Enum evento);

}