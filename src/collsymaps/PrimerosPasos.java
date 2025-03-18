package collsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrimerosPasos {
	
	public static void main(String[] args) {
		
		/*El Set:
		 	-No permite elementos duplicados. 
		 	-No garantiza un orden específico, salvo que, se use TreeSet o LinkedHashSet
		 	-Es sensitive case
		  	-Permite operaciones básicas de colecciones como agregar, eliminar, verificar si un elemento existe.
		 * */
		
		String frase = "La casa de la padrera es de todos";
		
		String [] palabras = frase.split(" "); //dividió frase en substrings a partir de los espacios
		
		ArrayList<String> palabrasAL = new ArrayList<>();
		HashSet<String> palabrasSet = new HashSet<>(); //No mantiene orden específico
		TreeSet<String> palabrasTreeSet = new TreeSet<>(); //alfábeticamente
		
		
		for (String palabra : palabras) {
			palabrasAL.add(palabra);
			palabrasSet.add(palabra.toLowerCase()); 
			palabrasTreeSet.add(palabra.toLowerCase()); 
		}
		
		System.out.println(palabrasAL);
		System.out.println(palabrasSet); 
		System.out.println(palabrasTreeSet); 
		
		//Aquí se puede observar la diferencia de cómo lo guarda cada uno:
		
		for (String palabra : palabrasAL) {
			System.out.print(palabra + " "); 
		}
		System.out.println();
		
		for (String palabra : palabrasSet) {
			System.out.print(palabra + " ");
		}
		System.out.println();
		
		for (String palabra : palabrasTreeSet) {
			System.out.print(palabra + " ");
		}
		System.out.println();
		
		//MAP
		// Crear un HashMap y un TreeMap para contar palabras
		HashMap<String, Integer> contadorPalabras = new HashMap<>();
		TreeMap<String, Integer> contadorPalabrasOrdenadas = new TreeMap<>();

		// Recorrer la lista de palabras y contar su frecuencia
		for (String palabra : palabrasAL) {
		    palabra = palabra.toLowerCase(); // Convertir a minúsculas para evitar duplicados por mayúsculas/minúsculas
		    if (contadorPalabras.get(palabra) == null) {
		        contadorPalabras.put(palabra, 1); // Si la palabra no existe, se añade con valor 1
		    } else {
		        contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1); // Si existe, se incrementa su valor
		    }
		    if (contadorPalabrasOrdenadas.get(palabra) == null) {
		        contadorPalabrasOrdenadas.put(palabra, 1); // Lo mismo para el TreeMap
		    } else {
		        contadorPalabrasOrdenadas.put(palabra, contadorPalabrasOrdenadas.get(palabra) + 1);
		    }
		}

		// Imprimir los resultados
		System.out.println(contadorPalabras);
		System.out.println(contadorPalabrasOrdenadas);
		
		
	}
	
}
