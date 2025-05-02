package ejercicios.interfaces.funcionales;

import java.util.Arrays;
import java.util.function.Function;

public class Test {
	
	
	public static void main(String[] args) {
		
		/*System.out.println("PROBANDO TRANSFORMAR CON FUNCTION");
		Integer [] prueba1 = JugandoConArrays.transformar(new Integer [] {1, 2, 3, 4, 5} , x -> x + 1);
		
		for (Integer num : prueba1) {
			System.out.println(num);
		
		}
		
		Integer [] prueba2 = JugandoConArrays.transformar(new Integer [] {1, 2, 3, 4, 5} , x -> x - 1);
		
		for (Integer num : prueba2) {
			System.out.println(num);
		
		}
		
		System.out.println("PROBANDO PROCESAR CON CONSUMER");
		
		JugandoConArrays.procesar(new Integer [] {1, 2, 3, 4, 5} , x -> System.out.println(x));*/
		
		Integer [] miArray = {null, null, 5}; //si hay elementos null
		
		//Integer [] miArray = null; //si el array es null
		
		//Function<Integer, Integer> funcion = null; //si la función de transformación es null
		
		Function<Integer, Integer> funcion = s -> s * 10;
		
		System.out.println(Arrays.toString(JugandoConArrays.transformar(miArray, funcion)));
		
		
		//Arrays. (Es una clase de utildiades, que permite mostrarlo con mayor facilidad)
		
		/*Solucionar el problema si hay un elemento del null y si el array es null y si el function también es null
		 * */
				
	}

}
