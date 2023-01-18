package modelos.DietaBuilder;

import java.io.Serializable;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:12
 */
public class Dieta implements Serializable{

    private Menu lunes;
    private Menu martes;
    private Menu miercoles;
    private Menu jueves;
    private Menu viernes;
    private Menu sabado;
    private Menu domingo;

    private String tipoDieta;

    public Dieta() {
    }

    public Dieta(Menu domingo, Menu jueves, Menu lunes, Menu martes, Menu miercoles, Menu sabado, Menu viernes, String tipoDieta) {
        this.domingo = domingo;
        this.jueves = jueves;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.sabado = sabado;
        this.viernes = viernes;
        this.tipoDieta = tipoDieta;
    }

    public Menu getDomingo() {
        return domingo;
    }

    public void setDomingo(Menu domingo) {
        this.domingo = domingo;
    }

    public Menu getJueves() {
        return jueves;
    }

    public void setJueves(Menu jueves) {
        this.jueves = jueves;
    }

    public Menu getLunes() {
        return lunes;
    }

    public void setLunes(Menu lunes) {
        this.lunes = lunes;
    }

    public Menu getMartes() {
        return martes;
    }

    public void setMartes(Menu martes) {
        this.martes = martes;
    }

    public Menu getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(Menu miercoles) {
        this.miercoles = miercoles;
    }

    public Menu getSabado() {
        return sabado;
    }

    public void setSabado(Menu sabado) {
        this.sabado = sabado;
    }

    public Menu getViernes() {
        return viernes;
    }

    public void setViernes(Menu viernes) {
        this.viernes = viernes;
    }

    public String getTipoDieta() {
        return tipoDieta;
    }

    public void setTipoDieta(String tipoDieta) {
        this.tipoDieta = tipoDieta;
    }

    @Override
    public String toString() {
        return "Dieta{" + "domingo=" + domingo + ", jueves=" + jueves + ", lunes=" + lunes + ", martes=" + martes + ", miercoles=" + miercoles + ", sabado=" + sabado + ", viernes=" + viernes + ", tipoDieta=" + tipoDieta + '}';
    }

}//end Dieta
