package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Test {
	
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
	
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();// Se le podría dar una dimensión, por ahora, se deja vacío 
		ArrayList<Integer> al1 = new ArrayList<Integer>(); //Se puede poner de cualquier clase Integer, Boolean, String
		
		System.out.println("PROBANDO ADD Y SIZE");
		System.out.println(al); //A diferencia del array se crea con dimensión 0
		System.out.println(al.size());
		
		al.add("Texto 1"); //Como el arraylist es una clase, se le pueden aplicar métodos
		al.add("Texto 2");
		
		System.out.println(al); //Aquí a diferencia del array se puede imprimir sin el foreach
		
		System.out.println(al.size());
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		
			
		//operador diamante intuye que es de tipo String, no es necesario que le vuelva a decir que entra String
		/*Es como un array dinámico, funciona como una clase, por eso tiene sus propios métodos. 
		 * Por eso se va llenando en la posición como el array, el primero en posicion 0.
		 * 
		 * Al imprimir permite aplicar directamente el print sin necesidad de recorrer con un for. 
		 * 
		 * Se debe poner:
		 * 
		 * Gracias a los genéricos: el equivalente de int. Maneja clases no datos primitivos. 
		 * Clase: Boolean. Clase: Integer. Clase: String. 
		 * 
		 * Los array list son genéricos porque verifica que lo que está dentro corresponde a lo generalado. 
		 *  
		 * 
		 * */
		
		
		//PROBAR LOS MÉTODOS DEL ARRAY
		System.out.println();
		System.out.println("PROBANDO ADD(INDICE, ELEMENTO)");
		
		al.add(1, "torpedo");
		System.out.println(al); 
		
		//Error de compilación: ni siquiera deja ejecutar el contrato. 
		//Error de ejecución: ejecuta el código y cuando lo ejecuta encuentra el error.
		
		System.out.println(al.get(2));
		System.out.println(al.contains("Texto 2")); //contains, si continee un objeto que sea igual, tiene en cuenta myus y minus
		System.out.println(al.contains("Texto 7"));
				
		
		//al.add("", "torpedo"); Ej error de compilación.
		System.out.println(al1.isEmpty());
		al1.clear();
		System.out.println(al1); 
		System.out.println(al1.isEmpty());
		
		System.out.println("l.indexOf(\"texto2\"): " + al.indexOf("Texto 1"));
		System.out.println("l.indexOf(\"texto2\"): " + al.indexOf("Texto 2"));
		System.out.println("l.remove(\"texto2\"): " + al.remove("Texto 2"));
		System.out.println("l.remove(1): " + al.remove(1));
		System.out.println(al); // se le puede decir la cosa o el índice, si es la cosa, borra la referencia a y no la cosa en sí mismo. 
		
		
		System.out.println("set(1, \"seteado\": " + al.set(0, "sobreescribo este elemento (seteado)")); 
		System.out.println(al);
		
		
		//EJERCICIO ARRAYLIST CON 5 TÍTULOS DE LIBROS 
		
		
		//1. Creo el array list de Strings
		ArrayList<String> titulosLibros = new ArrayList<>();
		
		//2. Lleno el array list con los títulos de los libros 
		
		titulosLibros.add("Cien Años de Soledad");
		titulosLibros.add("Psicoanalista");
		titulosLibros.add("El Coronel no Tiene Quien le Escriba");
		titulosLibros.add("Las mil y una noche");
		titulosLibros.add("Cuentos Edgar Allan Poe");
		
		//3. Mostrar en pantalla for each
		
		for (String libro : titulosLibros) {
			System.out.println(libro);
		}
		
		//4. Mostrar en pantalla for
		
		for (int i = 0; i < titulosLibros.size(); i++) {
			System.out.println(titulosLibros.get(i));
		}
		
		
		/*La primera parte cómo se meterían 20 números aleatorios del1 al 100 en el array list
		 * 
		 * */
		
		//ARRAY LIST DE 20 NÚMEROS, ENTRE 1 Y 100
		
		//1. Genero los números aleatorios entre 1 y 100
		
		
		Random random= new Random();
				
		
		//2. Guardo 20 números aleatorios en el ArrayList
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for (int i = 0; i < 20; i++) {
				//también podría:int numeroAleatorio = random.nextInt(1, 101); //Debe estar dentro del bucle porque sino se genera una lista del mismo número.
				//numeros.add(numeroAleatorio);
								
				numeros.add(random.nextInt(1, 101));
				
			}
				
		//3. Mostrar en pantalla la lista.
		System.out.println();
		muestraYSubraya("Probando Ejercicio ArrayList entre 1 y 100");
		System.out.println(numeros);
		
		//2. Calcula y muestra por pantalla la cantidad, la suma, la media, el máximo y el mínimo de los valores.
		
		System.out.println();
		//Cantidad
		
		
		System.out.println("La cantidad de elementos del ArrayList es:" + numeros.size());
		
		//suma
		int suma = 0;
		
		for (Integer num : numeros) {
				
			suma += num;
			
		}
		
		System.out.println("La suma de los elementos del ArrayList es:" + suma );
		//media
		int media =  suma / numeros.size();
					
		System.out.println("La media de los elementos del ArrayList es:" + media );
		//min
		int min = numeros.get(0);
		
		for (Integer num : numeros) {
					
			if(num < min) {
				min = num;
			}
			
		}
		
		System.out.println("El mínimo de los elementos del ArrayList es:" + min);
		
		//max
		
		int max = numeros.get(0);
		
		for (Integer num : numeros) {
					
			if(num > max) {
				max= num;
			}
			
		}
		
		System.out.println("El máximo de los elementos del ArrayList es:" + max);
		
		//3. Elimina de la lista todos los que son menores que 50
		
		for (int i = numeros.size() - 1; i >= 0; i--) {
			if(numeros.get(i) < 50) {
				numeros.remove(i);
			}
		}
		
		/*Es necesario hacerlo hacia atrás porque al iterar hacia adelante
		 * mientras se itera se va borrando, entonces al momento de recorrer
		 * ya se han borrado valores, los elementos se han movido y ya no coincide 
		 * al momento de leerlo*/
		
		//4. Vuelve a mostrar la lista
		
		System.out.println(numeros);
		
		//5. Calcula y muestra por pantalla la cantidad, la suma, la media, el máximo y el mínimo de los valores. 
			
		//calcularSuma(numeros);
		
		
		
		}
		
	
	
}



