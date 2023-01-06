package modelos;

import modelos.FormulariosMediator.Mediador;
import modelos.OrdenadoActividadesStrategy.IntEstrategiaOrdenadoActividades;
import modelos.Usuarios.Usuario;
import modelos.AlquilerDecorator.AlquilerPista;
import java.util.List;



/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:04
 */
public class Aplicacion {

	private Aplicacion instancia;
	public IntEstrategiaOrdenadoActividades m_IntEstrategiaOrdenadoActividades;
	public Usuario m_Usuario;
	public AlquilerPista m_AlquilerPista;
	public Aplicacion m_Aplicacion;
	public Mediador m_Mediador;

	public Aplicacion(){

	}

	public void finalize() throws Throwable {

	}
	public void alquilarPista(){

	}

	public void apuntarSocioClase(){

	}

	public List ejecutarEstrategiaOrdenadoActividades(){
		return null;
	}

	public void generarFactura(){

	}

	public Aplicacion getInstancia(){
		return null;
	}

	public void registrarSocio(){

	}

	/**
	 * 
	 * @param estrategiaOrdenado
	 */
	public void setEstrategiaOrdenadoActividades(IntEstrategiaOrdenadoActividades estrategiaOrdenado){

	}
}//end Aplicacion