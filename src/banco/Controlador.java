package banco;

import java.util.Scanner;

public class Controlador {

	private static Scanner sc1;
	
	static Criador criador = new Criador();
	
	static Operacoes ops = new Operacoes();
	
	public static int numConta = 3000000;
	
	public void comeco(Banco banco) {
		
		
		System.out.println("Digite seu CPF:");
		String cpf = sc1.next();
		if(banco.buscarCpfCorrentista(cpf) == true) {
			this.criarConta(banco, cpf);
		}
		System.out.println("Digite seu nome:");
		String nm = sc1.next();
		sc1.nextLine();	
		sc1.nextLine();
		
		this.criarCorrentista(banco, nm, cpf);
		
		this.criarConta(banco, cpf);
		
	}
	
	
	
	public Correntista criarCorrentista(Banco banco, String nm, String cpf) {
		
	
		Correntista c1 = criador.novoCorrentista(nm, cpf);
		
		banco.adicionarCorrentista(c1);
		
		
		return (c1);
		
	}


	public void criarConta(Banco banco, String cpf) {
		
		System.out.println("Qual tipo de conta? 1 para corrente, 2 para poupança e 3 para Investimento:");
		
		int choose = sc1.nextInt();
		
		switch(choose) {
		
		case 1:

			Conta cc = criador.novaContaCorrente(0, numConta, cpf);
			numConta++;
			banco.adicionarConta(cc);

			break;
			
		case 2:

			Conta cp = criador.novaContaPoupanca(0, numConta, cpf);
			numConta++;
			banco.adicionarConta(cp);
			
			break;
			
		case 3:
	
			Conta ci = criador.novaContaInvestimento(0, numConta, cpf);
			numConta++;
			banco.adicionarConta(ci);
			
			break;
		
	}
	
	
	
	}
	
	
	
	public void acoes (Banco banco) {
		
		System.out.println("Digite o número da sua conta");
		
		int numConta = sc1.nextInt();
		
		if(banco.buscarNumConta(numConta) == true) {
		
			
		int o = sc1.nextInt();
		
		switch(o) {
		
		case 1:
			System.out.println("O que deseja fazer na sua conta? 1 para depositar, 2 para retirar.");
			
			int p = sc1.nextInt();
			
			switch(p) {
			
			case 1:
				System.out.println("Qual a quantia do depósito?");
				
				float Valor = sc1.nextFloat();
				
				ops.adicionarValor(Valor, numConta, banco);
				
				break;
				
			case 2:
				System.out.println("Qual a quantia que deseja retirar?");
				
				float Valor1 = sc1.nextFloat();
				
				ops.retirarValor(Valor1, numConta, banco);
				
				break;
				
			
				}	
		
			}
		
		}
		
		else {
			
		System.out.println("Sua conta não existe, tente novamente.");	
			
		}
		
		
	}
	
	
	
	
}
