package lambdas.repaso;

import java.util.Arrays;
import java.util.function.Predicate;

public class Test {

	/*
	 * Permite que se pueda pasar como parámetro una función
	 */
	private static int[] opera2Arrays(int[] array1, int[] array2, EntranDosEnterosSaleEntero funcion) {

		int[] arrayResultado = new int[array1.length];

		for (int i = 0; i < arrayResultado.length; i++) {
			arrayResultado[i] = funcion.opera(array1[i], array2[i]);
		}

		return arrayResultado;
	}

	public static void main(String[] args) {

		// Usualmente se suelen poner en las lambdas letras fáciles, tener cuidado que
		// no entre en conflicto con otras variables del código

		EntranDosEnterosSaleEntero suma = (int a, int b) -> {
			return a + b;
		};

		/*
		 * Si entran dos tipos se puede quitar la definición del tipo y usar paréntesis,
		 * si solo es 1 return no es necesario {} ni el return
		 */
		EntranDosEnterosSaleEntero resta = (a, b) -> a + b;

		System.out.println(suma.opera(2, 1));
		System.out.println(resta.opera(2, 1));

		int[] resultado = opera2Arrays(new int[] { 2, 3, 4 }, new int[] { 2, 3, 4 }, (a, b) -> a - b);

		// int [] resultado = opera2Arrays(new int [] {2, 3, 4}, new int [] {2, 3, 4},
		// suma;
		// También se podía hacer así, pasando una variable ya guaradada del tipo.

		System.out.println(Arrays.toString(resultado));

		Entran2StringsSaleBoolean stringsIguales = (s1, s2) -> s1.equals(s2);

		System.out.println(stringsIguales.opera("hola", "hola"));

		Entran2StringsSaleBoolean stringContenidoEn = (s1, s2) -> s1.contains(s2);

		System.out.println(stringContenidoEn.opera("hola", "old"));

		EntranStringSaleBoolean menor3Caracteres = s -> s.length() < 3;

		System.out.println(menor3Caracteres.opera("Hola"));

		EntraStringIntSaleBoolean menorNCaracteres = (s, i) -> s.length() < i;

		System.out.println(menorNCaracteres.opera("HoLA", 4));

		EntranStringSaleBoolean empiezaPorA = s -> s.startsWith("A");
		
		System.out.println(empiezaPorA.opera("Angie"));
		
		
		//Con los Common Built-in Functional Interfaces
		
		//1. Como el EntraStringSaleBoolean
		
		Predicado<String> empiezaPorS = s -> s.startsWith("S");
		Predicate<String> empiezaPorT = s -> s.startsWith("T");
		
		System.out.println(empiezaPorS.test("Angie"));
		System.out.println("PRUEBA " + empiezaPorT.test("Tomas"));
		
		//2. Como el Entran2StringSaleBoolean
		
		BiPredicado<String, String> stringContenido = (s1, s2) -> s1.contains(s2);
		
		System.out.println(stringContenido.test("Angie", "Angie"));
		
		//3. Consumidor 
		
		Consumidor<String> imprime = s -> System.out.println("Hola soy el Consumer");
		
		
		
		
	}

}
