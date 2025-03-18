package vehiculos;

public class Motocicleta extends Vehiculo {

	//1. Propiedades
	
	private boolean motorArrancado;
	private String matricula;
	
	//2. Constructor
	public Motocicleta(int velocidadMaxima, int numeroDeRuedas, double peso, String matricula) {
		super(velocidadMaxima, numeroDeRuedas, peso);
		this.matricula = matricula;
		
	}

	//3. Métodos
	
	public void cambiarMarcha () {
		System.out.println("Cambiando de marcha.");
	}

	
	public boolean arrancarMotor() {
		motorArrancado = true;
		return false;
	}


	
	public boolean pararMotor() {
		motorArrancado = false;
		return false;
	}


public String toString() {
		
		return String.format("Vehiculo de tipo motocicleta con: %s-Matrícula: %s.%n-Motor arrancado: %b.%n", super.toString(), matricula, motorArrancado);
				
	}
	
	
}
