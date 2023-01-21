package modelos.DietaBuilder;

import java.io.Serializable;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:30
 */
public class Menu implements Serializable{

    private Plato cena;
    private Plato comida;
    private Plato desayuno;
    private Plato merienda;


    public Menu() {

    }

    public Menu(Plato cena, Plato comida, Plato desayuno, Plato merienda) {
        this.cena = cena;
        this.comida = comida;
        this.desayuno = desayuno;
        this.merienda = merienda;
    }

    public Plato getCena() {
        return cena;
    }

    public void setCena(Plato cena) {
        this.cena = cena;
    }

    public Plato getComida() {
        return comida;
    }

    public void setComida(Plato comida) {
        this.comida = comida;
    }

    public Plato getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(Plato desayuno) {
        this.desayuno = desayuno;
    }

    public Plato getMerienda() {
        return merienda;
    }

    public void setMerienda(Plato merienda) {
        this.merienda = merienda;
    }


    @Override
    public String toString() {
        return "Menu{" + "cena=" + cena + ", comida=" + comida + ", desayuno=" + desayuno + ", merienda=" + merienda + '}';
    }

}//end Menu
