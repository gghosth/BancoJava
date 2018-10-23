package banco;
public abstract class Conta {
	
	private float saldo;
	
	private int numConta;
	
	private String CPF;
	
	protected void setSaldo(float valor) {
		this.saldo = valor;
	}
	
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public int getnumConta() {
		return this.numConta;
	}
	
	public String getCpf() {
		return this.CPF;
	}
	
	
	public abstract void depositar(float valor);
	
	public abstract void retirar(float valor);
	
	public abstract void render();

	public void transferirPara(Conta outraConta, float valor) {
		this.retirar(valor);
		outraConta.depositar(valor);
	}
	
}