package Principal;
import java.util.HashMap;
import java.util.Scanner;

import Cadastros.Cliente;
import Cadastros.Fornecedor;
import Cadastros.Venda;
import Cadastros.Mercadoria;

import Repositorio.Clientes;
import Repositorio.Fornecedores;
import Repositorio.Mercadorias;
import Repositorio.Vendas;

public class Principal {

	private static boolean alterar;

	public static void main(String[] args) {
		
		 int numero;
		 Scanner entrada = new Scanner (System.in);

		 do {
	        System.out.println ("Olá, seja bem-vindo(a) ao programa controle de vendas!");
	        System.out.println ("Escolha uma opção: ");
	        System.out.println ("[1] Cadastrar novo cliente.");
	        System.out.println ("[2] Alterar cliente.");
	        System.out.println ("[3] Cadastrar Fornecedor.");
	        System.out.println ("[4] Alterar Fornecedor");
	        System.out.println ("[5] Deletar Fornecedor");
	        System.out.println ("[6] Cadastrar Mercadoria");
	        System.out.println ("[7] Alterar Mercadoria");
	        System.out.println ("[8] Deletar Mercadoria");
	        System.out.println ("[9] Criar venda");
	        System.out.println ("[10] Alterar Venda");
	        System.out.println ("[11] Deletar venda");
	        System.out.println ("[12] visualizar clientes, fornecedores, mercadorias e vendas");
	        System.out.println ("[13] Encerrar");
	        numero = entrada.nextInt();
		
	        switch (numero) {
            
	        case 1:
            	  Cliente NovoCliente = new Cliente ( );
		    	  System.out.println ("Digite o nome do cliente:");
		  		  NovoCliente.setNome(entrada.next());
		  		  System.out.println ("Digite o CPF do cliente:");
		  		  NovoCliente.setCPF(entrada.next());
		  		  System.out.println ("Digite o Endereço do cliente:");
		  		  NovoCliente.setEndereco(entrada.next());
		  		  System.out.println ("cliente cadastrado com sucesso!");
		  		  Clientes repClientes = new Clientes();
		  		  repClientes.adcionar(NovoCliente);
		  		  break;
		  		  
	        case 2:
	        	 Cliente NovoCliente1 = new Cliente ( );
	        	 Clientes repClientes1 = new Clientes();
	        	 System.out.println ("Digite o CPF do cliente que deseja realizar alteração dos dados:");
	        	 String Cpf = entrada.next();
	        	 repClientes1.alterar(Cpf, NovoCliente1, NovoCliente1);
	        	 System.out.println ("Altere o nome do cliente: ");
	        	 NovoCliente1.setNome(entrada.next());
	        	 System.out.println ("Altere o endereço do cliente: ");
	        	 NovoCliente1.setEndereco(entrada.next());
	        	 System.out.println ("Altere o cpf do cliente: ");
	        	 NovoCliente1.setCPF(entrada.next());
	        	 repClientes1.deletar(Cpf);
	        	 repClientes1.adcionar(NovoCliente1);
	        	 break;
	        	 
	        	
	        case 3:
	        	  Fornecedor NovoFornecedor = new Fornecedor ( );
		    	  System.out.println ("Digite o nome do Fornecedor:");
		    	  NovoFornecedor.setNome(entrada.next());
		  		  System.out.println ("Digite o CPF do Fornecedor:");
		  		  NovoFornecedor.setCpf(entrada.next());
		  		  System.out.println ("Digite o telefone do fornecedor:");
		  		  NovoFornecedor.setTelefone(entrada.next());
		  		  System.out.println ("fornecedor cadastrado com sucesso!");
		  		  Fornecedores repFornecedor = new Fornecedores();
		  		  repFornecedor.adcionar(NovoFornecedor);
		  		  break;
		  		  
	        case 4:
	        	 Fornecedor NovoFornecedor1 = new Fornecedor ( );
		  		 Fornecedores repFornecedor1 = new Fornecedores();
	        	 System.out.println ("Digite o CPF do Fornecedor que deseja realizar alteração dos dados:");
	        	 String Cpf1 = entrada.next();
	        	 repFornecedor1.alterar(Cpf1, NovoFornecedor1, NovoFornecedor1);
	        	 System.out.println ("Altere o nome do fornecedor: ");
	        	 NovoFornecedor1.setNome(entrada.next());
	        	 System.out.println ("Altere o telefone do fornecedor: ");
	        	 NovoFornecedor1.setTelefone(entrada.next());
	        	 System.out.println ("Altere o cpf do fornecedor: ");
	        	 NovoFornecedor1.setCpf(entrada.next());
	        	 repFornecedor1.deletar(Cpf1);
	        	 repFornecedor1.adcionar(NovoFornecedor1);
	        	 break;
	        	 
	        case 5:
	        	System.out.println ("Digite o CPF do Fornecedor que deseja deletar os dados:");
	        	Cpf1 = entrada.next();
		  		Fornecedores repFornecedor2 = new Fornecedores();
		  		repFornecedor2.deletar(Cpf1);
		  		break;
		  		
	        case 6:
	        	  Mercadoria NovaMercadoria = new Mercadoria ( );
		    	  System.out.println ("Digite o nome da mercadoria:");
		    	  NovaMercadoria.setNome(entrada.next());
		  		  System.out.println ("Digite o preço da mercdoria:");
		  		  NovaMercadoria.setPreco(entrada.nextFloat());
		  		  System.out.println ("Digite a quantidade de mercadoria:");
		  		  NovaMercadoria.setQuantidade(entrada.nextInt());
		  		  System.out.println ("mercadoria cadastrada com sucesso!");
		  		  Mercadorias repMercadorias = new Mercadorias();
		  		  repMercadorias.adcionar(NovaMercadoria);
		  		  break;
		  	
	        case 7:
	        	 Mercadoria NovaMercadoria1 = new Mercadoria ( );
	        	 Mercadorias repMercadorias1 = new Mercadorias();
	        	 System.out.println ("Digite o nome da mercadoria que deseja realizar a alteração: ");
	        	 String nome = entrada.next();
	        	 repMercadorias1.alterar(nome, NovaMercadoria1, NovaMercadoria1);
	        	 System.out.println ("Altere o nome da mercadoria: ");
	        	 NovaMercadoria1.setNome(entrada.next());
	        	 System.out.println ("Altere o preço da mercadoria: ");
	        	 NovaMercadoria1.setPreco(entrada.nextFloat());
	        	 System.out.println ("Altere a quantidade da mercadoria: ");
	        	 NovaMercadoria1.setQuantidade(entrada.nextInt());
	        	 repMercadorias1.deletar(nome);
	        	 repMercadorias1.adcionar(NovaMercadoria1);
	        	 break;
		  		
	        case 8:
	        	System.out.println ("Digite o nome da mercadoria que deseja deletar os dados:");
	        	nome = entrada.next();
	        	Mercadorias repMercadorias2 = new Mercadorias();
	        	repMercadorias2.deletar(nome);
		  		break;
	      
	        case 9:
          	      Venda NovaVenda = new Venda ( );
		    	  System.out.println ("Digite o nome do cliente que realizou a compra:");
		    	  NovaVenda.setNomeCliente(entrada.next());
		  		  System.out.println ("Digite o valor da venda:");
		  		  NovaVenda.setValor(entrada.next());
		  		  System.out.println ("Digite a forma de pagamento da venda:");
		  		  NovaVenda.setFormadepagamento(entrada.next());
		  		  System.out.println ("Venda cadastrada com sucesso!");
		  		  Vendas repVendas = new  Vendas();
		  		  repVendas.adcionar(NovaVenda);
		  		  break;
		  		  
	        case 10:
	        	 Venda NovaVenda1 = new Venda ( );
	        	 Vendas repVendas1 = new  Vendas();
	        	 System.out.println ("Digite o nome do cliente que realizou a compra para realizar alteração dos dados da venda:");
	        	 String venda = entrada.next();
	        	 repVendas1.alterar(venda, NovaVenda1, NovaVenda1);
	        	 System.out.println ("Altere o nome do cliente que realizou a compra: ");
	        	 NovaVenda1.setNomeCliente(entrada.next());
	        	 System.out.println ("Altere o valor da venda: ");
	        	 NovaVenda1.setValor(entrada.next());
	        	 System.out.println ("Altere a forma de pagamento dessa venda: ");
	        	 NovaVenda1.setFormadepagamento(entrada.next());
	        	 repVendas1.deletar(venda);
	        	 repVendas1.adcionar(NovaVenda1);
	        	 break;
	        
	        case 11:
	        	System.out.println ("Digite o nome do cliente que realizou a comrpa para deletar a venda:");
	        	venda = entrada.next();
	        	Vendas repVendas2 = new Vendas();
	        	repVendas2.deletar(venda);
		  		break;
	        	 
	        case 12:
	        	System.out.println ("Mostrando todos os clientes, fornecedores, mercadorias e vendas: " );
	        	Clientes repClientes3 = new Clientes();
	        	repClientes3.listartodos();
	        	Fornecedores repFornecedor3 = new Fornecedores();
	        	repFornecedor3.listAll();
	        	Mercadorias repMercadorias3 = new Mercadorias();
	        	repMercadorias3.listAll();
	            Vendas repVendas3 = new  Vendas();
	            repVendas3.listAll();
 
		  		  
	        }
			
	  		  
	  		  
			} while (numero != 13);
			System.out.println ("Encerrando o programa!" );
			System.out.println ("bye!" );
		

	}

}
