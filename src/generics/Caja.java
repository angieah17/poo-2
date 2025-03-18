package generics;

public class Caja <T>{
	
	//1. Propiedades
	private T contenido;

	//2. Constructores
	public Caja(T contenido) {
		super();
		this.contenido = contenido;
	}
	
	//3. Getter y setter
	
	

	public T getContenido() {
		return contenido;
	}

	public void setContenido(T contenido) {
		this.contenido = contenido;
	} 
	
	//4. Main 
	
	public static void main(String[] args) {
		
		Caja <String> cs = new Caja<String>("a");
		Raton r = new Raton(); //Se puede pasar una variable de tipo Ratón o un Ratón en sí mismo
		Caja <Raton> cr = new Caja<Raton>(new Raton());
		
	}
	
	
}
