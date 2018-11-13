package banco;

public class Operacoes {

	
	
	public float adicionarValor(float Valor, Conta c1) {
		
		float ValorTot = 0;
		
		ValorTot = c1.getSaldo();
		
		ValorTot = ValorTot + Valor;
		
		
		
		
		
		return (ValorTot);
		
	}
	
	
	
	public float retirarValor(float Valor, Conta c1) {
		
		float ValorTot = 0;
		
		ValorTot = c1.getSaldo();
		
		ValorTot = ValorTot - Valor;
		
		
		
		
		return (ValorTot);
		
	}
	
	
	
	
	
	
	
	
	
}
