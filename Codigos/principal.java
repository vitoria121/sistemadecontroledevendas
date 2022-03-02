import java.util.Scanner;
import java.util.HashMap;
import CadastroCliente.cliente;
import CadastroFornecedor.fornecedor;

public class principal {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner (System.in);
		HashMap<String, cliente> clientes = new HashMap<String, cliente>();
		HashMap<String, fornecedor> fornecedores = new HashMap<String, fornecedor>();
		HashMap<String, vendas> Venda= new HashMap<String, vendas>();
		HashMap<String, mercadoria> mercadoria= new HashMap<String, mercadoria>();
		int numero;
		
		System.out.println ("Olá, seja bem-vindo(a) ao programa controle de vendas!");
		System.out.println ("Escolha uma opção: ");
		System.out.println ("[1] Cadastrar novo cliente.");
		System.out.println ("[2] Alterar cliente.");
		System.out.println ("[3] Cadastrar Fornecedor.");
		System.out.println ("[4] Alterar Fornecedor");
		System.out.println ("[5] Deletar Fornecedor");
		System.out.println ("[6] Cadastrar Mercadoria");
		System.out.println ("[7] Deletar Mercadoria");
		System.out.println ("[8] Alterar Mercadoria");
		System.out.println ("[9] Criar venda");
		System.out.println ("[10] Alterar Venda");
		System.out.println ("[11] Deletar venda");
		System.out.println ("[12] visualizar clientes, fornecedores, mercadorias e vendas");
		System.out.println ("[13] Encerrar");
		numero = entrada.nextInt();
		   
		switch (numero) {
		      case 1:
		    	  cliente NovoCliente = new cliente ();
		    	  System.out.println ("Digite o nome do cliente:");
		  		  NovoCliente.setNome(entrada.next());
		  		  System.out.println ("Digite o CPF do cliente:");
		  		  NovoCliente.setCPF(entrada.next());
		  		  System.out.println ("Digite o Endereço do cliente:");
		  		  NovoCliente.setEndereco(entrada.next());
		  		  System.out.println ("cliente cadastrado com sucesso!");
		  		  clientes.put( NovoCliente.getCPF(), NovoCliente);
		  		  break;
		  		  
		      case 2:
		    	  System.out.println ("Faça a alteração nos dados do cliente.");
		    	  cliente.Alteração();
		    	  System.out.println ("A alteração nos dados do cliente concluida");
		    	  break;
		    
		      case 3:
		    	  fornecedor Novofornecedor = new fornecedor ();
		    	  System.out.println ("Digite o nome do fornecedor:");
		  		  Novofornecedor.setNome(entrada.next());
		  		  System.out.println ("Digite o CPF do fornecedor:");
		  	      Novofornecedor.setCpf(entrada.nextInt());
		  	      System.out.println ("Digite o telefone do fornecedor:");
		  	      Novofornecedor.setTelefone(entrada.nextInt());
		  	      System.out.println ("Fornecedor cadastrado com sucesso!");
		  	      fornecedores.put( Novofornecedor.getNome(), Novofornecedor);
		  	      break;
				
		  	Case 4: 
				System.out.println ("Faça a alteração nos dados do fornecedor.");
				fornecedor.Alteração();
				System.out.println ("Alteração nos dados do fornecedor concluída");
		  		break;
				
				
				
			case 6:
		  	          mercadoria Novamercadoria = new mercadoria ();
		    	          System.out.println ("Digite o nome da mercadoria:");
		    	          Novamercadoria.setNome(entrada.next()); 
		  		  System.out.println ("Digite o preço da mercadoria: ");
		  		  Novamercadoria.setPreco( entrada.nextFloat()); 
		  		  System.out.println ("Digite a quantidade da mercadoria: ");
		  		  Novamercadoria.setQuantidade(entrada.nextInt());
		  		  System.out.println ("Mercadoria Cadastrada com sucesso!" );
		  		  mercadoria.put( Novamercadoria.getNome(), Novamercadoria);
		  		  break;
		  		  
		  	      
		  	      
		  	      case 9:
		  	          vendas Novavenda = new vendas ();
		    	          System.out.println ("Digite o nome do cliente que realizou a compra:");
		    	          Novavenda.setNomedocomprador(entrada.next());
		  		  System.out.println ("Digite a data que a venda foi realizada: ");
		  		  Novavenda.setDatadavenda(entrada.next()); 
		  		  System.out.println ("Digite a mercadoria que foi vendida: ");
		  		  Novavenda.setMercadoriavendida(entrada.next());
		  		  System.out.println ("Digite o valor da venda:" );
		  		  Novavenda.setValorvenda(entrada.nextDouble());
		  		  System.out.println ("venda Cadastrada com sucesso!" );
		  		  Venda.put( Novavenda.getNomedocomprador(), Novavenda);
		  		  break; 
		}
		
		  		  
		  		  
		} while (numero != 13);
		System.out.println ("Encerrando o programa!" );
		System.out.println ("Muito obrigado, até a próxima!" );
		    	  
		    	 
		    	  
		    	  
		  			
		  		
		   }      
		

	}


