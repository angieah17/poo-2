package _herencia;

public interface Volador {
	
	public abstract void despega();
	void aterriza();
	void planea();
	
	/*Se crean abstractos para que cada clase defina cómo funciona
	 * cada método según la clase. Pero sí o sí debe tener estos 
	 * métodos integrados. 
	 * */
	
	//OJO! Puede que se encuentre sin public ni abstract
	//se entiende que están integrados. 
	
}
