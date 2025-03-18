package herencia;

public abstract  class CuentaBancaria {
	
	//1. Propiedades
	private String numeroCuenta; //FALTA: Limitar si alcanza el tiempo
	private double saldo; //FALTA: limitar si alcanza el tiempo
	
	//2. Constructores
	
	public CuentaBancaria(String numeroCuenta, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	
	
	//3. Métodos
	
	public void depositar (double monto) {
		
		if(monto > 0) {
			saldo += monto;
			System.out.printf("Depósito realizado con éxito. Saldo actual:%.2f€.%n", saldo);
		} else {
			System.out.println("No es posible realizar este depósito.");
		}
		
		 
	}
		

	public abstract void retirar (double monto); 
	
	
	
	@Override
	public String toString() {
		
		return String.format("-Numero de cuenta:%s.%n-Saldo:%.2f€.%n", numeroCuenta, saldo);
	}

//4. Getters y setter

	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
}
