/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.IteratorClientes;

import java.util.ArrayList;

/**
 *
 * @author Octavian
 */
public class AgregadoConcreto implements Agregado {
    
    // Lista de elementos a recorrer.
    public ArrayList elementos;

    /**
     * Constructor.
     *
     * @param vec Lista de elementos a recorrer.
     */
    public AgregadoConcreto(ArrayList vec) {
        elementos = vec;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorConcreto(this);
    }
}
