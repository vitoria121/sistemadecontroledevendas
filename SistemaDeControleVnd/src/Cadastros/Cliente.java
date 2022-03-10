package Cadastros;

public class Cliente {
	
	    // CRIANDO OS PRINCIPAIS ATRIBUTOS DO CLIENTE//
	    private String nome;
	    private String CPF;
	    private String endereco;
	    

	    public String getNome() {
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


}
