package interfaces.funcionales;

import java.util.ArrayList;
import java.util.List;

public class Operaciones /*implements OperacionEntraEnteroSaleEntero*/ {
	

	/*@Override
	public int dale(int x) {
		// Según  lo que uno ponga podría hacer el cuadrado, cubo, doble...
		return 0;
	}*/
	
	
	public int cuadrado(int numero) {
				
		return numero * numero;
		
	}
	
	public int cubo (int numero) {
		
		return numero * numero * numero;
		
	}
	
	public int doble(int numero) {
		
		return numero * 2;
		
	}
	
	public int triple(int numero) {
		
		return numero * 3;
		
	}
	
	public int polinomio(int x) {
		
		return polinomioVariable(5, 7, 9, x);
		
	}
	
	public int polinomioVariable(int a, int b, int c, int x) {
		
		return a * cubo(x) + b * cuadrado(x) + c;
		
	}
	
	public List <Integer> filtra (int [] numeros, FiltroEnteros f) {
		
		List<Integer> listaFiltrada = new ArrayList<>();
		
		for (int num : numeros) {
			
			if(f.filtrar(num)) {
				listaFiltrada.add(num);
			}
		
		}
		
		return listaFiltrada;
			
		
	}
	
	
	
	public static void main(String[] args) {
		
		Operaciones operaciones = new Operaciones();
		
		System.out.println(operaciones.cuadrado(5)); 
		System.out.println(operaciones.cubo(5)); 
		System.out.println(operaciones.doble(5)); 
		System.out.println(operaciones.triple(5)); 
		System.out.println(operaciones.polinomio(1)); 
		System.out.println(operaciones.polinomioVariable(5, 7, 9, 1)); 
		
		OperacionEntraEnteroSaleEntero cuadrado = s -> s * s; 
		//En realidad se está instanciando Object, que enchufa la función definida Ej: s -> s * s
		
		OperacionEntraEnteroSaleEntero cubo = s -> s * s * s;
		OperacionEntraEnteroSaleEntero doble = s -> s * 2;
		OperacionEntraEnteroSaleEntero triple = s -> s * 3;
		OperacionEntraEnteroSaleEntero polinomio = s -> 5 * s * s * s * 7 * s *s * 9;
		OperacionEntran4EnterosSaleEntero polinomioVariable = (a, b, c, s) -> a * s * s * s * b * s *s * c;
		
		System.out.println(cuadrado.dale(2));
		System.out.println(cubo.dale(2));
		System.out.println(triple.dale(2));
		System.out.println(polinomio.dale(2));
		System.out.println(polinomio.dale(2));
		
		/*En el main se define dinamicamente una función y se usa parra crear un cálculo*/
		
		System.out.println();
		System.out.println("A PARTIR DE UN NÚMERO ENTERO CALCULAR");
		
		OperacionEntraEnteroSaleDouble mitad =  s -> s / 2.; //Recordar operación con dato primitivo, int x int sale int, do
		OperacionEntraEnteroSaleDouble cuarta =  s -> s / 4.;
		OperacionEntraEnteroSaleDouble decima =  s -> s / 10.;
		OperacionEntraEnteroYNsimaSaleDouble nsima =  (s, n) -> s / n;
		
		System.out.println(mitad.dale(5));
		System.out.println(cuarta.dale(5));
		System.out.println(decima.dale(5));
		System.out.println(nsima.dale(10, 5));
		
		
		//1. Resultado Suma
		int [] arrayEnteros = new int [] {2, 3, -7, -5, 150, 100};
		
		int suma = 0;
		
		for (int num : arrayEnteros) {
			suma += num;
		}
		
		System.out.println();
		System.out.println("RESULTADO SUMA: " + suma);
		
		//2. Resultado Suma de los Pares
		
		List<Integer> listaPares = operaciones.filtra(arrayEnteros, s -> s % 2 == 0 );
			
		int sumaPares = 0;
		
		for (Integer num : listaPares) {
			sumaPares += num;
		}
		
		System.out.println("RESULTADO SUMA PARES: " + sumaPares);
		
		//3. Resultado Suma de los Impares
		
		List<Integer> listaImpares = operaciones.filtra(arrayEnteros, s -> s % 3 == 0 );
		
		int sumaImpares = 0;
		
		for (Integer num : listaImpares) {
			sumaImpares += num;
		}
		
		System.out.println("RESULTADO SUMA IMPARES: " + sumaImpares);
		
		//4. Resultado Suma de los Positivos
		
		List<Integer> listaPositivos = operaciones.filtra(arrayEnteros, s -> s > 0 );
		
		int sumaPositivos = 0;
		
		for (Integer num : listaPositivos) {
			sumaPositivos += num;
		}
		
		System.out.println("RESULTADO SUMA POSITIVOS: " + sumaPositivos);
		
		//5. Resultado Suma de los Negativos
		
		List<Integer> listaNegativos = operaciones.filtra(arrayEnteros, s -> s < 0 );
				
		int sumaNegativos = 0;
				
		for (Integer num : listaNegativos) {
					sumaNegativos += num;
				}
				
		System.out.println("RESULTADO SUMA NEGATIVOS: " + sumaNegativos);
				
				
		//5. Resultado Suma de los Mayores de 100
		
		List<Integer> listaMayoresDe100 = operaciones.filtra(arrayEnteros, s -> s > 100 );
						
		int sumaMayores100 = 0;
						
		for (Integer num : listaMayoresDe100) {
					sumaMayores100 += num;
			}
						
		System.out.println("RESULTADO SUMA MAYORES DE 100: " + sumaMayores100);
						
					
		//6. Resultado Suma de los Mayores de n
		
		int n = 70;
		
		List<Integer> listaMayoresDen = operaciones.filtra(arrayEnteros, s -> s > n );
								
		int sumaMayoresn = 0;
								
		for (Integer num : listaMayoresDen) {
				sumaMayoresn += num;
			}
								
		System.out.printf("RESULTADO SUMA MAYORES DE %d: %d%n", n, sumaMayoresn);
								
					
		
		
	}

	
	
}
