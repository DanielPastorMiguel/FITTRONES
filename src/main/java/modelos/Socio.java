package modelos;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:35
 */
public class Socio extends Usuario implements IntCliente, IntSuscriptor {

	private int codSocio;
	public Clase m_Clase;
	public Dieta m_Dieta;
	public Rutina m_Rutina;
	public Actividad m_Actividad;
	public ProxyProteccionClientes m_ProxyProteccionClientes;

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