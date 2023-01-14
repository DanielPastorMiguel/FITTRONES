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
	private IntEstrategiaOrdenadoActividades estrategiaOrdenadoActividades;
	private Usuario usuario;
	private AlquilerPista alquilerPista;
	private Aplicacion aplicacion;
	private Mediador mediador;
        private List<Actividad> actividades;

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
            estrategiaOrdenadoActividades = estrategiaOrdenado;
	}
        
        public void ejecutarEstrategiaOrdenacion(){
            estrategiaOrdenadoActividades.ordenarActividades(actividades);
        }
}//end Aplicacion