package herencia.examen;

public class Ingeniero extends Profesion {

	//1. Propiedades
	
	
	
	
	//2. Constructor
	public Ingeniero(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	
	//3. Métodos

	@Override
	public void trabajar() {
		System.out.printf("El Ingeniero [%s] está diseñando un proyecto de [%s].%n",getNombre(), getEspecialidad());
	}

	public double calcularCostoProyecto (double horas, double tarifaPorHoras) {
		
		return horas * tarifaPorHoras;
		
	}
	
	
}
