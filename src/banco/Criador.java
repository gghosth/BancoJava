package banco;

public class Criador {

	
	public Banco novoBanco() {
		
		
	 Banco banco = new Banco();
		
	
	 return (banco);
	}
	
	
	public Correntista novoCorrentista(String Nome, String CPF) {
		
	
		
		Correntista c1 = new Correntista(Nome, CPF);
		
	//	banco.adicionarCorrentista(c1);
		
		return (c1);
		
	}
	
	
	public Conta novaContaPoupanca(int inicial, int numeroConta, String CPF) {
		
		
		
		Conta cp = new ContaPoupanca(0, numeroConta, CPF);
		
		
	//	banco.adicionarConta(cp);
		
		return (cp);
	}
	
	
	public Conta novaContaCorrente(int inicial, int numeroConta, String CPF) {
		
		
		
		Conta cc = new ContaCorrente(0, numeroConta, CPF);
		
		
	//	banco.adicionarConta(cc);
		
		return (cc);
	}
	
	public Conta novaContaInvestimento(int inicial, int numeroConta, String CPF) {
		
		
		
		Conta ci = new ContaInvestimento(0, numeroConta, CPF);
		
	//	banco.adicionarConta(ci);
		
		
		return (ci);
	}
	
	
}
