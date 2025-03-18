package arraylist;

import java.util.ArrayList;

public class ArrayEjemplo1 {
	
	
	public static void main(String[] args) {
		
		//2. Crear un ArrayList que restrinja el tipo de elementos que puede incluir a String llamado colores.
		ArrayList<String> colores = new ArrayList<>();
		
		
		//3. Poblarlo con los siguientes elementos: rojo, amarillo, verde, rojo, amarillo, azul, naranja, marrón, verde.
		colores.add("rojo");
		colores.add("amarillo");
		colores.add("verde");
		colores.add("rojo");
		colores.add("amarillo");
		colores.add("azul");
		colores.add("naranja");
		colores.add("marrón");
		colores.add("verde");
		
		//4. Imprimir los colores del array, de 2 formas distintas:
		
		for (String color : colores) {
			System.out.println(color);
		}
		
		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}
		
		//5. Borra el segundo rojo del ArrayList, para ello:
		
		for (int i = colores.size() - 1; i > 0; i--) {
			
		}
		
		
		
	}
	
}
