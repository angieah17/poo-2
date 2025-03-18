package enumerados;

public class Fieston {
	
	//1. Propiedades
	private String lugar; 
	private FinDe dia; //aquí se esta llamando al enum
	private Mes mes;
	
	//2. Constructor
	public Fieston(String lugar, FinDe dia) {
		this.lugar = lugar;
		this.dia = dia;
	}
	
	
	@Override
	public String toString() {
		return "Fieston [lugar=" + lugar + ", dia=" + dia + "]";
	}

	public static void main(String[] args) {
		
		/*Fieston fieston = new Fieston("Core", FinDe.SA);
		System.out.println(fieston);
		
		for (FinDe f : FinDe.values()) {
			System.out.println(f.presentacion());
		}
		
		System.out.println();*/
		
		for (Mes m : Mes.values()) {
			//System.out.println(m.presentar());
			//System.out.println(m.ordinal()); //devuelve el índice del orden desde 0
			
		}
		//System.out.println(Mes.valueOf("ENE")); //Si corresponde con un enum devuelve el enum 
		
		
		
		System.out.println(Mes.dameMesDadoNumero(5));
		
		System.out.println(Mes.dameNumeroDadoMes(Mes.ABR));
		
		
		//FinDe.values(); crea un array con los valores del enum
		
		//FinDe tiene los métodos disponibles de Object, que en este caso 
		//es estático pues aplican a toda la clase
		
		
	}
	
	
}
