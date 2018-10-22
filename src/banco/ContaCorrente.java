package banco;

public class ContaCorrente extends Conta {

	private float saldo;
	
	
	public ContaCorrente(float valorInicial) {
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
		System.out.println("Conta Corrente não tem essa função.");
	}
	
	public float getSaldo() {
		return this.saldo;
		
	}
	
	
	
}
