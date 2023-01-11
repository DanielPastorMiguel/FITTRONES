package modelos.DietaBuilder;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:32
 */
public class Plato {

    private int calorias;
    private String nombre;

    public Plato() {
    }

    public Plato(int calorias, String nombre) {
        this.calorias = calorias;
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Plato{" + "calorias=" + calorias + ", nombre=" + nombre + '}';
    }

}//end Plato
