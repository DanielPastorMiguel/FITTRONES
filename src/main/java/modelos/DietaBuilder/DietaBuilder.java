package modelos.DietaBuilder;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:12
 */
public interface DietaBuilder {

	//public Dieta m_Dieta;

	public void crearDietaDomingo();

	public void crearDietaJueves();

	public void crearDietaLunes();

	public void crearDietaMartes();

	public void crearDietaMiercoles();

	public void crearDietaSabado();

	public void crearDietaViernes();

	public Dieta getDieta();

}