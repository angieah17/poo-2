package enumerados;

public enum FinDe {
	
	
	//Es una Clase Especial 
	//Un enumerado por convenio tiene un literal, es lo que hace referencia a este
	
	VI(5, "Viernes", "Friday"), SA(6, "Sábado", "Saturday"), DO(7, "Domingo", "Sunday"); //literales, se escriben en mayúsculas completamente 
	
	//Crea el enum inmediatamente se usa uno 
	
	//Si solo se definen literales no se pone ; 
	
	private int numeroDia;
	private String nomEs;
	private String nomEn;
	

	/*private FinDe(int numeroDia) {
		this.numeroDia = numeroDia; //Es private porque nadie puede construirlo, lo construye JAVA
	}*/

	private FinDe(int numeroDia, String nomEs, String nomEn) {
		this.numeroDia = numeroDia;
		this.nomEs = nomEs;
		this.nomEn = nomEn;
	}


	//Se deben dar los parámetros de construcción para cada uno de los literales, agregandolo 
	//al lado del literal
		

	public int getNumeroDia() {
		return numeroDia;
	}


	public String getNomEs() {
		return nomEs;
	}


	public String getNomEn() {
		return nomEn;
	}
	
	//Métodos
	
		public String presentacion() {
			return String.format("El día (%d) de la semana es el %s (%s)", numeroDia, nomEs, nomEn);
		}
	
	
	/*PASOS:
	 * Crear un literal
	 * Crear la propiedad.
	 * Crear el constructor private. 
	 * Dar los parámetros. 
	 * Métodos siguen igual. 
	 * El toString se puede sobreescribir. 
	 * */
	
	
	
	
}
