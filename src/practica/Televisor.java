package practica;

public class Televisor {
	
	//1. Propiedades
		
	private boolean encendido; 
	private int canal; 
	private int volumen; 
	private double brillo; 
	private String version; 
	private String [] historicoActualizaciones; 
	
	//2. Constructores
	
	public Televisor() {
		canal = 1; //canal por defecto
		brillo = 75; //brillo por defecto
		version = "V01"; //por defecto
		historicoActualizaciones = new String [10];
	}
	
		
	
	//3. Métodos
	
	public boolean encender() {
				
		return encendido = true;
	}
	
	public boolean apagar() {
		
		return encendido = false;
		
	}

	public void subirVolumen () {
		
		if(encendido) {
			int volumenMaximo = 100; 
		
		volumen = volumen + 1 < volumenMaximo ? volumen + 1 : volumenMaximo;
		} else {
			System.out.println("Es necesario encender el TV para usar algunas funcionalidades.");
		}
		
		
	}
	
	public void bajarVolumen () {
		
		if(encendido) {
			int volumenMinimo = 0;
		
		volumen = volumen - 1 > volumenMinimo? volumen - 1 : volumenMinimo;
		} else {
			System.out.println("Es necesario encender el TV para usar algunas funcionalidades.");
		}
		
		
		
	}
	
	public void cambiarCanal (int canal) {
		
		int cantidadCanales = 100;
		
		if(encendido) {
			
			if(canal <= cantidadCanales && canal >= 1) {
				this.canal = canal; 
			} else {
				System.out.println("No es posible ejecutar este cambio de canal");;
			}
			
		} else {
			System.out.println("Es necesario encender el TV para usar algunas funcionalidades.");
		}
		
	}
		
	public void ajustarBrillo(double porcentajeDeBrillo) {
		
		if(encendido) {
			
			if(porcentajeDeBrillo > 0) {
				this.brillo = this.brillo + (this.brillo * porcentajeDeBrillo) / 100;
				//this.brillo += this.brillo * porcentajeDeBrillo / 100;
			} else if (porcentajeDeBrillo > 100){
				this.brillo = 100;
			}
			
			
		} else {
			System.out.println("Es necesario encender el TV para usar algunas funcionalidades.");
		}
		
		
	}
	
	

	public void actualizarVersion (String versionNueva) {
		
		version = versionNueva;
		
		for (int i = 1; i < historicoActualizaciones.length; i++) {
			
			historicoActualizaciones[i-1] = historicoActualizaciones[i];
			
		}
		
		historicoActualizaciones[historicoActualizaciones.length - 1] = version;
		
	}
	
	public String [] mostrarHistoricoVersiones () {
		
		for (String version : historicoActualizaciones) {
			if (version != null) {
				System.out.println(version);
			}
			
		}
		
		return historicoActualizaciones;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("El televisor está encendido:%b.%nVolumen:%d.%nCanal:%d.%n"
				+ "Brillo:%.2f%%.%nVersion:%s.%n", encendido, volumen, canal, brillo, version);
	}
	
	public static void main(String[] args) {
		Televisor t1 = new Televisor();
		
		System.out.println(t1);
		t1.encender();
		System.out.println(t1);
		t1.apagar();
		System.out.println(t1);
		
		
		
		System.out.println("Probando Subir y Bajar Volumen");
		System.out.println();
		
		t1.subirVolumen();
		t1.encender();
		
		for (int i = 0; i < 10; i++) {
			t1.subirVolumen();
		}
		
		System.out.println(t1);
		
		for (int i = 0; i < 5; i++) {
			t1.bajarVolumen();;
		}
		
		System.out.println(t1);
		
		t1.apagar();
		t1.bajarVolumen();
		
		System.out.println();
		System.out.println("PROBANDO CAMBIAR CANAL");
		System.out.println();
		t1.encender();
		t1.cambiarCanal(10);
		System.out.println(t1);
		
		t1.cambiarCanal(-2);
		System.out.println(t1);
		
		t1.ajustarBrillo(5);
		System.out.println(t1);
		
		System.out.println();
		System.out.println("PROBANDO ACTUALIZAR VERSION");
		System.out.println();
		t1.actualizarVersion("V02");
		t1.actualizarVersion("V03");
		t1.actualizarVersion("V04");
		System.out.println(t1);
		t1.mostrarHistoricoVersiones();
		
	}
	
}
