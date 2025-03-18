package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
	
	//1. Propiedades
	private ArrayList<String> palabrasPredefinidas = new ArrayList<>();
	private int cantidadMaximaDeVidas;
	
	
	//2. Constructores
	public Ahorcado(int cantidadMaximaDeVidas) {
		this.cantidadMaximaDeVidas = cantidadMaximaDeVidas;
		this.palabrasPredefinidas = incluirPalabrasPredefinidas();
	}
	
	//3. Métodos


	private ArrayList<String> incluirPalabrasPredefinidas () {
		palabrasPredefinidas.add("casa");
	    palabrasPredefinidas.add("perro");
	    palabrasPredefinidas.add("gato");
	    palabrasPredefinidas.add("computadora");
	    palabrasPredefinidas.add("teclado");
	    palabrasPredefinidas.add("monitor");
	    palabrasPredefinidas.add("libro");
	    palabrasPredefinidas.add("ventana");
	    palabrasPredefinidas.add("puerta");
	    palabrasPredefinidas.add("silla");
	    palabrasPredefinidas.add("mesa");
	    palabrasPredefinidas.add("lampara");
	    palabrasPredefinidas.add("pared");
	    palabrasPredefinidas.add("cielo");
	    palabrasPredefinidas.add("tierra");
	    palabrasPredefinidas.add("sol");
	    palabrasPredefinidas.add("luna");
	    palabrasPredefinidas.add("estrella");
	    palabrasPredefinidas.add("nube");
	    palabrasPredefinidas.add("arbol");
	    palabrasPredefinidas.add("flor");
	    palabrasPredefinidas.add("jardin");
	    palabrasPredefinidas.add("parque");
	    palabrasPredefinidas.add("rio");
	    palabrasPredefinidas.add("mar");
	    palabrasPredefinidas.add("playa");
	    palabrasPredefinidas.add("montaña");
	    palabrasPredefinidas.add("bosque");
	    palabrasPredefinidas.add("camino");
	    palabrasPredefinidas.add("carretera");
	    palabrasPredefinidas.add("coche");
	    palabrasPredefinidas.add("bicicleta");
	    palabrasPredefinidas.add("autobus");
	    palabrasPredefinidas.add("tren");
	    palabrasPredefinidas.add("avion");
	    palabrasPredefinidas.add("barco");
	    palabrasPredefinidas.add("hotel");
	    palabrasPredefinidas.add("restaurante");
	    palabrasPredefinidas.add("escuela");
	    palabrasPredefinidas.add("universidad");
	    palabrasPredefinidas.add("hospital");
	    palabrasPredefinidas.add("farmacia");
	    palabrasPredefinidas.add("supermercado");
	    palabrasPredefinidas.add("tienda");
	    palabrasPredefinidas.add("mercado");
	    palabrasPredefinidas.add("banco");
	    palabrasPredefinidas.add("cajero");
	    palabrasPredefinidas.add("telefono");
	    palabrasPredefinidas.add("reloj");
		
	    return palabrasPredefinidas;

	}

	public void jugar () {
		Random random = new Random();
		
		int indice = random.nextInt(0, palabrasPredefinidas.size());
		
		String palabraAleatoria = palabrasPredefinidas.get(indice);
		//System.out.println(palabraAleatoria);
		
		String [] letrasOcultas = new String [palabraAleatoria.length()];
		
		for (int i = 0; i < letrasOcultas.length; i++) {
			letrasOcultas[i] = "_";
		}
		
		Scanner scanner = new Scanner(System.in);
		
		
		int contadorDeVidasPerdidas = 0;
		
		
		System.out.printf("¡Bienvenido al Ahorcado!%n");
		
		do {
			
			System.out.println("Ingresa una letra: ");
			String letraIngresada = scanner.next();
			
			boolean acierto = false;
			
			for (int i = 0; i < letrasOcultas.length; i++) {
				
				if(letraIngresada.charAt(0) == palabraAleatoria.charAt(i)) {
					letrasOcultas[i] = letraIngresada;
					acierto = true;
				}
				
			}
			
			for (String letra : letrasOcultas) {
				System.out.print(letra + " ");
			}
		
			System.out.println();
			
			if(!acierto) {
				System.out.printf("[%d de %d] Has fallado.%n", ++contadorDeVidasPerdidas, cantidadMaximaDeVidas);
			}
			
			
			if(!String.join("", letrasOcultas).contains("_")) {
				System.out.println("¡Felicidades has ganado!");
				break;
			}
			
			
			
			
		} while (contadorDeVidasPerdidas < cantidadMaximaDeVidas);
		
		if(contadorDeVidasPerdidas == cantidadMaximaDeVidas) {
			System.out.printf("Te has quedado sin vidas. La palabra era:%s.%n", palabraAleatoria);
		}
		
	}
	


/*public static void main(String[] args) {
		
		Ahorcado a1 = new Ahorcado(3);
			
			a1.jugar();
			
			
			
			
			
	}*/
	
	
	
}
