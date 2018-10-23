package banco;

public class Correntista {

	
	
	private String nome;
	
	private String Cpf;

	
	public Correntista(String Nome, String CPF) {

		this.nome = Nome;
		this.Cpf = CPF;
		
		
	}	
		
	public void setNome(String Nome){
		
		this.nome = Nome;
		
	}
	
	public void setCpf(String Numero){
		
		this.Cpf = Numero;
		
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	
	public String getCpf() {
		
		return this.Cpf;
	}
	
}
