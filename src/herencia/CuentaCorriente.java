package herencia;

public class CuentaCorriente extends CuentaBancaria {
	
	//1. Propiedaes
	
	private double montoSobregiro;

	
	
	//2. Constructores 
	public CuentaCorriente(String numeroCuenta, double saldo, double montoSobregiro) {
		super(numeroCuenta, saldo);
		this.montoSobregiro = montoSobregiro; //falta restringir si hace falta
	}



	
	
	//3. Métodos
	
	@Override
	public void retirar(double monto) {
		
		if(monto > 0 && getSaldo() - monto >= -montoSobregiro ) {
			setSaldo(getSaldo() - monto);
			System.out.printf("Retiro exitoso. Saldo actual:%.2f€.%n", getSaldo());
		} else {
			System.out.println("No es posible realizar el retiro. Límite de sobregiro excedido.");
		}
		
		
		
	}
	
	@Override
	public String toString() {
		return String.format("Cuenta bancaria: [Corriente]%n-Monto Sobregiro:%.2f€.%n%s", montoSobregiro, super.toString());
	}

	
	
}
