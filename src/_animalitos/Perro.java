package _animalitos;

import _animalitos.Animal.Clasificacion;

public class Perro extends Animal {
	
	private String raza;
	private final static Clasificacion clasificacion = Clasificacion.VE;
	//STATIC DEJA DE PENSAR EN HERENCIA
	
	/*static {
		
		Animal.clasificacion = Clasificacion.VE;
		
		//Las clases se crean solo 1 vez, entonces si el bloque
		//es static se está creando siempre 
	}*/
	
	
	public Perro(float peso, Clasificacion clasificacion, String raza) {
		//super(); si no se pone igual internamente lo toma
		this.raza = raza;
	}
	
	
	/*Las propiedades privadas y los métodos privates no se heredan, por eso
	 * Clasificacion se ha tenido que cambiar de private a protected*/ 
	
	
	
}
