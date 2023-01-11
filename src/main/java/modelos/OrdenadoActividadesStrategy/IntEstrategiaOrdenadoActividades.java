package modelos.OrdenadoActividadesStrategy;

import java.util.List;
import modelos.Actividad;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:27
 */
public interface IntEstrategiaOrdenadoActividades {

	/**
	 * 
	 * @param actividades
	 */
	public void ordenarActividades(List<Actividad> actividades);

}