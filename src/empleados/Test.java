package empleados;

public class Test {
	
	public static void main(String[] args) {
		Empleado e1 = new Administrativo("Angie", "1234", 1200);
		PorHora e2 = new PorHora("Julio", "456", 10, 30);
		Gerente e3 = new Gerente("Pedro", "789", 2000, 50);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		
	}
	
	
	
	
	
}
