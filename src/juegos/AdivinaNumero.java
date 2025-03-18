package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
	
	private int numeroMaximo;
	private int numeroIntentos;
	private int numeroOculto;
	private ArrayList<String> historico = new ArrayList<>();
	
	
	
	
	public AdivinaNumero(int numeroMaximo, int numeroIntentos) {
		this.numeroMaximo = numeroMaximo;
		this.numeroIntentos = numeroIntentos;
	}




	public void jugar() {
		numeroOculto = new Random().nextInt(1, numeroMaximo + 1);
		int intento = 0;
		System.out.println(numeroOculto);	
		System.out.println("¡Empezamos un nuevo juego!");
		System.out.println("===========================");
		
		boolean exito = false;
		
		Scanner scanner = new Scanner(System.in); //System.in permite hacer un input 
		
		while (++intento <= numeroIntentos) {
			
			System.out.printf("[%d de %d] Introduce un número del 1 al %d: ",intento, numeroIntentos, numeroMaximo);
		int numeroPropuesto = scanner.nextInt();
				
		if(numeroPropuesto == numeroOculto) {
			System.out.printf("Acertaste%n");
			historico.add("😀 ​" + numeroPropuesto);
			System.out.println(historico);
			break;
		} else if (numeroPropuesto > numeroOculto) {
			System.out.printf("%d es mayor que el numero oculto%n", numeroPropuesto);
			historico.add("😔​ " + numeroPropuesto);
		}else {
			System.out.printf("%d es menor que el numero oculto%n", numeroPropuesto);
			historico.add("😔 ​" +numeroPropuesto);
		}
		
		System.out.println(historico);
		}
		
		historico.clear();
		System.out.println("Gracias por participar");
		
		
		
	}
	
	
	
	
	/*public static void main(String[] args) {
		
		AdivinaNumero j1 = new AdivinaNumero(10, 3);
		
		j1.jugar();
		
		AdivinaNumero j2 = new AdivinaNumero(5, 2);
		
		j2.jugar();
		//j1.jugar();
	}*/
	
	
	
	
}
