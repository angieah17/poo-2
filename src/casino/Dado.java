package casino;

import java.util.Random;

public class Dado {
	
	//1. Propiedades
	public int lanzamiento;
	private int [] historico;
	private int caras;
	
	//2. Constructores
	
	
	public Dado (int caras, int elementosHistorico) {
		this.caras = caras;
		 historico = new int [elementosHistorico]; //Con elementosHistorico se está estableciendo la cantidad de registros de lanzamientos que se van 
		 //A poder guardar, por lo tanto, se está estableciendo la dimensión del array. 
		 
		 //No se genera un constructor con lanzamiento, porque este valor se va a generar a partir del método lanzar y se irá guardando en el histórico.
	}
	
	
	
	//3. Métodos 
	
	public int lanzar () {
		Random random = new Random(); //Random es una clase del paquete JAVA. random es el nombre de la variable que estamos declarando. new Random() es una
		//instancia de la clase Random que estamos creando a partir del constructor predeterminado y que con esto nos habilita el uso de métodos. 
		
		lanzamiento = random.nextInt(1, 7); //Para que salga el número 6 se pone hasta el 7
		
		for (int i = 1; i < historico.length; i++) {
			historico[i - 1] = historico [i];
			
			//Se recorre el array y la idea es que los índices se vayan desplazando hacia arriba 
			//para que el último lanzamiento entre en la última posición del array
		}
		
		
		historico [historico.length - 1] = lanzamiento;
		
		
		return lanzamiento;
	}
	
	public int contarNumeroDeCaras (int lanzamientos, int numeroCara) {
		
		/*Con este método se busca lanzar x veces el dado (lanzamientos)
		 * y contar el número de veces que aparece Y cara en dichos lanzamientos (numeroCara)
		 * 
		 * lanzamientos: Especifica cuántas veces se lanzará el dado.
			numeroCara: Es el número de la cara del dado que deseamos contar en 
			esos lanzamientos.
		 * 
		 * */
		
		
		int contador = 0;
		boolean caraValida = numeroCara >= 1 && numeroCara <= caras;
		
		
		if(caraValida) {
			for (int i = 0; i < lanzamientos; i++) {
				if (lanzar() == numeroCara){
				contador++;
				}
			} 
		}			
		return contador;
	}
	
	public void mostrarHistorico () {
		for (int tirada : historico) {
			if (tirada != 0) {
				System.out.printf(" %d", tirada);
			}
			
		}
	}
	
	//4. MAIN
	public static void main(String[] args) {
		Dado d1 = new Dado(10, 50);
		
		for (int i = 0; i < 10; i++) {
			d1.lanzar();
		}
		
		d1.mostrarHistorico();
	}
	
	
	
	
}
