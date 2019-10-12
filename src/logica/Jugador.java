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
public class Jugador {
    
    private String nombre;
    private ArrayList <Carta> mano;
    private int puntos;
    
    /**
     * constructor de la clase jugador
     * @param nombre recibe como parametro el nombre del jugador
     */
    public Jugador(String nombre)
    {
        this.nombre = nombre;
        this.mano = null;
        this.puntos = 0;
    }
    
    /**
     * constructor de la clase jugador 
     * sirve para instanciar un objeto de tipo jugador con dos parametros
     * @param nombre recibe como parametro el  nombre del nuevo jugdor
     * @param mano recibe como parametro un arraylis de cartas para la mano del jugador
     */
    public Jugador(String nombre, ArrayList <Carta> mano) {
        this.nombre = nombre;
        this.mano = mano;
        this.puntos = 0;
    }

    /**
     * sirve para obtener el nombre del jugador
     * @return devuelve un string con el nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * sirve para cambiar el nombre del jugador
     * @param nombre recibe como parametro un string con el nombre del jugador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * sirve para obtener la mano de cartas de cada jugador
     * @return devuelve un arraylist de tipo carta
     */
    public ArrayList<Carta> getMano() {
        return mano;
    }

    /**
     *sirve para modificar la mano completa de cartas de cada jugador
     * @param mano recibe como parametro el arraylist de cartas que se modificara
     */
    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }
    
    /**
     * sirve para agregar una sola carta a la mano
     * @param carta recibe como parametro la carta a agregar
     */
    public void setMano(Carta carta)
    {
        mano.add(carta);
    } 

    /**
     * sirve para conocer los puntos que tine el jugador
     * @return devuelve los puntos del jugador
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * Sirve para para acumular los puntos que va adquiriendo el ususario en cada ronda 
     * @param puntos le pasa los puntos 
     */
    public void acumularPuntos(int puntos) {
        
        this.puntos += puntos;
    }
    
    
}
