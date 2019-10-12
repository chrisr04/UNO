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
public enum CartaColor {
    
    /**
     * colores de la ennumeracion 
     */
    rojo,

    amarillo,
    
    azul,

    verde,

    negro; 
	

    /**
     * @return Devuelve los colores "regulares" de la enumeracion
     */
	public static CartaColor[] obtenerColor(){
		return new CartaColor[]{rojo,amarillo,azul,verde};
	}


    /**
     * @return Devuelve los colores "especiales" de la enumeracion (realmente solo es el negro)
     */
	public static CartaColor[] obtenerColorComodin(){
		return new CartaColor[]{negro};
	}
    
}
