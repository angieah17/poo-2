package herencia;

public class CuentaAhorros extends CuentaBancaria{

	//1. Propiedaes
		private double tasaInteres;

	
		
	//2. Constructores 
		
		public CuentaAhorros(String numeroCuenta, double saldo, double tasaInteres) {
		super(numeroCuenta, saldo);
		this.tasaInteres = tasaInteres; //FALTA LIMITAR
	}

		
		
	//3. Métodos
		
		@Override
		public void retirar(double monto) {
			
			double montoMinimoEnCuenta = 500;
			
			if(monto > 0 && getSaldo() - monto < montoMinimoEnCuenta ) {
				setSaldo(getSaldo() - monto);
				System.out.println("Retiro exitoso. Saldo actual:%.2f€.%n\", getSaldo()");
			} else {
				System.out.println("No es posible realizar el retiro. Límite de monto mínimo en cuenta superado.");
			}
			
			
			
		}
		
		public void aplicarIntereses () {
			
			setSaldo(getSaldo() + tasaInteres); 			
		}
		
		
		@Override
		public String toString() {
			return String.format("Cuenta bancaria: [Ahorros]%n-Tasa de Interes:%.2f%%.%n%s", tasaInteres, super.toString());
		}
	
	
}
