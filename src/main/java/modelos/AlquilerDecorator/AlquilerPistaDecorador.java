package modelos.AlquilerDecorator;



/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:04
 */
public class AlquilerPistaDecorador extends AlquilerPista {

	public AlquilerPista m_AlquilerPista;

	public AlquilerPistaDecorador(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end AlquilerPistaDecorador