package juegos;

public class Numeros {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d ",i);
		}
		
		System.out.println();
		
		int num = 1;
		
		/*while(num <= 10) {
			System.out.printf("%d ",num++);
		}
		
		System.out.println();
		*/
		
		do {
			System.out.printf("%d ",num++);
		} while (num <= 10);
		
		System.out.println();
		
		//Array bidimencional:
		
		int [] [] array2D = new int [4][3];
		int [] [] array2D_2 = {{3, 2, 5},{1,7}}; //Array Bidimensional irregular. 
		
		
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				array2D[i][j] = 1;
			}
		}
		
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < array2D_2.length; i++) {
			for (int j = 0; j < array2D_2[i].length; j++) {
				System.out.print(array2D_2[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
