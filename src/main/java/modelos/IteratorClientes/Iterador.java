/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos.IteratorClientes;

/**
 *
 * @author Octavian
 */
public interface Iterador {

    /**
     * Devuelve el primer elemento de la lista.
     *
     * @return Primer elemento de la lista.
     * @throws IndexOutOfBoundsException
     */
    Object primero() throws IndexOutOfBoundsException;
    
    /**
     * Devuelve el ultimo elemento de la lista.
     * @return Ultimo elemento de la lista.
     * @throws IndexOutOfBoundsException 
     */
    Object ultimo() throws IndexOutOfBoundsException;

    /**
     * Devuelve el siguiente elemento de la lista.
     *
     * @return Siguiente elemento de la lista.
     * @throws IndexOutOfBoundsException
     */
    Object siguiente() throws IndexOutOfBoundsException;
    
    /**
     * Devuelve el siguiente elemento de la lista.
     *
     * @return Siguiente elemento de la lista.
     * @throws IndexOutOfBoundsException
     */
    Object anterior() throws IndexOutOfBoundsException;

    /**
     * Devuelve true si hay más elementos en la lista y false en caso contrario.
     *
     * @return true si hay más elementos en la lista, false en caso contrario.
     */
    boolean hayMas();
    
    /**
     * Devuelve true si hay más elementos en la lista recorriendola hacia atras. False en caso contrario.
     * @return Devuelve true si hay más elementos en la lista recorriendola hacia atras. False en caso contrario.
     */
    boolean hayMenos();

    /**
     * Devuelve el elemento actual de la lista.
     *
     * @return Primer elemento actual de la lista.
     * @throws IndexOutOfBoundsException
     */
    Object elementoActual() throws IndexOutOfBoundsException;
}
