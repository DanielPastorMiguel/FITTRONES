/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.IteratorClientes;

/**
 *
 * @author Octavian
 */
public class IteradorConcreto implements Iterador {

    // Referencia al agregado concreto.
    private AgregadoConcreto agregado;

    // Indica la posición actual en la lista.
    private int indice = 0;

    /**
     * Constructor.
     *
     * @param agregado Agregado concreto.
     */
    public IteradorConcreto(AgregadoConcreto agregado) {
        this.agregado = agregado;
    }

    @Override
    public Object primero() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (!agregado.elementos.isEmpty()) {
            indice = 0;
            objeto = agregado.elementos.get(0);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

    @Override
    public Object siguiente() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.elementos.size()) {
            objeto = agregado.elementos.get(indice);
            indice++;
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }
    
    @Override
    public Object anterior() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.elementos.size()) {
            objeto = agregado.elementos.get(indice-1);
            indice--;
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

    @Override
    public boolean hayMas() {
        boolean resultado = true;
        if ( agregado.elementos.isEmpty() || indice >= agregado.elementos.size()) {
            resultado = false;
        }
        return resultado;
    }

    @Override
    public Object elementoActual() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.elementos.size()) {
            objeto = agregado.elementos.get(indice);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

}
