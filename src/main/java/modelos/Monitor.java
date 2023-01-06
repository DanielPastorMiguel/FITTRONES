package modelos;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:31
 */
public class Monitor extends Empleado {

	public Socio m_Socio;
	public Actividad m_Actividad;
	public DietaBuilder m_DietaBuilder;

	public Monitor(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void crearDieta(){

	}
}//end Monitor