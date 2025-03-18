package colecciones;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio1 {

	/*Se tiene que volver static porque el main al ser static, se aplica a toda
	la clase, es decir, no se tiene disponible el this y para usarlo en un 
	método static, se tiene que volver este static*/
	private static void muestraYSubraya (String texto) {
		System.out.println(texto);
		
		for (int i = 0; i < texto.length(); i++) {
			
			System.out.print("-");
			
		}
		
		System.out.println();
		
	}

	private static void muestraTodosLosDatos (ArrayList <Integer> lista) {
		Integer suma = 0;
		Integer maximo = lista.get(0);
		Integer minimo = lista.get(0);
		
		//también funciona con int, integer porque había iniciado con integer
		
		for (Integer num : lista) {
				
			suma += num;
			maximo = num > maximo ? num:maximo;
			minimo = num < minimo ? num: minimo;
			
		}
		
		muestraYSubraya("Suma");
		System.out.println(suma);
		
		muestraYSubraya("Media");
		System.out.println(suma/lista.size());
		
		muestraYSubraya("Máximo");
		System.out.println(maximo);
		
		muestraYSubraya("Mínimo");
		System.out.println(minimo);
	}
			
	public static void main(String[] args) {
		
		
		//ARRAY LIST DE 20 NÚMEROS, ENTRE 1 Y 100
		
		//1. Genero los números aleatorios entre 1 y 100
		//2. Guardo 20 números aleatorios en el ArrayList
		
		Random random= new Random();
				
				
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for (int i = 0; i < 20; i++) {

				numeros.add(random.nextInt(1, 101));
				
			}

		//3. Mostrar en pantalla la lista.
		
		System.out.println();
		muestraYSubraya("Probando Ejercicio ArrayList entre 1 y 100");
		System.out.println(numeros);
		
		//2. Calcula y muestra por pantalla la cantidad, la suma, la media, el máximo y el mínimo de los valores.
		
		System.out.println();
				
		muestraTodosLosDatos(numeros);
		
		//3. Elimina de la lista todos los que son menores que 50
		
		//Forma inicial de hacerlo
		/*for (int i = numeros.size() - 1; i >= 0; i--) {
			if(numeros.get(i) < 50) {
				numeros.remove(i);
			}
		}*/
		
		/*Es necesario hacerlo hacia atrás porque al iterar hacia adelante
		 * mientras se itera se va borrando, entonces al momento de recorrer
		 * ya se han borrado valores, los elementos se han movido y ya no coincide 
		 * al momento de leerlo. Con el for each tampoco funciona, porque usa un
		 * iterador interno y necesita que coincida la lista.*/
		
		numeros.removeIf(num -> num < 50);
		
		
		//4. Vuelve a mostrar la lista
		muestraYSubraya("Mostrando lista con menores de 50");
		System.out.println(numeros);
		
		//5. Calcula y muestra por pantalla la cantidad, la suma, la media, el máximo y el mínimo de los valores. 
		
		muestraTodosLosDatos(numeros);
		
		
	}
			

	
}
