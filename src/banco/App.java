package banco;

public class App {

	
	
	public static void main (String[] args) {
		
		
		
		Conta cc = new ContaCorrente(1000);
		Conta cp = new ContaPoupanca(1000);
		Conta ci = new ContaInvestimento(1000);
		
		System.out.println("A conta corrente tem: "+cc.getSaldo());
		System.out.println("A conta poupança tem: "+cp.getSaldo());
		System.out.println("A conta investimento tem: "+ci.getSaldo());
		
		cc.depositar(1000);
		System.out.println("A conta corrente tem: "+cc.getSaldo());
		cc.retirar(1000);
		System.out.println("A conta corrente tem: "+cc.getSaldo());
		cc.render();

		
		cp.depositar(1000);
		System.out.println("A conta poupança tem: "+cp.getSaldo());
		cp.retirar(1000);
		System.out.println("A conta poupança tem: "+cp.getSaldo());
		cp.render();

		
		ci.depositar(1000);
		System.out.println("A conta investimento tem: "+ci.getSaldo());
		ci.retirar(1000);
		System.out.println("A conta investimento tem: "+ci.getSaldo());
		ci.render();
		System.out.println("A conta investimento tem: "+ci.getSaldo());
		
		cc.transferirPara(cp, 500);
		System.out.println("A conta corrente tem: "+cc.getSaldo());
		System.out.println("A conta poupança tem: "+cp.getSaldo());
		
		cp.transferirPara(ci, 500);
		System.out.println("A conta poupança tem: "+cp.getSaldo());
		System.out.println("A conta investimento tem: "+ci.getSaldo());
		
	}
	
	
	
	
	
}
