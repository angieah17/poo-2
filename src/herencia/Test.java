package herencia;

public class Test {
	public static void main(String[] args) {
		
		CuentaAhorros ca = new CuentaAhorros("ES 900 778", 1200, 0.5);
		CuentaCorriente cc = new CuentaCorriente("ES 786 1524", 1300, 400);
		
		
		System.out.println(ca);
		ca.depositar(500);
		
		ca.aplicarIntereses();
		System.out.println(ca);
		
		
		
		System.out.println(cc);
		cc.depositar(400);
		System.out.println(cc);
		cc.retirar(800);
		System.out.println(cc);
		cc.retirar(950);
		System.out.println(cc);
		cc.retirar(950);
		System.out.println(cc);
		
	}
}
