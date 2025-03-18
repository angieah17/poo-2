package repaso.parking;

import java.util.Random;

public enum Marca {

	VW, SE;
	
	private static Random random = new Random(); //Se evita crear una instancia de random y se usa siempre  en todo el enum al ser static
	
	
	public static Marca aleatorio() {
		
		return Marca.values()[(random.nextInt(Marca.values().length))];
		
	}
	
	
}
