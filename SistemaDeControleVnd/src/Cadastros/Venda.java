package Cadastros;

public class Venda {
	
	// CRIANDO OS PRINCIPAIS ATRIBUTOS DAS VENDAS//
	    
	    private String NomeCliente;
		private  String valor;
		private  String formadepagamento;
		
		
		public String getNomeCliente() {
			return NomeCliente;
		}
		public void setNomeCliente(String nomeCliente) {
			NomeCliente = nomeCliente;
		}
		
		public String getValor() {
			return valor;
		}
		public void setValor(String valor) {
			this.valor = valor;
		}
		public String getFormadepagamento() {
			return formadepagamento;
		}
		public void setFormadepagamento(String formadepagamento) {
			this.formadepagamento = formadepagamento;
		}
		
		
		

}
