package herencia.examen;

public abstract class Profesion {
	
	//1. Propiedades
	private String nombre; //no se debe poder cambiar
	private short anioDeNacimiento; //no se debe poder cambiar. Ningún método o proceso público que permita cambiarlo
	private String especialidad;
	
	//2. Constructores
	
	public Profesion(String nombre, short anioDeNacimiento, String especialidad) {
		this.nombre = nombre;
		this.anioDeNacimiento = anioDeNacimiento;
		this.especialidad = especialidad;
	}
	
	
	//3. Métodos
	
	public abstract void trabajar ();
	
	
	public short calcularEdad () {
		return (short) (2025 - anioDeNacimiento);
	}
	
	//set de nombre y anioDeNacimiento no puede existir
	
	@Override
	public String toString() {
		
		return String.format("-Nombre:%s.%n-Año de Nacimiento:%d.%n-Especialidad:%s.%n", nombre, anioDeNacimiento, especialidad);
	}


	public String getNombre() {
		return nombre;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	
	
	
}
