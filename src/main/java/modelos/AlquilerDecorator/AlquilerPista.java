package modelos.AlquilerDecorator;

import java.util.HashMap;
import modelos.Usuarios.Cliente;
import modelos.AlquilerState.IntEstadoPista;
import modelos.Usuarios.Socio;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:02
 */
public class AlquilerPista {

	private HashMap alquilerJueves;
	private HashMap alquilerLunes;
	private HashMap alquilerMartes;
	private HashMap alquilerMiercoles;
	private HashMap alquilerViernes;
	private String complementos;
	private int numPista;
	private int precio;
	private Enum tipo;
	public IntEstadoPista m_IntEstadoPista;
	public Cliente m_Cliente;
	public Socio m_Socio;

	public AlquilerPista(){

	}

	public void finalize() throws Throwable {

	}
}//end AlquilerPista