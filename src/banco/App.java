package banco;

import java.util.Scanner;


public class App {
	
	static Criador criador = new Criador();
	
	static Controlador control = new Controlador();

	static Banco banco = criador.novoBanco();
	
	private static Scanner sc1;

	public static void main (String[] args) {
	
		
	while(true) {	
		
	System.out.println("Bem vindo ao programa do banco, o que deseja fazer? \n\n Digite 1 para criar conta, 2 para editar e 3 para sair: ");
	
	sc1 = new Scanner (System.in);
	
	int i = sc1.nextInt();
	
	switch(i) {
	
	case 1: 
	
		control.comeco(banco);		
		
	break;
	
			
	case 2:
	
		control.acoes(banco);
		
	break;	
		
		
	case 3:
	
	System.out.println("Obrigado por usar o programa!");
	break;
	
		}
		
	}
	
/*	System.out.println("Digite seu cpf para buscar na coleção:");
	sc1.nextLine();
	String cpfbusca = sc1.next();
	
	Conta conteste = banco.buscarContaCpf(cpfbusca);
		System.out.println(conteste.getnumConta());
		
	Correntista corrteste = banco.buscarCorrentistaCpf(cpfbusca);
		System.out.println(corrteste.getNome());
	*/
	}
	
}
