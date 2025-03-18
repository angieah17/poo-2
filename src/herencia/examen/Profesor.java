package herencia.examen;

public class Profesor extends Profesion {

	//1. Propiedades
	
	
	
	
	//2. Constructor
	public Profesor(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	
	//3. Métodos

	@Override
	public void trabajar() {
		System.out.printf("El Profesor [%s] está enseñando [%s] a sus estudiantes.%n",getNombre(), getEspecialidad());
	}

	public void calificarExamenes (int cantidadEstudiantes) {
		
		System.out.printf("El profesor [%s] ha calificado [%d] exámenes.%n", getNombre(), cantidadEstudiantes);
	}
	
	
}
