package banco;

public class ContaPoupanca extends Conta {

	private float saldo;
	
	
	public ContaPoupanca(float valorInicial) {
		this.saldo = valorInicial;
		
	}
	
	@Override
	public void depositar(float valor) {
		this.saldo = this.saldo + (valor * 1.1f);
		
	}
	
	@Override
	public void retirar(float valor) {
		this.saldo = this.saldo - valor;
	}
	
	@Override
	public void render() {
		System.out.println("Conta Poupança não tem essa função.");
	}
	
	public float getSaldo() {
		return this.saldo;
		
	}
	
	
}