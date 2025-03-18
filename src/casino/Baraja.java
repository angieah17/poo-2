package casino;

import java.util.Iterator;
import java.util.Random;

public class Baraja {
	
	//1. Propiedades 
	
	private Carta [] cartas; 
	private Carta [] cartasSacadas;
	
	//Cartas van del 1 al 10 y los palos son de oro, copas, espadas y bastos.
	//Recuerda que cada carta uenta con número y palo asignado. 
	
	//2. Constructores
	
	public Baraja (int numCartasPorPalo, String [] losPalos) {
				
		cartas = new Carta[numCartasPorPalo * losPalos.length];
		cartasSacadas = new Carta [0];
		int pos = 0;
		
		for (int numCarta = 1; numCarta <= numCartasPorPalo; numCarta++) {
							
			for (String palo : losPalos) {
				
				cartas [pos++] = new Carta (numCarta, palo);
							
			}
			
		}
		
		
	}
	
	
	
	//3. Métodos
	
	public int mostrarCartaAlAzar() {
				
		Random random = new Random();
		
		int posicionAleatoria = random.nextInt(0, cartas.length);
		
		System.out.println(cartas[posicionAleatoria]);
		
		return posicionAleatoria;
		
		//Obtener la dimensión del array y obtener un numero entre el 1 y la dimensión del array.Generar un indice al azar
				
	}
	
	public Carta sacarCartaAlAzar() {
		/*
	 * Sacar 1 carta, entonces deja de estar en el mazo.
	 * Seleccionar numéro al azar, en el array quedará un null en su posición. 
	 * */
		
		/*
		 * Se podría mirar que vaya quedando un array con un elemento menos.
		 * Recorrer con una condición if salte la posición
		 * y que cree un nuevo array con una posición nueva. Y el anterior
		 * deje de existir. 
		 * 
		 * También será necesario crear otro array de cartas sacadas.
		 * De esta manera, se podrá retornar la baraja completa. 
		 * 		 * */
		
		
		//a. Elijo la carta al azar
		int posicionASacar = mostrarCartaAlAzar();
		Carta cartaASacar = cartas[posicionASacar];
				
		//b. Creo los futuros arrays de cartas sacadas y en la bajara
		Carta [] nuevaCartas = new Carta [cartas.length - 1];
		Carta [] nuevaCartasSacadas = new Carta [cartasSacadas.length + 1];
		
		//c. La carta elegida la añado al nuevo array de cartas sacadas
		
		for (int i = 0; i < cartasSacadas.length; i++) {
			nuevaCartasSacadas[i] = cartasSacadas[i];
		}
		
		nuevaCartasSacadas[nuevaCartasSacadas.length - 1] = cartaASacar;
		
		cartasSacadas = nuevaCartasSacadas;
		
		//d. La carta elegida la saco del nuevo array de cartas
		
		int indexNuevaCartas = 0;
		
		for (int i = 0; i < nuevaCartas.length; i++) {
			if(i != posicionASacar) {
				nuevaCartas[indexNuevaCartas++] = cartas[i]; 
			}			
		}
		
		cartas = nuevaCartas;
		
		//e. Devuelvo la carta que he sacado
		
		return cartaASacar;
				
		
	}
	
	
	
	public static void main(String[] args) {
		
		//Se puede definir el String de arrays dentro de la creación de la instancia
		
		Baraja espaniola1 = new Baraja(10, new String [] {"Oros", "Copas", "Espadas", "Bastos"});
		
		//También se puede crear una variable afuera para definir el String [], guardarlo y usarlo en otras instancias
		String [] misPalos = {"Oros", "Copas", "Espadas", "Bastos"};
		
		Baraja espaniola2 = new Baraja(10, misPalos);
		
		/*
		 Estas barajas pese a tener los mismos datos no son las mismas cartas. 
		 Son barajas iguales con distintas cartas. 
		 * */
		
		espaniola1.mostrarCartaAlAzar();
		
		for (int i = 0; i < 10; i++) {
			espaniola1.sacarCartaAlAzar();
		}
		
		
		
		
	}
	
	
	
	
}
