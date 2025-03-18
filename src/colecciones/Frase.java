package colecciones;

import java.util.Arrays;

public class Frase {
	
	private String [] palabras;
	
	//Crear una frase que separe cada palabra por espacios en blanco
	public Frase(String frase) {
		//split con espacios en blanco
		palabras = frase.split(" ");
		
	}
	
	@Override
	public String toString() {
		String resultado = "";
		for (String palabra : palabras) {
			resultado += palabra + " ";
		}
		return resultado;
	}


	public void addPalabra(String palabra) {
		String [] arrayNuevo = new String[palabras.length + 1];
		String [] arrayViejo = palabras;
		
		 for (int i = 0; i < arrayViejo.length; i++) {
			arrayNuevo[i] = arrayViejo [i];
			
		}
		 arrayNuevo[arrayNuevo.length-1] = palabra;
		 palabras = arrayNuevo;
		
	}
	
	
	public static void main(String[] args) {
		Frase f1 = new Frase ("hola soy yo");
		System.out.println(f1);
		f1.addPalabra("lola");
		System.out.println(f1);
	}
	
}
