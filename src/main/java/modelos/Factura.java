package modelos;

import java.util.Date;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:21
 */
public class Factura {

	private int cif;
	private String concepto;
	private int descuento;
	private int dni;
	private Date fecha;
	private int nombre;
	private int precio;
	public Aplicacion m_Aplicacion;

	public Factura(){

	}

	public void finalize() throws Throwable {

	}
}//end Factura