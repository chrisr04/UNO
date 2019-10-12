/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Christian Rodriguez
 * 
 */
public class Carta {
    
     private  CartaColor color;
     private  CartaTipo tipo;

    /**
     * constructor de la clase carta 
     * se usa para instanciar objetos tipo carta
     * @param color recibe el color que tendra la carta
     * @param tipo recibe el tipo que tendra la carta
     */
    public Carta(CartaColor color, CartaTipo tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    /**
     * @return devuelve el color de la carta 
     */
    public CartaColor getColor() {
        return color;
    }

    /**
     * permite modificar el color de la carta 
     * @param color recibe como parametro el nuevo color 
     */
    public void setColor(CartaColor color) {
        this.color = color;
    }

    /**
     * @return devuelve el tipo de la carta
     */
    public CartaTipo getTipo() {
        return tipo;
    }

    /**
     * permite modificar el tipo de la carta
     * @param tipo recibe como parametro el nuevo tipo de carta 
     */
    public void setTipo(CartaTipo tipo) {
        this.tipo = tipo;
    }
}
