/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import interfaz.UnoInterfaz;
import java.util.ArrayList;

/**
 *
 * @author Christian Rodriguez
 * 
 */
public class UnoImplementacion implements UnoInterfaz {

    ArrayList <Jugador> jugadores;
    Baraja baraja;
    Desecho desecho;
    int turno;
    int turnoUNO;
    int acumulador;
    boolean masCuatro;
    boolean masDos;
    boolean decirUNO;
    boolean saltar;
    boolean sentido;
    
    /**
     * Constructor de la clase UnoImplementacion
     * en ella se inicializan los objetos y variables necesarias para el funcionamiento del juego
     * y su interaccion con los controles del formulario de la presentacion
     */
    public UnoImplementacion() {
        this.jugadores = new ArrayList <>();
        this.baraja = new Baraja(new ArrayList<Carta>());
        this.desecho = new Desecho(new ArrayList<Carta>());
        this.turno = 0;
        this.acumulador = 1;
        this.masCuatro = false;
        this.masDos = false;
        this.saltar = false;
        this.sentido = true;
        this.decirUNO = false;
        this.turnoUNO = 0;
    }

    /**
     *la variable turnoUNO almacena la posicion del jugador que tiene una carta para que 
     * en caso de ser penalizado se pueda aplicar la sancion en el juego
     * @return devuelve un entero que representa la posicon del jugador a sancionar
     */
    public int getTurnoUNO() {
        return turnoUNO;
    }

    /**
     * es el metodo set para modificar la variable turnoUNO descrita anteriormente
     * @param turnoUNO recibe como parametro un entero con la nueva posicion
     */
    public void setTurnoUNO(int turnoUNO) {
        this.turnoUNO = turnoUNO;
    }
    
    /**
     * la variable decirUNO sirve para saber si el jugador que tiene una carta debe ser penalizado o no
     * @return devuelve un booleano, es true si el jugador debe ser penalizado y false si dijo uno a tiempo
     */
    public boolean isDecirUNO() {
        return decirUNO;
    }

    /**
     *es el metodo set para modificar la variable decirUNO descrita anteriormente
     * @param decirUNO recibe como parametro un booleano para modificar el valor de la variable
     */
    public void setDecirUNO(boolean decirUNO) {
        this.decirUNO = decirUNO;
    }
    
    /**
     * La variable saltar sirve para saber si se ha colocado una carta de saltar turno 
     * @return Devuelve un boolean donde si es true quiere decir que hay un saltar turno en el desecho
     */
    public boolean isSaltar() {
        return saltar;
    }

    /**
     * Este metodo set es para modificar el estado de la variable
     * @param saltar recibe como parametro un booleano para modificar el valor de la variable
     */
    public void setSaltar(boolean saltar) {
        this.saltar = saltar;
    }

    /**
     * La variable sentido sirve para saber hacia que direccion se esta jugando.
     * @return retorna true si se esta jugando de izquierda hacia derecha y false si se juega de derecha a izquierda.
     */
    public boolean isSentido() {
        return sentido;
    }

    /**
     * Este metodo se utiliza para modificar el valor de la variable sentido
     * @param sentido Recibe como parametro el nuevo valor boolean de la variable
     */
    public void setSentido(boolean sentido) {
        this.sentido = sentido;
    }
    
    /**
     * Este metodo lo usamos para para saber el valor boolean de la variable mas cuatro
     * @return Esta variable retorna true si hay un mas cuatro en juego y false si ya se ha comido el acumilado total de esta carta
     */
    public boolean isMasCuatro() {
        return masCuatro;
    }

    /**
     * Este metodo se utiliza para modificar la variable mas cuatro
     * @param masCuatro se utiliza como parametro el valor boolean a cambiar
     */
    public void setMasCuatro(boolean masCuatro) {
        this.masCuatro = masCuatro;
    }

    /**
     * Este metodo lo usamos para para saber el valor boolean de la variable mas dos
     * @return Esta variable retorna true si hay un mas dos en juego y false si ya se ha comido el acumilado total de esta carta
     */
    public boolean isMasDos() {
        return masDos;
    }

    /**
     *Este metodo se utiliza para modificar la variable mas dos
     * @param masDos se utiliza como parametro el valor boolean a cambiar
     */
    public void setMasDos(boolean masDos) {
        this.masDos = masDos;
    }

    /**
     * Este metodo se utiliza para saber el valor de la variable acumuladora que sirve para saber cuantas cartas debe comer el jugador
     * @return devuelve el entero con la cantidad de cartas a comer
     */
    public int getAcumulador() {
        return acumulador;
    }

