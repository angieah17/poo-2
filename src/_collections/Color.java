package _collections;

import java.util.Random;

public enum Color {
	
	//1. Literales
	RO("rojo"), NA("naranja"), AM("amarillo"), VE("verde"), AZ("azul"), 
	IN("índigo"), VI("violeta");
	
	//2. Propiedades
	
	private String nombre;

	
	//3. Constructor
	
	private Color(String nombre) {
		this.nombre = nombre;
	}
	
	
	//4. Getter para devolver el nombre completo de cada literal
	
	public String getNombre() {
		return nombre;
	}

	//5. Método
	
	public static Color dameColorAleatorio() {
		
		Color[] colores = Color.values();
		
		Random random = new Random();
		
		return colores[random.nextInt(0, colores.length)];
						
		
	}
	

	
	
	
}
