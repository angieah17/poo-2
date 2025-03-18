package casino;

public class Carta2 {
	
	//1. Propiedades
	
	private int numCarta;
	private String palo;
	
	//2. Constructores 
	public Carta2(int numCarta, String palo) {
		this.numCarta = numCarta;
		this.palo = palo;
	}
	
	//3. Métodos
	
	
	@Override
	public String toString() {
		
		return String.format("[%d %s]%n", numCarta, palo);
	}
	
	
	
}
