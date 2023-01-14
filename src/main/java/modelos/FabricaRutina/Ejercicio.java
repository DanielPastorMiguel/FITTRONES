package modelos.FabricaRutina;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:13
 */
public class Ejercicio {

    private String nombre;
    private int repeticiones;
    private int series;
    private Enum tipo;

    public Ejercicio(String nombre, int repeticiones, int series, Enum tipo) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.series = series;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ejercicio{" + "nombre=" + nombre + ", repeticiones=" + repeticiones + ", series=" + series + ", tipo=" + tipo + '}';
    }

}//end Ejercicio
