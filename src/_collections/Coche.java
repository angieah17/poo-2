
package _collections;

import java.util.Objects;
import java.util.Random;

public class Coche {
	
	//1. Propiedades
	private Marca marca;
	private Color color;
	
	//2. Constructores
	
	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}
	
	public Coche () {
		color = Color.dameColorAleatorio();
		marca = Marca.dameMarcaAleatoria();
	}
		
	
	
	
	
	//3.Métodos
	
	public Color getColor() {
		return color;
	}

	public Marca getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return String.format("Coche: %s %s", marca,color);
	}

	
	/*4. Reconfiguración de hashCode e equals para que
	 * el equals funcione como un == respecto del color y la marca
	 * es decir, al tratarse de enum estos si son ==, corresponden 
	 * al mismo objeto siempre.
	*/
		@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca;
	}

	
	
	
/*	public static void main(String[] args) {
		
		
		Coche c1 = new Coche();
		
		System.out.println(c1);
		
		
	}*/
	
	
	
}
