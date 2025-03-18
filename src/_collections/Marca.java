package _collections;

import java.util.Random;

public enum Marca {
	
	//1. Literales
	TO("Toyota"), ME("Mercedes-Benz"), HO("Honda"), FO("Ford"), CH("Chevrolet");
	
	//2. Propiedades
	
	private String nombre;
	
	//3. Constructor
	
	private Marca(String nombre) {
		this.nombre = nombre;
	}

	
	//4. Getter para devolver el nombre completo de cada literal
	
	public String getNombre() {
		return nombre;
	}
	
	//5.Métodos
	
	public static Marca dameMarcaAleatoria() {
		
		Marca [] marcas = Marca.values();
		Random random = new Random();
		
		return marcas [random.nextInt(0, marcas.length)];
		//marcas es un array de marcas, entonces va a sacar 1 Marca
		//en la posición random.
		
	}
	
	
	
}
