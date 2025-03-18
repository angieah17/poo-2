package generics;

public class Pareja <T,S> {
	
	//1. Propiedades
	private T contenido1;
	private S contenido2;
	
	
	//2. Constructores
	
	public Pareja(T contenido1, S contenido2) {
		super(); 
		this.contenido1 = contenido1;
		this.contenido2 = contenido2;
	}


	
	//3. Getters y setters
	
	public T getContenido1() {
		return contenido1;
	}


	public void setContenido1(T contenido1) {
		this.contenido1 = contenido1;
	}


	public S getContenido2() {
		return contenido2;
	}


	public void setContenido2(S contenido2) {
		this.contenido2 = contenido2;
	}
	
	
	
	//4. Main
	
	public static void main(String[] args) {
		
		Pareja<String, Moneda> p1 = new Pareja<String, Moneda>("t", new Moneda()); 
		
		
		
	}
	
	
	
}
