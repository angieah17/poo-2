package _collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {

	// 1. Propiedades
	private String nombre;
	private int totalPlazas;
	private boolean parkingVacio;
	private List<Coche> listaDeCoches;
	private static Random random = new Random();
	private Map<Color, Integer> numeroCochesPorColor;
	private Map<Marca, Integer> numeroCochesPorMarca;
	private Map<Coche, Integer> numeroCochesPorCadaTipo;
	private Set<Coche> informacionSobreCochesDeCadaTipo;

	// 2. Constructores
	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas > 0 ? totalPlazas : 1;
		listaDeCoches = new ArrayList<>();
		parkingVacio = true;
		numeroCochesPorColor = new HashMap<>();
		numeroCochesPorMarca = new HashMap<>();
		numeroCochesPorCadaTipo = new HashMap<>();
		informacionSobreCochesDeCadaTipo = new HashSet<>();
	}

	// 3. Métodos privados

	private boolean estaCocheDentro(Coche coche) {

		for (Coche c : listaDeCoches) {
			if (c == coche) {
				return true;
			}
		}

		return false;
	}

	private static void parteInicialReports(String frase) {

		System.out.println();
		System.out.printf("%s%n", frase);

		for (int i = 0; i < frase.length(); i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.println("Parking: Mi primer parking");

	}

	private void parteFinalReportsMaps() {
		System.out.printf("Total coches: %s%n", listaDeCoches.size());
	}

	private void sumarMap(Coche coche) {

		// Gestión de Map Numero de Coches por Color
		int conteoColores = numeroCochesPorColor.getOrDefault(coche.getColor(), 0);
		numeroCochesPorColor.put(coche.getColor(), conteoColores + 1);

		// Gestión de Map Numero de Coches por Marca

		int conteoMarcas = numeroCochesPorMarca.getOrDefault(coche.getMarca(), 0);
		numeroCochesPorMarca.put(coche.getMarca(), conteoMarcas + 1);

		// Gestión de Map Número de Coches por Tipo
		int conteoCoches = numeroCochesPorCadaTipo.getOrDefault(coche, 0);
		numeroCochesPorCadaTipo.put(coche, conteoCoches + 1);
	}

	private void restarMap(Coche coche) {

		// Gestión de Map Numero de Coches por Color
		int conteoColores = numeroCochesPorColor.get(coche.getColor());
		Color colorDelCoche = coche.getColor();

		numeroCochesPorColor.put(colorDelCoche, conteoColores - 1);

		if (numeroCochesPorColor.get(colorDelCoche) <= 0) {
			numeroCochesPorColor.remove(colorDelCoche);
		}

		// Gestión de Map Numero de Coches por Marca
		int conteoMarcas = numeroCochesPorMarca.get(coche.getMarca());
		Marca marcaDelCoche = coche.getMarca();

		numeroCochesPorMarca.put(marcaDelCoche, conteoMarcas - 1);

		if (numeroCochesPorMarca.get(marcaDelCoche) <= 0) {
			numeroCochesPorMarca.remove(marcaDelCoche);
		}

		// Gestión de Map Número de Coches por Tipo
		int conteoCoches = numeroCochesPorCadaTipo.get(coche);

		numeroCochesPorCadaTipo.put(coche, conteoCoches - 1);

		if (numeroCochesPorCadaTipo.get(coche) <= 0) {
			numeroCochesPorCadaTipo.remove(coche);
			// Gestión del Set Numero de Coches por Tipo
			informacionSobreCochesDeCadaTipo.remove(coche);
		}

	}

	// 4. Métodos públicos

	public boolean entraCoche(Coche coche) {

		// estaCocheDentro(coche); //System.out.println(estaCocheDentro(coche)); // Para
		// probar si funcionaba el método privado

		boolean parkingConPlazas = listaDeCoches.size() < totalPlazas;

		if (!estaCocheDentro(coche) && parkingConPlazas) {

			// Gestión del ArrayList de lista de coches dentro
			listaDeCoches.add(coche);

			// Gestión del Set Numero de Coches por Tipo
			informacionSobreCochesDeCadaTipo.add(coche);

			sumarMap(coche);

			// System.out.println(informacionSobreCochesDeCadaTipo); //Porbando como queda
			// set
			parkingVacio = false;
			return true;

		}

		// System.out.println(estaCocheDentro(coche)); //Para probar el método
		return false;

	}

	public boolean saleCoche(Coche coche) {

		//System.out.println(estaCocheDentro(coche));

		//Se podría quitar el parking vacio porque si se comprueba que el coche está dentro el parking ya no estaría vacío
		if (!parkingVacio && estaCocheDentro(coche)) {

			restarMap(coche);

			// Gestión del ArrayList de lista de coches dentro
			
			/*listaDeCoches.remove() no se puede usar porque tira del equals, 
			 * entonces me termina sacando coches con el mismo contenido, 
			 * pero que no son identicos. 
			 * 
			 * Y no puedo modificar el equals, porque lo necesito para el
			 * set tal cual está descrito.
			 * */
			
			for (int i = 0; i < listaDeCoches.size(); i++) {
				if(listaDeCoches.get(i) == coche) {
					listaDeCoches.remove(i);
					parkingVacio = listaDeCoches.isEmpty();
					return true;
				}
			}

		}

		// System.out.println(numeroCochesPorColor); Para probar el estado del mapa al
		// final de aplicar el método
//		 System.out.println(estaCocheDentro(coche)); //Para probar el método

		return false;
	}

	public Coche saleCocheAleatorio() {

		if (parkingVacio) {
			return null;
		}

		int indiceCocheAleatorio = random.nextInt(listaDeCoches.size());

		Coche cocheAleatorio = listaDeCoches.get(indiceCocheAleatorio);

		restarMap(cocheAleatorio);
		
		/*saleCoche(cocheAleatorio); se podría tirar del saleCoche*/
		
		listaDeCoches.remove(indiceCocheAleatorio);
		
		parkingVacio = listaDeCoches.isEmpty();

		return cocheAleatorio;

	}

	public boolean vaciaParking() {

		if (parkingVacio) return false;
		

		while (!parkingVacio) {
			saleCocheAleatorio();
		}

		//while(saleCocheAleatorio() != null); otra forma de hacerlo, por lo que sale un Coche 
		
		parkingVacio = true;
		return true;

	}

	// 5. Métodos Reports
	public void reportParking() {

		parteInicialReports("LISTADO COCHES");

		int plazasLibres = totalPlazas - listaDeCoches.size();

		for (Coche coche : listaDeCoches) {
			System.out.printf("  %s%n", coche);
		}

		System.out.printf("Total coches: %d, plazas libres:%d%n", listaDeCoches.size(), plazasLibres);

	}

	public void reportColores() {

		parteInicialReports("REPORT DE COLORES");

		// System.out.println(numeroCochesPorColor); //Para probar cómo entraba el mapa
		// antes de aplicar el método

		if (!numeroCochesPorColor.isEmpty()) {
			for (Color color : numeroCochesPorColor.keySet()) {
				System.out.printf("El coche de color %s se repite %d %s.%n", color.getNombre(),
						numeroCochesPorColor.get(color), numeroCochesPorColor.get(color) > 1 ? "veces" : "vez");
			}
		}

		parteFinalReportsMaps();
	}

	public void reportMarcas() {

		parteInicialReports("REPORT DE MARCAS");

		// System.out.println(numeroCochesPorMarca); //Para probar cómo entraba el mapa
		// antes de aplicar el método

		if (!numeroCochesPorMarca.isEmpty()) {
			for (Marca marca : numeroCochesPorMarca.keySet()) {
				System.out.printf("El coche de marca %s se repite %d %s.%n", marca.getNombre(),
						numeroCochesPorMarca.get(marca), numeroCochesPorMarca.get(marca) > 1 ? "veces" : "vez");
			}
		}

		parteFinalReportsMaps();
	}

	public void reportCochesIguales() {

		parteInicialReports("REPORT DE COCHES IGUALES");

		// System.out.println(numeroCochesPorCadaTipo); //Para probar cómo entraba el
		// mapa antes de aplicar el método

		if (!numeroCochesPorCadaTipo.isEmpty()) {
			for (Coche coche : numeroCochesPorCadaTipo.keySet()) {
				System.out.printf("%s está %d %s.%n", coche, numeroCochesPorCadaTipo.get(coche),
						numeroCochesPorCadaTipo.get(coche) > 1 ? "veces" : "vez");
			}
		}

		parteFinalReportsMaps();
	}

	public void reportSetCoches() {

		parteInicialReports("REPORT SET DE COCHES");

		// System.out.println(informacionSobreCochesDeCadaTipo); //Para probar cómo
		// entraba el mapa antes de aplicar el método

		if (!informacionSobreCochesDeCadaTipo.isEmpty()) {
			for (Coche coche : informacionSobreCochesDeCadaTipo) {
				System.out.println(coche);
			}
		}

		System.out.printf("Total items: %s%n", informacionSobreCochesDeCadaTipo.size());
	}

	public void dameTodosLosReports() {
		reportParking();
		reportColores();
		reportMarcas();
		reportCochesIguales();
		reportSetCoches();
	}
	
	
	
	
	
	
	
	
	
	
	// ELIMINAR ESTA PARTE ES SOLO PARA PRUEBAS DEL SCRIPT TEST 

	public Map<Color, Integer> getNumeroCochesPorColor() {
		return numeroCochesPorColor;
	}

	public Map<Marca, Integer> getNumeroCochesPorMarca() {
		return numeroCochesPorMarca;
	}

	public Map<Coche, Integer> getNumeroCochesPorCadaTipo() {
		return numeroCochesPorCadaTipo;
	}

	public Set<Coche> getInformacionSobreCochesDeCadaTipo() {
		return informacionSobreCochesDeCadaTipo;
	}

}
