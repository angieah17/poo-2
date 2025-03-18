package vehiculos;

public class Test {

	public static void main(String[] args) {
		
		Coche c1 = new Coche(120, 4, 100, "1234 ABC");
		Motocicleta m1 = new Motocicleta(13,120,2, "abs86ads");
		Bicicleta b1 = new Bicicleta(40, 2, 10);
		
		System.out.println("PROBANDO ABRIR Y CERRAR PUERTAS");
		System.out.println(c1);
		c1.abrirPuertas();
		System.out.println(c1);
		c1.cerrarPuertas();
		System.out.println(c1);
		c1.acelerar();
		c1.frenar();
		
		System.out.println();
		System.out.println("PROBANDO ARRANCAR Y PARAR MOTOR");
		c1.arrancarMotor();
		System.out.println(c1);
		c1.pararMotor();
		System.out.println(c1);
		
		System.out.println(m1);
		System.out.println(b1);
		
	}
}
