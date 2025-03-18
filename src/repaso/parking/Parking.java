package repaso.parking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Parking {
	
	private String nombre; 
	private int plazasTotales;
	private int plazasLibres;
	private List<Coche> listaDeCoches;
	private Set<Coche> conjuntoCoches;
	
	public Parking(String nombre, int plazasTotales) {
		this.nombre = nombre;
		this.plazasTotales = plazasTotales;
		plazasLibres = plazasTotales;
		listaDeCoches = new ArrayList<>();
		conjuntoCoches = new HashSet<>();
	}

	
	public boolean entraCoche(Coche coche) {
		
		boolean cocheDentro = false;
		
		for (Coche c : listaDeCoches) {
			if(c == coche) {
				cocheDentro = true;
				break;
			}
		}
		
		/*El contains revisa si el objeto que te estoy dando es equals al coche que está dentro. Es decir, 
		 * si tienen el mismo contenido, en este caso para saber si el coche está dentro necesito revisar si 
		 * los coches son == , es decir, el mismo objeto no que tengan el mismo contenido. 
		 * 
		 * A diferencia que en el conjunto, que usamos un hashSet justamente buscando un listado de tipos de coches que hayan,
		 * en ese caso, si quiero que compruebe el contenido de cada coche. 
		 * Entonces en el momento que se redefine el equals se afecta el contains. 
		 * */
		
		if(plazasLibres > 0 && !cocheDentro) {
			plazasLibres--;
			listaDeCoches.add(coche);
			conjuntoCoches.add(coche); 
			return true;
		}
		
		return false;
	}


	public List<Coche> getListaDeCoches() {
		return listaDeCoches;
	}


	public Set<Coche> getConjuntoCoches() {
		return conjuntoCoches;
	}




	
	
	
}
