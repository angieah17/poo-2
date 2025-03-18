package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Numeros {
	
	//Método privado para generar palabra, que de esta manera se devuelva un String 
	
	private static String generarPalabra() {
		
		Random random = new Random();
		
		String palabra = "";
		char letra;
	
		for (int i = 0; i < 4; i++) {
		  letra = (char) random.nextInt('a', 'z' + 1);
		  palabra += letra;
		}
		
		
		return palabra;
	}
	
	
	
	public static void main(String[] args) {
		
		//1. Crea un ArrayList que contenga los primeros n números pares.
		
		System.out.println();
		System.out.println("Ejercicio 1");
		
		ArrayList<Integer> numerosPares = new ArrayList<>();
		
		int cantidadNumerosPares = 10;
		int partiendoDe = 1;			
		int contador = 0;
		
		while (contador < cantidadNumerosPares) {
						
				if(partiendoDe % 2 == 0){
					numerosPares.add(partiendoDe);
					contador++;
				}
				partiendoDe++;
		}
			
			
		System.out.println(numerosPares);
		
		/*
		
		for (int contador = partiendoDe; contador <= cantidadNumerosPares; partiendoDe++) {
			
			if(partiendoDe % 2 == 0) {
				numerosPares.add(partiendoDe);
				contador++;
			}
				
			
		}*/
			
		
		//2. Crea un ArrayList que contenga los 
		//primeros n números múltiplos de m a partir de un número dado p.
		System.out.println();
		System.out.println("Ejercicio 2");
		
		ArrayList<Integer> numerosMultiplosDe = new ArrayList<>();
		
		int cantidadNumeros = 5;
		int multiplosDe = 5;
		partiendoDe = 3;
		contador = 0;
		int numero = partiendoDe;
		
		while (contador < cantidadNumeros) {
			
			if(numero % multiplosDe == 0) {
				numerosMultiplosDe.add(numero);
				contador++;
			}
			
			numero++;			
		}
		
		System.out.println(numerosMultiplosDe);
		
		//3. Crea un ArrayList de Strings de 4 letras aleatorias del alfabeto inglés
		//en minúsculas, con 1000 palabras. Luego recórrelo y crea otro nuevo ArrayList,
		//donde estén las palabras que terminan por a o c. 
		//Muestra este último e indica cuantas palabras tiene.
		
		System.out.println();
		System.out.println("Ejercicio 3");
		
		ArrayList<String> palabras = new ArrayList<>();
		
			for (int i = 0; i < 1_000; i++) {
				palabras.add(generarPalabra());
			}
			
		
		System.out.println(palabras);
		
		ArrayList<String> palabrasTerminadasPorAOC = new ArrayList<>();
		
		for (int i = 0; i < palabras.size(); i++) {
			if(palabras.get(i).endsWith("a") || palabras.get(i).endsWith("c")) {
				palabrasTerminadasPorAOC.add(palabras.get(i));
			}
		}
		
		System.out.println(palabrasTerminadasPorAOC);
		System.out.println("Cantidad de palabras terminadas por a o c: " + palabrasTerminadasPorAOC.size());
		
	}
	
}
