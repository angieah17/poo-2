package enumerados;

public enum Mes {
	
	//1. Literales
	ENE("Enero", "January", 1), FEB("Febrero",  "February", 2), 
	MAR("Marzo", "March", 3), ABR("Abril", "April", 4), MAY("Mayo", "May", 5), 
	JUN("Junio", "June", 6), JUL("Julio", "July", 7), AGO("Agosto", "August", 8), 
	SET("Septiembre", "September", 9),OCT("Octubre", "October", 10), 
	NOV("Noviembre", "Novemeber", 11), DIC("Diciembre", "December", 12);
	
	//2. Propiedades
	private String nombreES;
	private String nombreEN;
	private int numMes;
	
	
	//3. Constructor
	private Mes(String nombreES, String nombreEN, int numMes) {
		this.nombreES = nombreES;
		this.nombreEN = nombreEN;
		this.numMes = numMes;
	}

	
	//4. Getter
	public String getNombreES() {
		return nombreES;
	}


	public String getNombreEN() {
		return nombreEN;
	}


	public int getNumMes() {
		return numMes;
	}
	
	
	//5. Método
	
	public String presentar() {
		return String.format("El Mes (%d) es %s (%s).%n", numMes, nombreES, nombreEN);
	}
	
	
	
	
	public static String dameMesDadoNumero (int numMes) {
		
		for (Mes m : Mes.values()) {
				if(numMes== m.numMes) {
					return String.format("El Mes (%d) es %s (%s)", m.numMes, m.nombreES, m.nombreEN);
				} 
		
		}
		return String.format("Valor no encontrado");
		
	}
	
	
	public static String dameNumeroDadoMes (Mes mes) {
		
		return String.format("El Mes (%d) es %s (%s)", mes.numMes, mes.nombreES, mes.nombreEN);
		
	}  //El dado mes es el getter en sí mismo, no es necesario crear otro método más. 
	//Diferente sería crearlo statico para que no aplique a cada instancia sino a la clase en sí misma.
	
	
}
