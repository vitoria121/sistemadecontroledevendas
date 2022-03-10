package Repositorio;
import java.util.HashMap;
import Cadastros.Fornecedor;

public class Fornecedores {
	
	HashMap<String, Fornecedor> listafornecedores = new HashMap<String, Fornecedor>();
	
	     public Fornecedor adcionar(Fornecedor Fornecedor){
	        return listafornecedores.put(Fornecedor.getCpf(),Fornecedor);
		   }
		   
		   
		   public boolean alterar(String key, Fornecedor Oldnome, Fornecedor Newtelefone){
		        return listafornecedores.replace(key, Oldnome, Newtelefone);
		    }

		   public Fornecedor deletar(String key){
		        return listafornecedores.remove(key);
		    }
		   
		   
		   public HashMap listAll(){
		        return listafornecedores;
		    }
	
	
	
	

}
