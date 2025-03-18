package casino;

import java.util.Random;

public class Dado2 {
	
	//1. Propiedades
	
	private int lanzamiento;
	private int caras;
	private int [] historico;
	
	//2.Constructores
	
	public Dado2(int caras, int elementoHistorico) {
		this.caras = caras;
		historico = new int [elementoHistorico];
	}
	
	//3. Métodos 
	
	/*Se necesitan 3 métodos: 
	 * a. Lanzar dado. En principio de 6 caras, por lo tanto, de 1 a 7 en el random.
	 * Además dentro de este método ir guardando cada lanzamiento en el histórico.
	 * b. Mostrar Lanzamiento. 
	 * c. Contar el número de veces que ha salido una cara en X cantidad de
	 * lanzamientos. 
	 * */
	
	public int lanzar () {
		
		Random random = new Random ();
		
		lanzamiento = random.nextInt(1, 7); 
		
		for (int i = 1; i < historico.length; i++) {
			
			historico[i - 1] = historico[i];
						
		}
		
		historico[historico.length - 1] = lanzamiento;
		
		return lanzamiento;
	}
	
	public int numeroDeVecesQueHaSalidoUnaCara (int lanzamientosARealizar, int numeroDeCara) {
		
		int contador = 0; 
		
		boolean caraValida = numeroDeCara >= 1 && numeroDeCara <= caras;
		
		if(caraValida) {
			
			for (int i = 1; i <= lanzamientosARealizar; i++) {
				
				if(lanzar() == numeroDeCara) {
					contador++;
				}
			}
		}
		
		return contador;
		
	}
	
	public void mostrarLanzamiento () {
		
		for (int elemento : historico) {
			if (!(elemento == 0)) {
				System.out.printf(" %d", elemento);
			}
		}
		
	}

	
	public static void main(String[] args) {
		
		Dado2 d = new Dado2(6, 10);
		
		d.lanzar();
		d.lanzar();
		
		
		d.mostrarLanzamiento();
		
		System.out.println();
		System.out.println("PROBANDO NUMERO DE VECES QUE HA SALIDO UNA CARA");
		
		System.out.println(d.numeroDeVecesQueHaSalidoUnaCara(5, 9));
		
		
		
	}
	
	
	
	
	
	
}
