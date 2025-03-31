package ejercicios.interfaces.funcionales;

import java.util.function.Consumer;
import java.util.function.Function;

public class JugandoConArrays {
	
	public static Integer [] transformar (Integer [] arrayInteger, Function<Integer, Integer> funcion) {
		
		//Agrego el static para trabajarlo sin instanciar 
		
		Integer [] integerFinal =  new Integer[arrayInteger.length]; //Se debe crear el array final con la dimensión que tendrá al final
		
		
		for (int i = 0; i < arrayInteger.length; i++) { 
            integerFinal[i] = funcion.apply(arrayInteger[i]); //Se usa el índice para facilitar su almacenamiento
        }
				
		return integerFinal;
	}
	
	
	public static void procesar (Integer [] arrayInteger, Consumer<Integer> funcion) {
		
		for (int i = 0; i < arrayInteger.length; i++) { 
            funcion.accept(arrayInteger[i]);
        }
		
		
		
	}
	
	
	
}
