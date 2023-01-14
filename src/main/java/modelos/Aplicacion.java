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
	public IntEstrategiaOrdenadoActividades intEstrategiaOrdenadoActividades;
	public Usuario usuario;
	public AlquilerPista alquilerPista;
	public Aplicacion aplicacion;
	public Mediador mediador;

	public Aplicacion(){

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