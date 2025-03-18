package parking.practicando;

import java.util.Objects;

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
	
		marca = marca.devuelveMarcaAleatoria();
		color = color.devuelveColorAleatorio();
		
	}

	@Override
	public String toString() {
		return String.format("Coche: %s %s", marca, color);
	}

	public Marca getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}

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
	
	
	
	
	
	
}
