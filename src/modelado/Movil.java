package modelado;

public class Movil {
	
	//1. Propiedades
	private boolean encendido;
	private int nivelBateria;
	private String modelo;
	private String marca;
	private boolean modoBajoConsumo;
	
	//2. Constructores
	
	public Movil(String marca, String modelo) {
		this.modelo = modelo;
		this.marca = marca;
		nivelBateria = 20;
	}

	
	
	//3. Métodos 
	public void encender () {
		
		encendido = encendido ? encendido : true;
		
	}

	

	//Se podía hacer los dos juntos. Encender y apagar a la vez.
	
	public void apagar () {
		
		encendido = encendido ? false : encendido;
		
		
	}
	
	
	public Movil llamar () {
		
		return consumir(2);
		
		
	}
	
	public Movil navegar () {
		
		return consumir(1);
		
		
	}
	
	
	/*Se tenía que poner el bajo consumo en llamar y navegar especialmente, 
	adicionalmente podría crearse un método para consultar el bajo consumo, pero no era lo que pedía.*/
	
	//Se pone el consumir privado para que solo se use si hay una llamada o navegación
	private Movil consumir (int consumo) {
		
		if(!encendido) return this; 
		
		nivelBateria = nivelBateria <= consumo ? 0 : nivelBateria - consumo;
		
		/*También se podía tomarlo de sacar el 0.02
		pero se podía liar más: nivelBateria - (100 * 0.02)
		*/
		
		//modoBajoConsumo = nivelBateria < 10 ? true : false; Esto es igual a lo de abajo:
		modoBajoConsumo = nivelBateria < 10;
		
		if(nivelBateria <= 2) encendido = false;
		
		return this;
		
	}
	
	public boolean mostrarBajoConsumo () {
		
		System.out.printf("Modo bajo consumo:%s%n", modoBajoConsumo ? "Activado" : "Desactivado");
		
		return modoBajoConsumo;
	}
	
	public void recargarBateria () {
		
		nivelBateria = nivelBateria + 25 >= 100 ? 100 : nivelBateria + 25;
					
	}
	
	@Override
	public String toString() {

		return String.format("-Encendido:%b.%n-Nivel Bateria:%d%n-Marca:%s.%n-Modelo:%s.%n-Modo Bajo Consumo:%b.%n", encendido, nivelBateria, marca, modelo, modoBajoConsumo);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Crear, apagar y encender");
		System.out.println("========================");
		
		Movil m1 = new Movil("Samsung", "Galaxy");
		//Movil m2 = new Movil("Apple", "Iphone16");
		
		System.out.println("Móvil creado");

		System.out.println(m1);
		m1.encender();
		System.out.println("Móvil encendido");
		System.out.println(m1);
		m1.apagar();
		System.out.println("Móvil apagado\n" + m1);
		
		System.out.println("Navegar, llamar y modo bajo consumo");
		System.out.println("========================");
		System.out.println("Antes de llamar\n" + m1);
		m1.encender();
		for (int i = 0; i < 3; i++) {
			m1.llamar();
		}
		System.out.println("Después de llamar\n" + m1);
		for (int i = 0; i < 5; i++) {
			m1.navegar();
		}
		
		System.out.println("Después de navegar\n" + m1);
		m1.mostrarBajoConsumo();
		
		System.out.println("Recarga batería");
		System.out.println("========================");
		
		System.out.println("Antes de recargar batería\n" + m1);
		for (int i = 0; i < 5; i++) {
			m1.recargarBateria();
		}
		
		System.out.println("Después de recargar batería\n" + m1);
		
		m1.llamar().navegar().llamar();

	}
	
	
	
	
	
}
