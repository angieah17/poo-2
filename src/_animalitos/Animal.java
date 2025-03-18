package _animalitos;

import _animalitos.Animal.Clasificacion;

public abstract class Animal {

	private float peso; //El float tiene menos bytes, o sea, el double puede dar más precisión
	

	/*final static: cuando la clase se crea debe crear de una vez el valor., dando = a o darle
	 * a través de un bloque static. 
	 * final de instancia: cuando se crea la instancia se le debe dar un valor
	 * { BUSCAR BIEN QUE SON BLOQUES NO STATIC
	 * }
	 * 
	 * */
	
	
	
	protected enum Clasificacion {
		VE, IN // Como este enum solo se está usando en esta clase se puede poner privado
	}

	@Override
	public String toString() {
		return String.format("Soy un animalde %.2f gramos", peso);
	}

}

/*
 * Se puede definir una clase dentro de otra clase pero casi no se usa porque al
 * final termina enredando.

 * Default: no pone nada la clase. Te deja acceder a los del mismo paquete.
 * Private: restrictivo. 
 * Public: sin restricción. Para que una clase sea pública tiene que ser la que le de nombre
 * al archivo. Puede usar cualquier incluso aunque no herede.
 * Protected: se pueden heredar los campos por parte de los hijos. Es decir, sin necesidad del getter. 
 * Da igual en el paquete. 
 */
