package casino;

import java.util.Random;

public class Baraja2 {

	//1. Propiedades
	private Carta [] cartas;
	private Carta [] cartasSacadas;
	
	//2. Constructores
	
	public Baraja2 (int numCartasPorPalo, String [] palos) {
		
		//1. Creamos la dimensión que tendrá el array cartas que se creará
		cartas = new Carta [numCartasPorPalo * palos.length];
		
		//2. Se realiza el bucle que permite la generación de cada carta 
		// e irla guardando en el array cartas.
		
		int pos = 0;
		
		for (int numCarta = 1; numCarta <= numCartasPorPalo; numCarta++) {
			for (String palo : palos) {
			cartas [pos++] = new Carta(numCarta, palo);
			}
		}
		
		//3. Como se trata de un constructor, el array de cartas sacadas inicia en 0
		
		cartasSacadas = new Carta [0];
		
	}
	
	//3. Métodos
	
	/*Se requieren dos métodos:
	 * a. Uno de mostrar las cartas al azar.
	 * b. Otro de guardar las cartas 
	 * */
	
	public int mostrarCartaAlAzar () {
		
		Random random = new Random();
		
		int posicionCartaASacar = random.nextInt(0, cartas.length);
		
		System.out.println(cartas[posicionCartaASacar]); 
		
		return posicionCartaASacar;
		
	}
	
	
}
