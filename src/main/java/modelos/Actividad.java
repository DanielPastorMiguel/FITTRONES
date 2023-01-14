package modelos;

import java.sql.Time;
import java.util.List;
import modelos.Usuarios.Usuario;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:00
 */
public class Actividad{

    private Enum dia;
    private Enum tipo;

    private Time hora;
    private int aforo;
    private List<Usuario> usuariosInscritos;

    public Actividad() {

    }

    public Actividad(Enum dia, Time hora, List<Usuario> usuariosInscritos, Enum tipo) {
        this.dia = dia;
        this.hora = hora;
        this.usuariosInscritos = usuariosInscritos;
        this.tipo = tipo;
    }

    public Enum getDia() {
        return dia;
    }

    public void setDia(Enum dia) {
        this.dia = dia;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public List<Usuario> getUsuariosInscritos() {
        return usuariosInscritos;
    }

    public void setUsuariosInscritos(List<Usuario> usuariosInscritos) {
        this.usuariosInscritos = usuariosInscritos;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

}//end Actividad
