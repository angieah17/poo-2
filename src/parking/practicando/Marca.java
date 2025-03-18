package parking.practicando;

import java.util.Random;

public enum Marca {
	
	TO("Toyota"), RE("Renault"), HI("Hyundai"), CH("Chevrolet"), FO("Ford");
	
	private String nombre;

	private Marca(String nombre) {
		this.nombre = nombre;
	}

	
	public String getNombre() {
		return nombre;
	}
	
	
	public Marca devuelveMarcaAleatoria() {
		
		Random random = new Random();
		Marca [] listadoMarcas = Marca.values();
	
		return listadoMarcas[random.nextInt(0, listadoMarcas.length)];
	
		
	}
	
	
}
