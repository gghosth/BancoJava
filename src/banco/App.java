package banco;

import java.util.Scanner;


public class App {
	
	static Banco banco = new Banco();

	public static int numConta = 3000000;
	
	private static Scanner sc1;

	private static Scanner sc2;

	public static void main (String[] args) {
		
		
		
/*		Conta cc = new ContaCorrente(1000);
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
		
	
	
	*/
	
		
	System.out.println("Bem vindo ao programa do banco, o que deseja fazer?");
	System.out.println("Digite 1 para criar conta, 2 para editar e 3 para sair: ");
	sc1 = new Scanner (System.in);
	sc2 = new Scanner (System.in);
	int i = sc1.nextInt();
	
	switch(i) {
	
	
	case 1: 
	
		System.out.println("Digite seu nome:");
		String nm = sc1.next();
		sc1.nextLine();
		System.out.println("Digite seu CPF:");
		String cpf = sc2.next();
		sc2.nextLine();
		Correntista c1 = new Correntista(nm, cpf);
		banco.adicionarCorrentista(c1);
		
		System.out.println("Qual tipo de conta? 1 para corrente, 2 para poupança e 3 para Investimento:");
	
		int choose = sc1.nextInt();
		
		switch(choose) {
		
		case 1:
			Conta cc = new ContaCorrente(0, numConta, cpf);
			numConta++;
			banco.adicionarConta(cc);

			break;
			
		case 2:
			Conta cp = new ContaPoupanca(0, numConta, cpf);
			numConta++;
			banco.adicionarConta(cp);
			break;
			
		case 3:
			Conta ci = new ContaInvestimento(0, numConta, cpf);
			numConta++;
			banco.adicionarConta(ci);
			break;
		
		}
		
		
		
	break;
		
		
	case 2:
	
	break;	
		
		
	case 3:
	
	System.out.println("Obrigado por usar o programa!");
	break;
	
		}
		
	
	System.out.println("Digite seu cpf para buscar na coleção");
	sc1.nextLine();
	String cpfbusca = sc1.next();
	
	Conta cteste = banco.buscarContaCpf(cpfbusca);
		System.out.println(cteste.getnumConta());

	
	}
	
}
