package modelos.Usuarios;

import modelos.Actividad;
import modelos.Clase;
import modelos.DietaBuilder.Dieta;
import modelos.ProxyProteccionClientes;
import modelos.FabricaRutina.Rutina;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:35
 */
public class Socio extends Usuario implements IntCliente, IntSuscriptor {

	private int codSocio;
	public Clase clase;
	public Dieta dieta;
	public Rutina rutina;
	public Actividad actividad;
	public ProxyProteccionClientes proxyProteccionClientes;

	public Socio(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void actualizar(){

	}

	public void getInformacionCliente(){

	}
}//end Socio