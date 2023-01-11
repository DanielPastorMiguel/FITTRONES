package modelos;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:00
 */
public class Actividad implements IntActividad {

    private Enum dia;
    private int horario;
    private int inscritos;
    private Enum tipo;

    public Actividad() {

    }

    public Enum getDia() {
        return dia;
    }

    public void setDia(Enum dia) {
        this.dia = dia;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getInscritos() {
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

}//end Actividad
