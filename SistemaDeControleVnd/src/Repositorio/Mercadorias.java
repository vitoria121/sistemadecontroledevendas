package Repositorio;
import java.util.HashMap;
import Cadastros.Mercadoria;

public class Mercadorias {

	
	HashMap<String, Mercadoria> listamercadoria= new HashMap<String, Mercadoria>();
	
	       public Mercadoria adcionar(Mercadoria Mercadoria){
	        return listamercadoria.put(Mercadoria.getNome(),Mercadoria);
		   }
		   
		   
		   public boolean alterar(String key, Mercadoria Oldpreço, Mercadoria Newquantidade){
		        return listamercadoria.replace(key, Oldpreço, Newquantidade);
		    }

		   public Mercadoria deletar(String key){
		        return listamercadoria.remove(key);
		    }
		   
		   
		   public HashMap listAll(){
		        return listamercadoria;
		    }
}
