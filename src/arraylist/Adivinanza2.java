package arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Adivinanza2 {
	
	public static void main(String[] args) {
		
		//1. Generación de números aleatorios
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(1, 5);
		System.out.println(numeroAleatorio);
		
		//2. Instancia del objeto scanner para intentos del usuario 
		
		Scanner scanner = new Scanner(System.in);
		
		int intento;
		int cantidadDeIntentos = 0;
		
		//3. ArrayList
		
		ArrayList<Integer> historial = new ArrayList<>();
		
		//4. Programa
		
				
		do {
			
			System.out.print("Introduce tu intento: ");
			intento = scanner.nextInt();
			System.out.printf("Introducido: %d%n", intento);
			
			historial.add(intento);
			System.out.println("Historial: " + historial);
			cantidadDeIntentos++;
			System.out.println("Cantidad Intentos: " + cantidadDeIntentos);
			
			
			
			if(intento > numeroAleatorio) {
				System.out.println("Tu número es mayor que el aleatorio.");
			}
			
			if(intento < numeroAleatorio) {
				System.out.println("Tu número es menor que el aleatorio.");
			}
			
			if(intento == numeroAleatorio) {
				System.out.println("Has acertado.");
			}
			
			
			
		} while (intento != numeroAleatorio);
		
		
		
	}
	
}
