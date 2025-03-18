package repaso.parking;

import java.util.Random;

public enum Color {
	
	RO, AM;
	
	private static Random random = new Random();
	
	
	public static Color aleatorio() {
		
		return Color.values()[(random.nextInt(Color.values().length))];
		
	}
	
	
}
