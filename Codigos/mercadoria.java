//cadastro de mercadorias

public class mercadoria {

	    private static String nome;
	    private static float preco;
	    private static int quantidade;
		
	    public static String getNome() {
			return nome;
		}
		public static void setNome(String nome) {
			mercadoria.nome = nome;
		}
		public static float getPreco() {
			return preco;
		}
		public static void setPreco(float preco) {
			mercadoria.preco = preco;
		}
		public static int getQuantidade() {
			return quantidade;
		}
		public static void setQuantidade(int quantidade) {
			mercadoria.quantidade = quantidade;
		}
	    
//Alterar mercadoria

		public void AlterarMercadoria(mercadoria mercadoria) {
		    System.out.println("Alterar mercadoria");
		}
			    
		}

// Deletar mercadoria

		public void DeletarMercadoria(mercadoria mercadoria) {
		    System.out.println("Deletando mercadoria");
		}