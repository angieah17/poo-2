package herencia.examen;

public class Doctor extends Profesion {

	//1. Propiedades
	
	
	
	
	//2. Constructor
	public Doctor(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	
	//3. Métodos

	@Override
	public void trabajar() {
		System.out.printf("El Doctor [%s] está atendiendo pacientes "
				+ "en el área de [%s].%n",getNombre(), getEspecialidad());
	}

	public void recetarMedicamento (String medicamento) {
		
		System.out.printf("El doctor [%s] ha recetado el medicamento [%s].%n", getNombre(), medicamento);
		
	}
	
	
}
