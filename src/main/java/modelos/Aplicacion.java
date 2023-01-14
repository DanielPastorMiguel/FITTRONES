package modelos;

import java.util.ArrayList;
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
        
        /**
         * Patron Singleton
         * @return 
         */
        public Aplicacion getInstancia(){
            if (instancia == null) instancia = new Aplicacion();
            return instancia;
        }
        
	private IntEstrategiaOrdenadoActividades estrategiaOrdenadoActividades;
	private Usuario usuario;
	private AlquilerPista alquilerPista;
	private Aplicacion aplicacion;
	private Mediador mediador;
        
        private Usuario usuarioLogueado;
        private List<Usuario> usuariosRegistrados = new ArrayList<>();
        private List<Actividad> actividades = new ArrayList<>(); 
        private List<Clase> clases = new ArrayList<>();
        private List<AlquilerPista> pistas = new ArrayList<>();
        

	public void alquilarPista(){

	}

	public void apuntarSocioClase(){

	}

	public void ejecutarEstrategiaOrdenadoActividades(){
            estrategiaOrdenadoActividades.ordenarActividades(actividades);
	}

	public void generarFactura(){

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