package herencia.examen;


public class Main {
	
	public static void main(String[] args) {
		
		Profesion [] profesiones = {
			new Doctor("Pedro González", (short) 1999, "Psiquiatría"),
			new Doctor("Juan López", (short) 1994, "Medicina Familiar"),
			new Doctor("Luis Pinto", (short) 1990, "Dermatología"),
			new Ingeniero("Mario Espejo", (short) 1996, "Aeroespacial"),
			new Ingeniero("Guillermo Ardila", (short) 1995, "Mecánico"),
			new Ingeniero("Daniel Fernandez", (short) 1998, "Civil"),
			new Profesor("José Sánchez", (short) 1900, "Filosofía"),
			new Profesor("Marlon García", (short) 1987, "Geología"),
			new Profesor("Eduardo Ruiz", (short) 1995, "Derecho"),	
		};
	
	for (Profesion profesional : profesiones) {
		profesional.trabajar();
		System.out.println("Edad: " + profesional.calcularEdad());
		//System.out.println(profesional);
		
		if (profesional instanceof Doctor) {
			((Doctor)profesional).recetarMedicamento("Medicamento de prueba");
			
		} else if (profesional instanceof Ingeniero) {
			((Ingeniero) profesional).calcularCostoProyecto(30, 10);
			//Es necesario al profesional hacerle un cast para poderlo ver como Ingeniero
			//y se debe poner entre paréntesis para que funcione y salgan
			//disponibles los métodos de Ingeniero
		} else if (profesional instanceof Profesor) {
			((Profesor) profesional).calificarExamenes(10);
		} else {
			System.out.println("Esto no es un profesional conocido.");
		}
		
		/*Es mejor ponerlo en else if para que fuese más eficiente. 
		 *Y no ir preguntando if para cada instancia */
		
	}
	
	
	
	
	}
	
	
	
}
