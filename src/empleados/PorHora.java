package empleados;

public class PorHora extends Empleado {

	
	//1. Propiedades
	
	private int numeroHorasTrabajadas;
	
	
	//2. Constructores
	
	public PorHora(String nombre, String idEmpleado, double salarioBase, int numeroHorasTrabajadas) {
		super(nombre, idEmpleado, salarioBase);
		this.numeroHorasTrabajadas = numeroHorasTrabajadas; //FALTA si alcanza al tiempo limitar
	}

	//3. Métodos
	
	@Override
	public double calcularSalarioMensual() {	
		
		return getSalarioBase() * numeroHorasTrabajadas ;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("%sPor horas.%n-Horas Trabajadas:%d.%n-Salario Mensual:%.2f€.%n", super.toString(),  numeroHorasTrabajadas, calcularSalarioMensual());
		
	}
	
	
	
}
