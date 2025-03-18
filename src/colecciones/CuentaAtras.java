package colecciones;

import java.util.Arrays;

public class CuentaAtras {
	private int [] valores;
	
	
	public CuentaAtras(int numeroInicial, int numeroFinal) {
		// si inicial 5 y final 2
		//guarda en el array 5,4,3,2
		//ser capaz de rellenar el array con los valores correspondientes
		valores = new int [numeroInicial -numeroFinal +1];
			
		for (int i = 0; i < valores.length; i++) {
			valores [i] = numeroInicial--;
			
		}
	}


	@Override
	public String toString() {
		//si en el array 5,4,3,2
		//devuelve 5 ... 4 ... 3 ...2 ...
	
		String resultado = " ";
		for (int valor : valores) {
			resultado = resultado + valor + " ... ";
		}
		
		
		return resultado;
	}
	
	public void quitaUno () {
		//si en el array 5,4,3,2
		//Debe dejar 5,4,3
		
		int [] arrayViejo = valores;
		int [] arrayNuevo = new int [arrayViejo.length-1];
		
		for (int i = 0; i < arrayNuevo.length; i++) {
			 arrayNuevo[i] = arrayViejo [i];
		}
		valores = arrayNuevo;
	}
	
	
	public static void main(String[] args) {
		CuentaAtras c1 = new CuentaAtras(5, 2);
		System.out.println(c1);
		c1.quitaUno();
		System.out.println(c1);
		c1.quitaUno();
		System.out.println(c1);
	}
	
}
