package banco;

public class App {

	
	
	public static void main (String[] args) {
		
		
		
		Conta cc = new ContaCorrente(1000);
		Conta cp = new ContaPoupanca(1000);
		Conta ci = new ContaInvestimento(1000);
		
		
		cc.depositar(1000);
		System.out.println(cc.getSaldo());
		cc.retirar(1000);
		System.out.println(cc.getSaldo());
		cc.render();

		
		cp.depositar(1000);
		System.out.println(+cp.getSaldo());
		cp.retirar(1000);
		System.out.println(+cp.getSaldo());
		cp.render();

		
		ci.depositar(1000);
		System.out.println(+ci.getSaldo());
		ci.retirar(1000);
		System.out.println(+ci.getSaldo());
		ci.render();
		System.out.println(+ci.getSaldo());
		
		
		
	}
	
	
	
	
	
}
