package Repositorio;
import java.util.HashMap;
import Cadastros.Mercadoria;

public class Mercadorias {

	
	HashMap<String, Mercadoria> listamercadoria= new HashMap<String, Mercadoria>();
	
	       public Mercadoria adcionar(Mercadoria Mercadoria){
	        return listamercadoria.put(Mercadoria.getNome(),Mercadoria);
		   }
		   
		   
		   public boolean alterar(String key, Mercadoria Oldpre�o, Mercadoria Newquantidade){
		        return listamercadoria.replace(key, Oldpre�o, Newquantidade);
		    }

		   public Mercadoria deletar(String key){
		        return listamercadoria.remove(key);
		    }
		   
		   
		   public HashMap listAll(){
		        return listamercadoria;
		    }
}
