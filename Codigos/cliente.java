package CadastroCliente;

import java.util.Scanner;
import java.util.Set;

// CODIGOS INVALIDOS (NÃO RODAR)
// Codigos  atualizados 10/02 //

public class cliente {
	// CRIANDO OS PRINCIPAIS ATRIBUTOS DO CLIENTE//
	
	
	private static String nome;
	private static String CPF;
	private static String endereco;
	
	
	
	public static String getNome() {
		return nome;
	
		
	}
	public void setNome(String string) {
		this.nome = string;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public static void Alteração () {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println ("Digite o nome do cliente que deseja fazer a modificação:");
		String nome1 = entrada.next();
	    nome1.equals(cliente.getNome());
		System.out.println ("O que deseja modificar?");
		System.out.println ("[1] Nome");
		System.out.println ("[2] endereço");
		System.out.println ("[3] CPF"); 
		System.out.println ("[4] sair do sistema");
		int numero = entrada.nextInt();
		
		    if (numero == 1) {
		    	System.out.println (" digite o nome modificado");
		    	nome = entrada.next();
		    	System.out.println (" Nome modificado com sucesso!");
		    }
		    	
		
		    if  (numero == 2) {
		    	System.out.println (" digite o endereço modificado");
		    	endereco = entrada.next();
		    	System.out.println (" Endereço modificado com sucesso!");
			
		} 
		    if  (numero == 3) {
		    	System.out.println (" digite o CPF modificado");
		    	CPF = entrada.next();
		    	System.out.println (" CPF modificado com sucesso!");
		    }
		    
		    else if (numero == 4) {
		    	System.out.println ("Saindo do sistema.... bye!");
		    }
		
	}
}


	

