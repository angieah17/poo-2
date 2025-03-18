package empleados;

public class Gerente extends Empleado {

	//1. Propiedades
	
	private static double bonoMensual = 200;
	private double rendimiento;
		
	
	//2. Constructores
	
	public Gerente(String nombre, String idEmpleado, double salarioBase, double rendimiento) {
		super(nombre, idEmpleado, salarioBase);
		this.rendimiento = rendimiento;
	}

		
	//3. Métodos
	
	
	@Override
	public double calcularSalarioMensual() {
		
		return getSalarioBase() + bonoMensual + rendimiento;
	}
	
	@Override
	public String toString() {
		
		return String.format("%sGerente.%n-Salario Mensual:%.2f€.%n", super.toString(), calcularSalarioMensual());
		
	}
	
	
}
