package ejercicios.interfaces.funcionales;

public class Test {
	
	
	public static void main(String[] args) {
		
		System.out.println("PROBANDO TRANSFORMAR CON FUNCTION");
		Integer [] prueba1 = JugandoConArrays.transformar(new Integer [] {1, 2, 3, 4, 5} , x -> x + 1);
		
		for (Integer num : prueba1) {
			System.out.println(num);
		
		}
		
		Integer [] prueba2 = JugandoConArrays.transformar(new Integer [] {1, 2, 3, 4, 5} , x -> x - 1);
		
		for (Integer num : prueba2) {
			System.out.println(num);
		
		}
		
		System.out.println("PROBANDO PROCESAR CON CONSUMER");
		
		JugandoConArrays.procesar(new Integer [] {1, 2, 3, 4, 5} , x -> System.out.println(x));
		
		
		
		
		
				
	}

}
