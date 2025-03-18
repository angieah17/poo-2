package parking.practicando;

public class Test {
	
	
	public static void main(String[] args) {
Parking p1 = new Parking("x", 3);
		
		Coche c1 = new Coche(Marca.CH, Color.RO);
		Coche c2 = new Coche(Marca.CH, Color.RO);
		Coche c3 = new Coche(Marca.CH, Color.RO);
		
		
		System.out.println("PRUEBA 1: METER 3 COCHES IGUALES");
		p1.entraCoche(c1);
		p1.entraCoche(c2);
		p1.entraCoche(c3);
		
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 2: SACAR C2");
		
		p1.saleCoche(c2);
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 3: SACAR C2 NUEVAMENTE");
		
		p1.saleCoche(c2);
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 4: VACIAR");
		
		p1.vaciaParking();
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 5: METER 3 COCHES IGUALES");
		
		p1.entraCoche(c1);
		p1.entraCoche(c2);
		p1.entraCoche(c3);
		
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 6: SACAR 3 COCHES ALEATORIOS");
		
		for (int i = 0; i < 3; i++) {
			p1.saleCocheAleatorio();
		}
		
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 7: SACAR 4 COCHES ALEATORIOS");
		
		for (int i = 0; i < 4; i++) {
			p1.saleCocheAleatorio();
		}
		
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 8: METER 3 COCHES IGUALES"); 
		
		p1.entraCoche(c1);
		p1.entraCoche(c2);
		p1.entraCoche(c3);
		
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 9: SACAR 1 COCHE ALEATORIO"); 
		
		Coche cochePrueba9 = p1.saleCocheAleatorio();	
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 10: VOLVER A METER EL COCHE ALEATORIO"); 
		
		p1.entraCoche(cochePrueba9);
		p1.dameTodosLosReports();
		
		
		System.out.println();
		System.out.println("PRUEBA 11: VACIAR PARKING"); 
		
		p1.vaciaParking();
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 12: SACAR COCHE ALEATORIO"); 
		
		p1.saleCocheAleatorio();
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 13: SACAR COCHE C1"); 
		
		p1.saleCoche(c1);
		p1.dameTodosLosReports();
		
		System.out.println();
		System.out.println("PRUEBA 14: BUCLE PARA LLENAR EL PARKING EN EXCESO"); 
		
		for (int i = 0; i < 4; i++) {
			p1.entraCoche(new Coche(Marca.CH, Color.AM));
		}
		
		p1.dameTodosLosReports();
		
	}
}
