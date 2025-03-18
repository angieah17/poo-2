package parking.practicando;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;



public class Parking {
	
	//1. Propiedades
	private String nombre;
	private int totalPlazas;
	private boolean parkingVacio;
	private List<Coche> listaDeCoches;
	private static Random random = new Random();
	private Map<Color, Integer> mapaPorColor;
	private Map<Marca, Integer> mapaPorMarca;
	private Map<Coche, Integer> mapaPorCoche;
	private Set<Coche> setCoches;
	
	
	//2. Constructores
	public Parking(String nombre, int totalPlazas) {
		super();
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		listaDeCoches = new ArrayList<>();
		parkingVacio = true;
		mapaPorColor = new HashMap<>();
		mapaPorMarca = new HashMap<>();
		mapaPorCoche = new HashMap<>();
		setCoches = new HashSet<>();
	}
	
	
	//3. Métodos privados
	
	private boolean cocheDentro(Coche coche) {
			
		for (Coche c : listaDeCoches) {
			if(c == coche) {
				return true;
			}
		}
		
		return false;
	}
	
	
	private void sumaMap(Coche coche) {
		
		int conteoCochePorColor = mapaPorColor.getOrDefault(coche.getColor(), 0);
		mapaPorColor.put(coche.getColor(), conteoCochePorColor + 1);
		
		mapaPorMarca.put(coche.getMarca(), mapaPorMarca.getOrDefault(coche.getMarca(), 0) +  1);
		
		mapaPorCoche.put(coche, mapaPorCoche.getOrDefault(coche, 0) + 1);
		
	}
	
	private void restaMap(Coche coche) {
		
		mapaPorColor.put(coche.getColor(), mapaPorColor.get(coche.getColor()) - 1);
		
		if(mapaPorColor.get(coche.getColor()) <= 0) {
			mapaPorColor.remove(coche.getColor());
		}
		
		mapaPorMarca.put(coche.getMarca(), mapaPorMarca.get(coche.getMarca()) - 1);
		
		if(mapaPorMarca.get(coche.getMarca()) <= 0) {
			mapaPorMarca.remove(coche.getMarca());
		}
		
		mapaPorCoche.put(coche, mapaPorCoche.get(coche) - 1);
		
		if(mapaPorCoche.get(coche) <= 0) {
			mapaPorCoche.remove(coche);
			setCoches.remove(coche);
		}
		
		
	}
	
	//4. Métodos públicos
	
	public boolean entraCoche(Coche coche) {
		
		boolean parkingConPlazas = totalPlazas > listaDeCoches.size();
				
		if(parkingConPlazas && !cocheDentro(coche)) {
			
			listaDeCoches.add(coche);
			
			sumaMap(coche);
			
			setCoches.add(coche);
			
			parkingVacio = false;
			return true;
		}
		
				
		return false;
		
	}
	
	public boolean saleCoche(Coche coche) {
		
		if(!parkingVacio && cocheDentro(coche)) {
			
						
			restaMap(coche);
			
			for (int i = 0; i < listaDeCoches.size(); i++) {
				if(listaDeCoches.get(i) == coche) {
					listaDeCoches.remove(i);
					parkingVacio = listaDeCoches.isEmpty();
					return true;
				}
								
			}
			
		}
		
		return false;
		
	}
	
	public Coche saleCocheAleatorio() {
		
		if(parkingVacio) return null;
		
		int indiceDeCocheAleatorio = random.nextInt(listaDeCoches.size());
		
		Coche cocheAleatorio = listaDeCoches.get(indiceDeCocheAleatorio);
		
		saleCoche(cocheAleatorio);
				
		return cocheAleatorio;
		
	}
	
	public boolean vaciaParking() {
		
		if(parkingVacio) return false;
		
		while(!parkingVacio) {
			saleCocheAleatorio();
		}
		
		return true;
	}
	
	private void parteInicialReport(String frase) {
		
		System.out.println();
		System.out.println(frase);
		System.out.println("-".repeat(frase.length()));
		System.out.println("Parking: Mi primer parking");
		
	}
	
	public void reportParking() {
		
		parteInicialReport("LISTADO DE COCHES");
		
		int plazasLibres = totalPlazas - listaDeCoches.size();

		for (Coche coche : listaDeCoches) {
			System.out.printf("  %s%n", coche);
		}

		System.out.printf("Total coches: %d, plazas libres:%d%n", listaDeCoches.size(), plazasLibres);
		
	}
	
	
	public void reportColores() {
		
		parteInicialReport("REPORT DE COLORES");


		if (!mapaPorColor.isEmpty()) {
			for (Color color : mapaPorColor.keySet()) {
				System.out.printf("El coche de color %s se repite %d %s.%n", color.getNombre(),
						mapaPorColor.get(color), mapaPorColor.get(color) > 1 ? "veces" : "vez");
			}
		}
		
		System.out.printf("Total coches: %d.%n", listaDeCoches.size());
	}
	
	public void reportMarcas() {
		
		parteInicialReport("REPORT DE MARCAS");


		if (!mapaPorMarca.isEmpty()) {
			for (Marca marca : mapaPorMarca.keySet()) {
				System.out.printf("El coche de marca %s se repite %d %s.%n", marca.getNombre(),
						mapaPorMarca.get(marca), mapaPorMarca.get(marca) > 1 ? "veces" : "vez");
			}
		}
		
		System.out.printf("Total coches: %d.%n", listaDeCoches.size());
	}
	
	
	public void reportCochesIguales() {
		
		parteInicialReport("REPORT DE COCHES IGUALES");


		if (!mapaPorCoche.isEmpty()) {
			for (Coche coche : mapaPorCoche.keySet()) {
				System.out.printf("%s está %d %s.%n", coche,
						mapaPorCoche.get(coche), mapaPorCoche.get(coche) > 1 ? "veces" : "vez");
			}
		}
		
		System.out.printf("Total coches: %d.%n", listaDeCoches.size());
	}
	
	public void reportSetCoches() {
		
		parteInicialReport("REPORT SET DE COCHES");


		if (!setCoches.isEmpty()) {
			for (Coche coche : setCoches) {
				System.out.println(coche);
			}
		}
		
		System.out.printf("Total items: %d.%n", setCoches.size());
	}
	
	
	public void dameTodosLosReports() {
		reportParking();
		reportColores();
		reportMarcas();
		reportCochesIguales();
		reportSetCoches();
	}
	
}
