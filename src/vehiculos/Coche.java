package vehiculos;

public class Coche extends Vehiculo {
	//1. Propiedades
	private boolean puertasAbiertas;
	private boolean motorArrancado;
	private String matricula;
	
	//2.Constructor
	
	public Coche(int velocidadMaxima, int numeroDeRuedas, double peso, String matricula) {
		super(velocidadMaxima, numeroDeRuedas, peso);
		this.matricula = matricula;
		
	}

	
	//3. Métodos
	public void abrirPuertas() {
		puertasAbiertas = true;
		System.out.println("Puertas abiertas.");
		
	}
	

	public void cerrarPuertas() {
		puertasAbiertas = false;
		System.out.println("Puertas cerradas.");
		
	}


	
	public boolean arrancarMotor() {
		motorArrancado = true;
		return false;
	}


	
	public boolean pararMotor() {
		motorArrancado = false;
		return false;
	}

	
	
	@Override
	public String toString() {
		
		return String.format("Vehiculo de tipo coche con: %s-Matrícula: %s.%n-Puertas abiertas:%b.%n-Motor arrancado: %b.%n", super.toString(), matricula, puertasAbiertas, motorArrancado);
				
	}
	
	
}
