package modelos.FabricaRutina;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:13
 */
public class Ejercicio {

    private int nombre;
    private int repeticiones;
    private int series;
    private Enum tipo;
    public FabricaRutina fabricaRutina;

    public Ejercicio() {

    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
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

    public FabricaRutina getFabricaRutina() {
        return fabricaRutina;
    }

    public void setFabricaRutina(FabricaRutina fabricaRutina) {
        this.fabricaRutina = fabricaRutina;
    }

    @Override
    public String toString() {
        return "Ejercicio{" + "nombre=" + nombre + ", repeticiones=" + repeticiones + ", series=" + series + ", tipo=" + tipo + ", fabricaRutina=" + fabricaRutina + '}';
    }

}//end Ejercicio
