package repaso.parking;

import java.util.Objects;

public class Coche {
	
	private Color color;
	private Marca marca;
	
	
	
	
	public Coche(Marca marca, Color color) {
		this.color = color;
		this.marca = marca;
	}
	
	public Coche () {
		//this.color = color;
		//this.marca = marca;
		
		color = Color.aleatorio();
		marca = Marca.aleatorio();
		
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + "]" + "(" + hashCode() + ")." ;
	}

	
	//Reajustando el equals
	
	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
		//La clase Objects me da un método disponible para aplicar generar un hash a partir de un color y marca
	}
	
	/*Permite convertir el conjunto de cosas que permiten la igualdad en un número entero, así hace la
	 * comprobación más fácil. De ahí la necesidad que equals se defina a la vez con el HashCode.
	 * El Hash no es una garantía de igualdad, pueden tener los mismos Hash(pero disminuye la propabilidad de
	 * que se repitan) entonces si tienen el mismo Hash ya entra a revisar el equals, pero son menos las 
	 * veces que tiene que entrar a comparar el obj.
	 * 
	 * Básicamente si dos obj tienen el mismo HashCode pueden ser iguales, pero necesariamente son distintos. Entonces
	 * se ahorra todos los distintos, y se comprueba el equals solo en los que pueden ser iguales*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //Si es el mismo objeto
			return true;
		if (obj == null)
			return false; //Si el objeto es igual a null es falso
		if (getClass() != obj.getClass()) //Si son de la misma clase
			return false;
		Coche other = (Coche) obj; //Aquí ya sabiendo que es un coche el objeto lo vuelvo Coche y hago la comprobación siguiente
		return color == other.color && marca == other.marca; //Aquí ya hace la validación, vemos que es == porque se trata de un enum, si fuese una
		//comprobación de String tendría que revisarse color.equals 
	}
	
	
	
	
	
	
}
