package banco;

public class ContaInvestimento extends Conta {

	private float saldo;
	
	
	public ContaInvestimento(float valorInicial) {
		this.saldo = valorInicial;
		
	}
	
	@Override
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
		
	}
	
	@Override
	public void retirar(float valor) {
		this.saldo = this.saldo - valor;
	}
	
	@Override
	public void render() {
		this.saldo = this.saldo * 1.5f ;
	}
	
	public float getSaldo() {
		return this.saldo;
		
	}
	
	
}