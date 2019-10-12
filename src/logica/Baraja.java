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
public class Baraja{
    
    private ArrayList <Carta> baraja ;
    private int tope;

    /**
     * constructor de la clase baraja
     * @param baraja reibe como parametro una lista de carta para instanciar una nueva baraja
     */
    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
        this.tope=108;
    }

    /**
     * sirve para obtener la lista de cartas
     * @return devuelve el arreglo de listas de tipo carta
     */
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    /**
     * permite moificar el arreglo de cartas de la baraja 
     * @param baraja recibe como parametro el arrayList de cartas para modificarlo posteriormente
     */
    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
        this.tope= this.baraja.size();
    }

    /**
     * @return devuelve el tope de la baraja
     */
    public int getTope() {
        return tope;
    }

    /**
     * sirve para modificar el tope
     * @param tope recibe como parametro un entero que representa el valor que tendra el tope
     */
    public void setTope(int tope) {
        this.tope = tope;
    }

    /**
     * agrega las cartas en el arrayList creado al instanciar el objeto baraja 
     * en total agrega 108 cartas 
     */
    public void iniciarBaraja()
    {
         for(CartaColor color: CartaColor.obtenerColor())
        {
            for (CartaTipo numero: CartaTipo.obtenerNumero())
            {
                this.baraja.add(new Carta(color,numero));
                //Hay dos cartas de cada tipo que no es cero
                if (numero!=CartaTipo.cero)
                {
                    this.baraja.add(new Carta(color,numero));
                }   
            }
	}
	//Colocamos las cartas de los colores especiales
        for(CartaColor color: CartaColor.obtenerColorComodin())
        {
            for (CartaTipo comodin: CartaTipo.obtenerComodin())
            {
                for(int i=0;i<4;i++)
                {
                    this.baraja.add(new Carta(color,comodin));
                }		
            }	
        }
    }
    
    /**
     * crea un arreglo aleatorio de numeros para cambiar el orden de las cartas en el arrayList baraja 
     */
    public void revolverBaraja()
    {
        ArrayList <Carta> barajaAux = new ArrayList <Carta>();
        int aleatorios[] = new int[tope];
        int i=0;
        
        aleatorios[i]=(int)(Math.random()*tope);
        for(i=1; i<tope; i++)
        {
            aleatorios[i]=(int)(Math.random()*tope);
            for(int j=0; j<i; j++)
            {
                if(aleatorios[i]==aleatorios[j])
                {
                    i--;
                }
            }
        } 
        for(int k=0;k<tope;k++)
        {               
            barajaAux.add(baraja.get(aleatorios[k]));
        }  
        
        baraja=barajaAux;   
    }
    
     /**
     *  Coloca una nueva carta en la baraja
     * @param nuevaC Este se usa para añadir una nueva carta en el deseño
     * @return devuelve la carta colocada
     */
    public Carta ponerCarta(Carta nuevaC)
    {
        baraja.add(nuevaC);
        tope++;
        return nuevaC;
    } 
    
    /**
     * remueve la ultima carta de la baraja 
     * @return devuelve la carta quitada
     */
    public Carta quitarCarta()
    {
        Carta ultima = baraja.get(tope-1);
        baraja.remove(tope-1);
        tope--;
        return ultima;
    }  
}