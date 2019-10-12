/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Christian Rodriguez
 * 
 */
public class Desecho {
    
    private ArrayList <Carta> desecho;

    /**
     * constructor de la clase desecho
     * @param desecho recibe el arraylist de cartas que tendra el desecho
     */
    public Desecho(ArrayList<Carta> desecho) {
        this.desecho = desecho;
    }

    /**
     * sirve para obtener la lista de cartas del desecho
     * @return devuelve el araylist del cartas del desecho
     */
    public ArrayList<Carta> getDesecho() {
        return desecho;
    }

    /**
     * sirve para modificar la lista de cartas en el desecho
     * @param desecho recibe como parametro la nueva lista de cartas que se modificara
     */
    public void setDesecho(ArrayList<Carta> desecho) {
        this.desecho = desecho;
    }
    
    /**
     * sirve para agregar una carta a la pila del desecho
     * @param cart recibe como parametro la carta a poner
     */
    public void ponerDesecho(Carta cart)
    {
        desecho.add(cart);
    }
    
    /**
     * sirve para conocer la utima carta en el desecho
     * @return devuelve un objeto tipo carta
     */
    public Carta obtenerDesecho()
    {
        int index;
        index = desecho.size()-1;
        return desecho.get(index);
    }
}
