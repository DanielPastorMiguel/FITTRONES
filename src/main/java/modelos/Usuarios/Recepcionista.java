package modelos.Usuarios;

import modelos.ProxyProteccionClientes;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:33
 */
public class Recepcionista extends Empleado implements IntCliente {

	public ProxyProteccionClientes proxyProteccionClientes;

	public Recepcionista(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void getInformacionCliente(){

	}
}//end Recepcionista