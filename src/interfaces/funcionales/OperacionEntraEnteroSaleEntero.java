package interfaces.funcionales;

@FunctionalInterface //Anotacion que sirve para definir una interfaz funcional
public interface OperacionEntraEnteroSaleEntero {
	
	int dale(int x); //se entiende como un interfaz que es un método public abstract
	
	//El interfaz funcional solo puede tener 1 método abstracto
}
