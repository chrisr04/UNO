/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;
import logica.Carta;
import logica.Jugador;

/**
 *
 * @author Christian Rodriguez 
 * 
 */
public interface UnoInterfaz {
    
    /**
     *Inicia la sesion en el juego
     * @param nombres le permite al usuario colocar su nickname
     * @return devuelve verdadero si los nombres no se repiten y falso en caso contrario o este vacio
     */
    public boolean iniciarSesion(ArrayList <String> nombres);

    /**
     *Cierra la sesion en el juego
     * le permite al usuario retirarse del juego
     * @param jugador recibe como parametro un objeto tipo Jugador correspondiente a el jugador por salir
     */
    public void cerrarSesion(Jugador jugador);

    /**
     * @return devuelve la lista de jugadores 
     */
    public ArrayList <Jugador> getJugadores();
    
     /**
     *Este metodo se utiliza para inicializar la baraja,revolver las cartas e inicializar el desecho.
     */
    public  void iniciarPartida();

    /**
     *toma el ArrayList de cartas de la baraja y reparte 7 cartas a cada jugador
     */
    public void repartirCarta();

    /**
     * toma una carta de la baraja y la pone en la mano del jugador 
     * @param jugador se le ingresa al jugador en turno
     * @return develve la carta tomada para agregarla al panel de cartas del jugador en turno
     */
    public Carta tomarCarta(Jugador jugador);

    /**
     * permite poner una carta de la mano del jugador en el desecho
     * @param cartE recibe la posicion de la carta a poner en el desecho
     * @return devuelve la carta colocada en el desecho
     */
    public Carta ponerCarta(int cartE);

    /**
     * permite verificar si en la mano del jugador tiene una carta tomaDos y masCuatro
     * @param mano le pasa la lista de cartas que tiene la mano del jugador en turno
     * @return devuelve verdadero si tiene un tomaDos o un masCuatro en la mano
     */
    public boolean verificarAumento(ArrayList<Carta> mano);

    /**
     * verifica si la carta que desea colocar es compatible con la carta que esta en el desecho
     * @param carta le pasa la carta que eligio para colocar en el desecho 
     * @return devuelve verdadero si coincide la carta y falso si la carta no coincide con la que esta en el desecho
     */
    public boolean verificarCarta(Carta carta);

   
    /**
     * verifica si una carta especifica esta en la mano del jugador 
     * y asi le permite saber si esa misma carta esta repetida en la mano del mismo jugador para asi colocar ambas si el jugador lo desea
     * @param carta le pasa la carta que eligio para colocar en el desecho
     * @return devuelve la posicion de la carta que esta repetida en la mano 
     */
    //public int verificarCartaRepetida(Carta carta);

    /**
     * cambia el color de la carta cuando sea un comodin de cambia color o un masCuatro
     * @param color le pasa el nuevo color elegido por el usuario
     * @param Tipo Se le pasa el tipo ya sea mas cuatro o cambia color
     */
    public void cambiarColor(String color, String Tipo);

    /**
     * obtiene el turno actual del jugador
     * @return devuelve el turnno
     */
    public int getTurno();

    /**
     * cambia el turno actual al turno del jugador siguiente ya sea a la izquierda o a la derecha dependiendo de la variable "sentido"
     */
    public void cambiarTurno();

    /**
     * al terminarse las cartas en la baraja toma todas las cartas del desecho a excepcion de la ultima para pasarlas nuevamente a la baraja 
     * y asi seguir con el juego
     */
    public void finalizarBaraja();

    /**
     * permite saber si la persona que tiene una carta dijo UNO o si lo dijo el jugador siguiente
     * @return deuelve falso si el usuario que le quedo una sola carta dice uno y verdadero si lo dice el siguiente
     */
    public boolean decirUno();

    /**
     * toma una carta para darle su valor en puntos 
     * @param carta le pasa la carta de la mano del jugador
     * @return devulve el puntaje de la carta
     */
    public int puntajeCarta(Carta carta);

    /**
     * suma las cartas de los jugarores para asi obtener el puntaje del jugador que gano la partida
     * @return devuelve el puntaje total obtenido al sumar todas las cartas que se encuentran en la mano de cada jugador
     */
    public int sumarPuntos();
    
     /**
     * elimina todas las cartas, cierra las sesiones de los jugadores activos y cierra el programa
     */
    public void finJuego();
}
