package modelos.Usuarios;

import modelos.ProxyProteccionClientes;



/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:08
 */
public class Cliente extends Usuario implements IntCliente {

	public ProxyProteccionClientes m_ProxyProteccionClientes;

	public Cliente(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void getInformacionCliente(){

	}
}//end Cliente