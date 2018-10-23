package banco;

public class Correntista {

	
	
	private String nome;
	
	private static String Cpf;
	
	
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
	
	
	public static String getCpf() {
		
		return Correntista.Cpf;
	}
	
}
