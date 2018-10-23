package banco;

import java.util.ArrayList;
import java.util.Collection;

public class Banco {

	public Banco(/*Collection<Conta> contas, Collection<Correntista> correntistas*/) {
		/*Banco.contas.addAll(contas);
		Banco.correntistas.addAll(correntistas);*/
	}
	
	public static Collection<Conta> contas = new ArrayList<Conta>();
	
	public static Collection<Correntista> correntistas = new ArrayList<Correntista>();
	
	
	public Conta buscarContaCpf(String cpf) {
		Conta resultado = null;
		for(Conta conta : Banco.contas) {
			if(conta.getCpf().equals(cpf)) {
				resultado = conta;
				break;
			}
		}
		
		return(resultado);
	}
	
	public Correntista buscarCorrentistaCpf(String cpf) {
		Correntista resultado = null;
		for(Correntista correntista : Banco.correntistas) {
			if(correntista.getCpf().equals(cpf)) {
				resultado = correntista;
				break;
			}
		}
		
		return(resultado);
	}
	
	
	
	public void adicionarConta(Conta conta) {
		Banco.contas.add(conta);
	}
	
	public void adicionarCorrentista(Correntista correntista) {
		Banco.correntistas.add(correntista);
	}
	
}
