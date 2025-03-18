package parking.practicando;

import java.util.Random;

public enum Color {

	RO("Rojo"), NA("Naranja"), AM("Amarillo"), VE("Verde"), AZ("Azul"), 
	IN("Indigo"), VI("Violeta");
	
	private String nombre;

	
	private Color(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}
	
	
	public Color devuelveColorAleatorio() {
		
		Random random = new Random();
		
		Color [] listaColores = Color.values();
		
		return listaColores[random.nextInt(0, listaColores.length)];
		
	}
	
	
}
