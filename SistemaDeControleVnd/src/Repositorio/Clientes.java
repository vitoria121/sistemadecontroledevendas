package Repositorio;
import java.util.HashMap;
import Cadastros.Cliente;


public class Clientes {
	
	HashMap<String, Cliente> listaclientes = new HashMap<String, Cliente>();
	
	
	   public Cliente adcionar(Cliente cliente){
        return listaclientes.put(cliente.getCPF(),cliente);
	   }
	   
	   
	   public boolean alterar(String key, Cliente Oldnome, Cliente NewEndereco){
	        return listaclientes.replace(key, Oldnome, NewEndereco);
	    }

	  
	   public Cliente deletar(String key){
	        return listaclientes.remove(key);
	    }
	   
	
	       public void listartodos () {
	       for(HashMap.Entry<String, Cliente> entrada : listaclientes.entrySet()){ 
		    String dados = entrada.getKey(); 
		    System.out.println(entrada.getValue().getNome()); }
		    
	       }
	  
	       public void listarone (String key) {
		       for(HashMap.Entry<String, Cliente> entrada : listaclientes.entrySet()){ 
			    String dados = entrada.getKey(); 
			    System.out.println(entrada.getValue().getNome());
		       }
		  

	   
	   
	       }


	      
	  
}








				
		   
		
		   

	    

