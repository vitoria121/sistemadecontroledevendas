package Repositorio;
import java.util.HashMap;
import Cadastros.Venda;


public class Vendas {
	
	HashMap<String, Venda> ListaVenda= new HashMap<String, Venda>();
	
	
	       public Venda adcionar(Venda Venda){
	        return ListaVenda.put(Venda.getNomeCliente(),Venda);
		   }
		   
		   
		   public boolean alterar(String key, Venda Oldvalor, Venda Newformadepagamento){
		        return ListaVenda.replace(key, Oldvalor, Newformadepagamento);
		    }

		   public Venda deletar(String key){
		        return ListaVenda.remove(key);
		    }
		   
		   
		   public HashMap listAll(){
		        return ListaVenda;
		    }

}
