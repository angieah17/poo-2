package juegos;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		do {
			boolean salir = false;
			System.out.println("3: Juego Piedra, Papel o Tijera.");
			System.out.println("2: Juego ahorcado.");
			System.out.println("1: Juego adivina número.");
			System.out.println("0: Salir.");
			
			Scanner scanner = new Scanner(System.in);
			
			int opcion = scanner.nextInt();
			
			switch (opcion) {
			case 0: 
				salir = true;
				break;
			
			case 1:
				new AdivinaNumero(10, 3).jugar();
				break;
			
			case 2:
				new Ahorcado(5).jugar();
				break;
			
			case 3:
				new PiedraPapelTijera().jugar();
				break;
				
			default:
				break;
			} if(salir) {
				break;
			}
			
			
		} while (true);
		
	

	}
}
