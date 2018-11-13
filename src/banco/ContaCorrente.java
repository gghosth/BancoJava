package banco;

public class ContaCorrente extends Conta {

	private float saldo;
	
	private int numConta;
	
	private  String CPF;
	
	private String tipoConta;
	
	public ContaCorrente(float valorInicial, int NumConta, String Cpf) {
		this.saldo = valorInicial;
		this.numConta = NumConta;
		this.CPF = Cpf;
		this.tipoConta = "corrente";
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
	
	public int getnumConta() {
		return this.numConta;
	}
	
	public String getCpf() {
		return this.CPF;
	}
	
	public String getTipo() {
		return this.tipoConta;
	}
	
	
}
