package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
	
	//1. Propiedades
	private ArrayList<String> opcionesDeJuego = new ArrayList<>();
	
	//2. Constructores
	
	public PiedraPapelTijera() {
		this.opcionesDeJuego = incluirOpcionesDeJuego();
	}

	//3. Métodos

	private ArrayList<String> incluirOpcionesDeJuego() {
		opcionesDeJuego.add("piedra");
		opcionesDeJuego.add("papel");
		opcionesDeJuego.add("tijera");
		
		return opcionesDeJuego;
	}
	
	

	public void jugar () {
		
		//1. Importando Random y Scanner
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		//2. Creando las variables
		int indice = random.nextInt(3);
		String opcionDeJuegoAleatoria = opcionesDeJuego.get(indice);
		
		System.out.println(opcionDeJuegoAleatoria);
		
		
		boolean exito = false;
		
		
		while(!exito) {
			System.out.printf("Bienvenido para jugar "
					+ "escribe pieda, papel o tijera.%n");
			
			String opcionDelUsuario = scanner.next().toLowerCase();
			
			switch (opcionDelUsuario) {
				case "piedra":
					if(opcionDeJuegoAleatoria == "papel") {
						System.out.println("Has pérdido.");
					} else if (opcionDeJuegoAleatoria.equals("tijera")) {
						System.out.println("Has ganado.");
						exito= true;
					}
				break;
				
				case "papel":
					
					if(opcionDeJuegoAleatoria == "tijera") {
						System.out.println("Has pérdido");
					}else if (opcionDeJuegoAleatoria.equals("piedra")) {
						System.out.println("Has ganado.");
						exito= true;
					}
					
				break;
				
				case "tijera":
					if(opcionDeJuegoAleatoria == "piedra") {
						System.out.println("Has pérdido.");
					}else if (opcionDeJuegoAleatoria.equals("papel")) {
						System.out.println("Has ganado.");
						exito= true;
					}
					
				break;
				
			}
			
			if(opcionDelUsuario.equals(opcionDeJuegoAleatoria)) {
			
			System.out.println("Vuelve a intentarlo. Has sacado lo mismo que el ordenador");
			
		};
		
			
		}
		
			
	}
	
	
	
	/*public static void main(String[] args) {
		
		PiedraPapelTijera p =  new PiedraPapelTijera();
		
		p.jugar();
		
	}*/
	
	
}
