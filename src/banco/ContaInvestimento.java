package banco;

public class ContaInvestimento extends Conta {

	private float saldo;
	
	private int numConta;
	
	private String CPF;
	
	public ContaInvestimento(float valorInicial, int NumConta, String Cpf) {
		this.saldo = valorInicial;
		this.numConta = NumConta;
		this.CPF = Cpf;
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
		this.saldo = this.saldo * 1.05f ;
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