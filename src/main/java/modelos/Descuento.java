

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:10
 */
public interface Descuento {

	public double porcentaje;
	public String tipo;
	public Socio m_Socio;

	/**
	 * 
	 * @param descuento
	 */
	public void añadirDescuento(Descuento descuento);

	/**
	 * 
	 * @param descuento
	 */
	public void eliminarDescuento(Descuento descuento);

}