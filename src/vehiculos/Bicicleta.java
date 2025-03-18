package vehiculos;

public class Bicicleta extends Vehiculo {
	
	//1. Propiedades
	
	
	//2. Constructores
	public Bicicleta(int velocidadMaxima, int numeroDeRuedas, double peso) {
		super(velocidadMaxima, numeroDeRuedas, peso);
		
	}

	//3. Métodos
	public void hacerCaballito() {
		System.out.println("Haciendo caballito.");
	}

	
	
public String toString() {
		
		return String.format("Vehiculo de tipo bicicleta con: %s%n", super.toString());
				
	}
	

	
}
