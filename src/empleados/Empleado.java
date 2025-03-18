package empleados;

import java.util.Iterator;

public abstract class Empleado {
	
	//1. Propiedades
	
	private String nombre;
	private String idEmpleado;
	private double salarioBase;
	
		
	//2. Constructores
	
	public Empleado(String nombre, String idEmpleado, double salarioBase) {
		this.nombre = nombreValido(nombre) ? nombre : "NOMBRE NO VÁLIDO"; 
		this.idEmpleado = idEmpleado; //FALTA revisar si se puede limitar
		this.salarioBase = salarioBase >= 0 ? salarioBase : 0; 
	}
	
	private boolean nombreValido (String nombre) {
		
		for (int i = 0; i < nombre.length(); i++) {
			if(nombre.charAt(i) == 'A' && nombre.charAt(i) == 'Z' || nombre.charAt(i) == 'a' || nombre.charAt(i) == 'z') {
				return true;
			} 
		}
		
		return false;
	}
	
	//3. Métodos
	
	public abstract double calcularSalarioMensual ();
	
	@Override
	public String toString() {
		
		return String.format("Trabajador:%n-Nombre:%s.%n-ID:%s.%n-Salario Base:%.2f€.%n-Tipo:", nombre, idEmpleado, salarioBase);
		
	}
	
	
	//4. Getters
	
	public double getSalarioBase() {
		return salarioBase;
	}

	
	
	
}
