package casino;

import java.text.Format;

public class Carta {
	
	//1. Propiedades
	private int numero;
	private String palo;
	
	//2. Constructores 
	
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	@Override
	public String toString() {
		return String.format("[%d %s]", numero, palo);
	}
	
	
	
	
	
}
