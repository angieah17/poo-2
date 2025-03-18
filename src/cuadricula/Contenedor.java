package cuadricula;

import java.text.Format;

public class Contenedor {
	
	//1. Propiedades
	private int filas;
	private int cols;
	int [] [] array;
	
	//2. Constructores 
	
	public Contenedor(int filas, int cols) {
		this.filas = filas >= 0 && filas <= 10 ? filas : 5;
		this.cols = cols >= 0 && cols <= 10 ? cols : 5;
		array = new int [this.filas][this.cols]; 
	}
	
	
	public Contenedor (int dimension) {
		this(dimension, dimension);
	}
	
	
	public void show () {
		/*for (int i = 0; i < array.length; i++) {
			System.out.print("|   ");
			for (int j = 0; j < array[i].length; j++) {
				if(j != array[i].length -1) {
					System.out.print(array[i][j]+ " ");
				} else {
					System.out.print(array[i][j]);
				}
				
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.printf("[%d x %d]%n", filas, cols);
		System.out.println();*/
		
		show(false);
		
	}
	
	public void show (boolean hideZeros) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("|   ");
			for (int j = 0; j < array[i].length; j++) {
				if(hideZeros) {
					System.out.print(" ·");
				} else {
					if(j != array[i].length -1) {
						System.out.print(array[i][j]+ " ");
					} else {
						System.out.print(array[i][j]);
					}
				}
				
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.printf("[%d x %d]%n", filas, cols);
		System.out.println();
		
		
	}

	public static void show (Contenedor [] contenedores) {
		
		
		for (int i = 0; i < contenedores.length; i++) {
			System.out.println(i);
		}
	
		
	}
	
	
	//3.Getters
	
	public int[][] getArray() {
		return array;
	}
	
	
	
	public static void main(String[] args) {
		
		Contenedor a1 = new Contenedor(2, 20);
		Contenedor a2 = new Contenedor(2);
		Contenedor a3 = new Contenedor(3);
		
		a1.show();
		a2.show();
		a2.show(true);
		
		//a1.show(new [] {a2, a3});
		
		
	}


	





	


	
}