    /**
     * Este metodo se usa para modificar el valor del acumulador 
     * @param acumulador Recibe como parametro la cantidad de cartas a comer
     */
    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }

    /**
     * Este metodo permite acceder al objeto baraja creado en la implementacion junto con todos sus metodos y atributos
     * @return Devuelve un objeto tipo baraja
     */
    public Baraja getObjBaraja() {
        return baraja;
    }

    /**
     * Este metodo lo usamos para modificar el objeto tipo baraja
     * @param baraja Usamos como parametro objeto baraja a modificar
     */
    public void setObjBaraja(Baraja baraja) {
        this.baraja = baraja;
    }

    /**
     *  Este metodo permite acceder al objeto desecho creado en la implementacion junto con todos sus metodos y atributos
     * @return Devuelve un objeto tipo desecho
     */
    public Desecho getObjDesecho() {
        return desecho;
    }

    /**
     *Este metodo lo usamos para modificar el objeto tipo desecho
     * @param desecho Usamos como parametro objeto desecho a modificar
     */
    public void setObjDesecho(Desecho desecho) {
        this.desecho = desecho;
    }
    
    @Override
    public boolean  iniciarSesion(ArrayList <String> nombres) {
        
        boolean resp=false;
        
        if(nombres.size()<5)
        {
            //se verifica si no hay nombres repetidos
            for (String jugador : nombres) {
                
                for (int i = nombres.indexOf(jugador)+1  ; i < nombres.size(); i++) {
                    
                    if(jugador.equals(nombres.get(i)))
                    {
                        return resp;
                    }
                }
            }
            //si sale del ciclo quiere decir que los nombres ingrasados son diferentes
            resp = true;
            for (String nombre : nombres) {      
                ArrayList <Carta> mano = new ArrayList<>();
                Jugador j = new Jugador(nombre,mano);
                this.jugadores.add(j);                
            }    
        }
        return resp;
    }

    @Override
    public void cerrarSesion(Jugador jugador) {

        int index=jugadores.indexOf(jugador);
        //se colocan las cartas del jugador que saldrá de nuevo en la baraja
        for (Carta mano : jugadores.get(turno).getMano()) {
            
            baraja.ponerCarta(mano);
        }
        jugadores.remove(index);
    }

    /**
     *
     */
    @Override
    public void iniciarPartida() {
       
        
        for (Jugador jugador : jugadores) {
            
            jugador.getMano().clear();
        }
        
        baraja.getBaraja().clear();
        desecho.getDesecho().clear();
        baraja.setTope(108);
        
        baraja.iniciarBaraja();
        baraja.revolverBaraja();
        desecho.ponerDesecho(baraja.quitarCarta());
        do {            
            
            if(desecho.obtenerDesecho().getColor().toString().equals("negro"))
            {
                desecho.getDesecho().remove(0);
                baraja.iniciarBaraja();
                baraja.revolverBaraja();
                desecho.ponerDesecho(baraja.quitarCarta());
            }
        } while (desecho.obtenerDesecho().getColor().toString().equals("negro"));   
    }
    
    @Override
    public void repartirCarta() {
        
        int cantJ= this.jugadores.size();
        
        for(int i=0;i<cantJ;i++)
        {
            for(int j=0;j<7;j++)
            {
              this.jugadores.get(i).setMano(baraja.quitarCarta())  ;
            }
        } 
    }

    @Override
    public ArrayList<Jugador> getJugadores() {
        
        return jugadores;
    }
   
    @Override
    public int getTurno() {
        
        return turno;
    }
    
    @Override
    public void cambiarTurno() {
        
        if(sentido)
        {
            if(saltar)
            {
                for (int i = 0; i < 2; i++) {             
                   turno++;
                   if(turno>=jugadores.size())
                   turno=0;
                }
            }
            else
            {
                turno++;
                if(turno>=jugadores.size())
                turno=0;
            }      
        }
        else
        {
            if(saltar)
            {    
                for (int i = 0; i < 2; i++) {
                    turno--;
                    if(turno<0)
                    turno=jugadores.size()-1;      
                }
            }
            else
            {
                 turno--;
                 if(turno<0)
                 turno=jugadores.size()-1;                 
            }
        }
        saltar=false;
    }
    
    @Override
    public boolean decirUno() {
      
        if(decirUNO)
        {
           return true; 
        } 
        else
        {
           return false; 
        } 
    }

    @Override
    public Carta tomarCarta(Jugador jugador) {
        
        Carta nuevaCarta = baraja.quitarCarta();
        jugador.setMano(nuevaCarta);
        decirUNO=false;
        return nuevaCarta;
    }
    
    @Override
    public Carta ponerCarta(int cartE) {
       
        Carta carta = jugadores.get(turno).getMano().get(cartE-1);
        Carta aux = carta;
        //cuando hay un mas cuatro o un cambia color se le devuelve su color original
        if(desecho.obtenerDesecho().getTipo().toString().equals("cambioColor") || desecho.obtenerDesecho().getTipo().toString().equals("masCuatro"))
        {
           desecho.obtenerDesecho().setColor(CartaColor.negro);
        }
        desecho.ponerDesecho(carta);
        jugadores.get(turno).getMano().remove(cartE-1);
        
        if(jugadores.get(turno).getMano().size()==1)
        {
            decirUNO=true;
            turnoUNO=turno;
        }
        else
        {
            decirUNO=false;
        } 
        return aux;
    }
    
    @Override
    public boolean verificarCarta(Carta carta) {
       
        if(carta.getTipo().toString().equals("masCuatro") || carta.getTipo().toString().equals("cambioColor"))
        {
            if(carta.getTipo().toString().equals("masCuatro") && !masCuatro)
            {
                masCuatro=true;
                acumulador+=3;                
            }
            else if(carta.getTipo().toString().equals("masCuatro") && masCuatro)
            {
                acumulador+=4; 
            }
            return true;   
        }
        else
        {
            if((carta.getColor() == desecho.obtenerDesecho().getColor() && !masCuatro) || 
               (carta.getTipo() == desecho.obtenerDesecho().getTipo()) && !masCuatro)
            {
                if(!masDos && carta.getTipo().toString().equals("tomaDos"))
                {
                    masDos=true;
                    acumulador+=1;
                }
                else if(carta.getTipo().toString().equals("tomaDos") && masDos)
                {
                    acumulador+=2;
                }
                else if(carta.getTipo().toString().equals("reversa"))
                {
                    if(sentido)
                    {
                        sentido=false;
                    }
                    else
                    {
                        sentido=true;
                    } 
                }
                else if(carta.getTipo().toString().equals("salta"))
                {
                    saltar=true;
                }
                return true;
            }
        }
        return false;    
    }

    @Override
    public boolean verificarAumento(ArrayList<Carta> mano) {
        
        if(masCuatro)
        {
             for(int i=0; i<mano.size();i++)
             {
                if(mano.get(i).getTipo().toString().equals("masCuatro"))
                {
                    return true;
                }
             }
        }
        else if(masDos)
        {
             for(int i=0; i<mano.size();i++)
             {
                if(mano.get(i).getTipo().toString().equals("tomaDos"))
                {
                    return true;
                }
             }   
        }

        return false;
    }

    @Override
    public void cambiarColor(String color, String Tipo) {
        
        int index = desecho.getDesecho().size()-1;
        CartaTipo tipo;
        if(Tipo.equals("cambioColor"))
        {
           tipo = CartaTipo.cambioColor; 
        }
        else
        {
            tipo = CartaTipo.masCuatro; 
        }
        
        CartaColor col = CartaColor.valueOf(color);  
        Carta cart = new Carta(col,tipo);
        desecho.getDesecho().set(index,cart);
    }

    @Override
    public int puntajeCarta(Carta carta) {
        
        int puntos=0;
        if(carta.getTipo().toString().equals("cambioColor") || carta.getTipo().toString().equals("masCuatro")){
             puntos = 50;
        }
        else if(carta.getTipo().toString().equals("tomaDos") || carta.getTipo().toString().equals("reversa") || carta.getTipo().toString().equals("salta")){
            puntos = 20;
        }
        else{
            if(carta.getTipo().toString().equals("cero")){
                puntos = 0;
            }
            if(carta.getTipo().toString().equals("uno")){
                puntos = 1;
            }
            if(carta.getTipo().toString().equals("dos")){
                puntos = 2;
            }
            if(carta.getTipo().toString().equals("tres")){
                puntos = 3;
            }
            if(carta.getTipo().toString().equals("cuatro")){
                puntos = 4;
            }
            if(carta.getTipo().toString().equals("cinco")){
                puntos = 5;
            }
            if(carta.getTipo().toString().equals("seis")){
                puntos = 6;
            }
            if(carta.getTipo().toString().equals("siete")){
                puntos = 7;
            }
            if(carta.getTipo().toString().equals("ocho")){
                puntos = 8;
            }
            if(carta.getTipo().toString().equals("nueve")){
                puntos = 9;
            }
        }
        return puntos;
    }

    @Override
    public int sumarPuntos() {
        int suma=0;
        for (Jugador jugador : jugadores) {
            
            if(jugador.getMano().size()>0)
            {
                for (Carta mano : jugador.getMano()) {
                    
                   suma+= puntajeCarta(mano); 
                } 
            } 
        }
        return suma;
    }
    
    @Override
    public void finalizarBaraja() {
        
        ArrayList <Carta> listaAux = new ArrayList<>();
        
        int indice = desecho.getDesecho().size()-1;    
        Carta aux = desecho.obtenerDesecho();
        desecho.getDesecho().remove(indice);
        listaAux = baraja.getBaraja();
        baraja.setBaraja(desecho.getDesecho());
        desecho.setDesecho(listaAux);
        desecho.ponerDesecho(aux); 
        baraja.revolverBaraja();
    }

    @Override
    public void finJuego() {
        
       baraja.getBaraja().clear();
       desecho.getDesecho().clear();
       jugadores.clear();
    }
}
