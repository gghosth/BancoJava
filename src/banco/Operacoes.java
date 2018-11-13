package banco;

public class Operacoes {

	
	
	public void adicionarValor(float Valor, int numConta, Banco banco) {
		
		Conta c = banco.buscarConta(numConta);
		
		c.depositar(Valor);
			
		System.out.println("O valor foi depositado.");
		
	}
	
	
	
	public void retirarValor(float Valor, int numConta, Banco banco) {
		
		Conta c = banco.buscarConta(numConta);
		
		c.retirar(Valor);
			
		System.out.println("O valor foi retirado.");
		
		
	}
	
	
	
	
	
	
	
	
	
}
