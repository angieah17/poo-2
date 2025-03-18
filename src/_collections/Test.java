package _collections;

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
		
		
		/*for (int i = 0; i < 4; i++) {
			p1.entraCoche(new Coche());
		}
		
		p1.dameTodosLosReports();*/
		
		
		
		/*Coche c2= new Coche();
		Coche c3= new Coche();
		Coche c4= new Coche();
		Coche c5 = new Coche(Marca.CH, Color.AM);
		Coche c6 = new Coche(Marca.CH, Color.AM);*/

		/*
		System.out.println("--PROBANDO ENTRA COCHE Y REPORT PARKING--");
		System.out.println(p1.entraCoche(c2));
		System.out.println(p1.entraCoche(c3));
		p1.reportParking();
		System.out.println();
		
		System.out.println("--PROBANDO SALE COCHE Y REPORT PARKING--");	
		System.out.println(p1.saleCoche(c4));
		System.out.println(p1.saleCoche(c2));
		System.out.println(p1.saleCocheAleatorio());
		p1.reportParking();
		System.out.println();
		
		System.out.println("--PROBANDO VACIA PARKING--");	
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		System.out.println(p1.vaciaParking());
		p1.reportParking();
		System.out.println();
		
		
		System.out.println("--PROBANDO REPORT COLORES EN ENTRA Y SALE COCHE--"); //Debe por ahora estar comentado lo demás mientras hago el sale
		
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportColores();
		p1.saleCoche(c6);
		p1.saleCoche(c5);
		p1.reportColores();
		
		
		System.out.println("--PROBANDO REPORT COLORES EN ALEATORIO--");
		
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportColores();
		p1.saleCocheAleatorio();
		p1.saleCocheAleatorio();
		p1.reportColores();
		
		System.out.println("--PROBANDO REPORT COLORES EN VACIA PARKING--");
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportColores();
		p1.vaciaParking();
		p1.reportColores();*/
		
		
		/*System.out.println("--PROBANDO REPORT MARCAS EN ENTRA Y SALE COCHE--"); 
		
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportMarcas();
		p1.saleCoche(c6);
		p1.saleCoche(c5);
		p1.reportMarcas();
		
		System.out.println("--PROBANDO REPORT MARCAS EN ALEATORIO--");
		
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportMarcas();
		p1.saleCocheAleatorio();
		p1.saleCocheAleatorio();
		p1.reportMarcas();
		
		System.out.println("--PROBANDO REPORT MARCAS EN VACIA PARKING--");
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportMarcas();
		p1.vaciaParking();
		p1.reportMarcas();
		
		System.out.println("--PROBANDO REPORT COCHES IGUALES EN ENTRA Y SALE COCHE--"); 
		
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportCochesIguales();
		p1.saleCoche(c5);
		p1.saleCoche(c6);
		p1.reportCochesIguales();
		
		System.out.println("--PROBANDO REPORT COCHES IGUALES EN ALEATORIO--");
		
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportCochesIguales();
		p1.saleCocheAleatorio();
		p1.saleCocheAleatorio();
		p1.reportCochesIguales();
		
		System.out.println("--PROBANDO REPORT COCHES IGUALES EN VACIA PARKING--");
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportCochesIguales();
		p1.vaciaParking();
		p1.reportCochesIguales();
		
		System.out.println("--PROBANDO EN ENTRA Y SALE COCHE REPORT SETCOCHES--");
		System.out.println(p1.entraCoche(c5)); 
		System.out.println(p1.entraCoche(c2));
		p1.reportParking();
		p1.reportSetCoches();
		p1.saleCoche(c5);
		p1.saleCoche(c6);
		p1.saleCocheAleatorio();
		p1.reportParking();
		p1.reportSetCoches();
		
		System.out.println("--PROBANDO REPORT SETCOCHES EN ALEATORIO--");
		
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportSetCoches();
		p1.saleCocheAleatorio();
		p1.reportSetCoches();
		p1.saleCocheAleatorio();
		p1.reportSetCoches();
		
		System.out.println("--PROBANDO REPORT SETCOCHES EN VACIAPARKING--");
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		p1.reportSetCoches();
		p1.vaciaParking();
		p1.reportSetCoches();
		p1.vaciaParking();
		p1.reportSetCoches();
		
		
		System.out.println("--PROBANDO PARTE INICIAL REPORTS--");
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.reportParking();
		//p1.entraCoche(c6);
		//p1.saleCoche(c6);
		p1.saleCoche(c5);
		//p1.saleCoche(c5);
		p1.saleCoche(c5);
		//p1.saleCoche(c6);
		p1.reportParking();
		p1.reportColores();
		p1.reportMarcas();
		p1.reportCochesIguales();
		p1.reportSetCoches();*/
		
		
		
		
		//p1.saleCocheAleatorio();
		//p1.saleCocheAleatorio();
		//p1.vaciaParking();
		
		
//		p1.saleCoche(c6);
//		p1.saleCoche(c6);
////		p1.saleCocheAleatorio();
////		p1.saleCoche(c6);
		//p1.reportParking();
//		p1.reportColores();
//		p1.reportMarcas();
//		p1.reportCochesIguales();
//		p1.reportSetCoches();
		
	}
	
	
	
	
}
