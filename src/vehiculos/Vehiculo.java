package vehiculos;

public abstract class Vehiculo {
	
	//1. Propiedades
	private int velocidadMaxima;
	private int numeroDeRuedas;
	private double peso;
	private int velocidad;
	
	
	//2. Constructores 
	
	public Vehiculo(int velocidadMaxima, int numeroDeRuedas, double peso) {
		this.velocidadMaxima = velocidadMaxima;
		this.numeroDeRuedas = numeroDeRuedas;
		this.peso = peso;
	}
	
	//3. Métodos

	public boolean acelerar() {
		
		 if(velocidad + 10 > velocidadMaxima) {
			 velocidad = velocidadMaxima;
			 return false;
		 } else {
			 velocidad += 10;
			 return true;
		 }
		
	}
	
	/*Otra forma de hacerlo:
	public Vehiculo acelerar() {
		
		 velocidad = velocidad + 10 < velocidadMaxima ? velocidad + 10 : velocidadMaxima; 
	        
	     return this;
		
	}
	*/
	
	
	
	public Vehiculo frenar() {
		
		velocidad = velocidad - 10 >= 0 ? velocidad - 10 : 0 ;
        return this;
	}

	
	
	
	
	@Override
	public String toString() {
		
		return String.format("%n-Velocidad máxima: %d.%n-Número de ruedas: %d.%n-Peso: %.2f.%n", velocidadMaxima, numeroDeRuedas, peso);
	}
	
	/*
	 * Otra forma de gestionar el tema de matrícula común a todos: 
	 * 
	 * -Poner que matrícula sea un campo común preguntando si matrícula es != null poner matricula, sino espacio
	 * en blanco y de esa manera en motocicleta no aparecería. 
	 * */
	
	
}
