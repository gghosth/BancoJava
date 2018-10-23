package banco;

public class ContaPoupanca extends Conta {

	private float saldo;
	
	private int numConta;
	
	private  String CPF;
	
	public ContaPoupanca(float valorInicial, int NumConta, String Cpf) {
		this.saldo = valorInicial;
		this.numConta = NumConta;
		this.CPF = Cpf;
	}
	
	@Override
	public void depositar(float valor) {
		this.saldo = this.saldo + (valor * 1.01f);
		
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
	
	public int getnumConta() {
		return this.numConta;
	}
	
	public String getCpf() {
		return this.CPF;
	}
	
	
}