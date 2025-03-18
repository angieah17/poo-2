package repaso.parking;

public class Test {

	public static void main(String[] args) {
		Parking p1 = new Parking("P-1", 10);
		
		for (int i = 0; i < 5; i++) {
			p1.entraCoche(new Coche());
		}
		
		System.out.println("Lista");
		for (Coche coche : p1.getListaDeCoches()) {
			System.out.println(coche);
		}
		
		System.out.println("Conjunto");
		
		for (Coche coche : p1.getConjuntoCoches()) {
			System.out.println(coche);
		}
		
		
	}
}
