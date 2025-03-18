package empleados;

public class Administrativo extends Empleado{

	
	//1. Propiedades
	
	private static double bonoMensualFijo = 100;
	
	
	//2. Constructores
	
	public Administrativo(String nombre, String idEmpleado, double salarioBase) {
		super(nombre, idEmpleado, salarioBase);
	}
	
	
	
	//3. Métodos
	
	@Override
	public double calcularSalarioMensual() {
		
		double salarioMensual = getSalarioBase() + bonoMensualFijo;
		
		return salarioMensual;
		
	}

	@Override
	public String toString() {
		
		return String.format("%sAdministrativo.%n-Salario Mensual:%.2f€.%n", super.toString(), calcularSalarioMensual());
		
	}
	
	
	
}
