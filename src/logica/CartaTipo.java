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
public enum CartaTipo {

    /**
     * tipos de cartas 
     */
    cero,

    uno,

    dos,

    tres,

    cuatro,

    cinco,

    seis,

    siete,

    ocho,

    nueve,

    tomaDos,

    salta,

    reversa,

    masCuatro,

    cambioColor;

    /**
     * @return Devuelve los tipos regulares de cartas (presentes en los colores regulares)
     */
	public static CartaTipo[] obtenerNumero(){
		return new CartaTipo[]{cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,tomaDos,salta,reversa};
	}
        

    /**
     * @return Devuelve los tipos especiales de cartas (presentes solo en el negro)
     */
        public static CartaTipo[] obtenerComodin(){
		return new CartaTipo[]{masCuatro,cambioColor};
	}
}
