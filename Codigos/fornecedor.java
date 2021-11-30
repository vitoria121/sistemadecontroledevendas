public class fornecedor {

	
	    private static String nome;
	    private static int telefone;
	    private static int cpf;
		public static String getNome() {
			return nome;
		}
		public static void setNome(String nome) {
			fornecedor.nome = nome;
		}
		public static int getTelefone() {
			return telefone;
		}
		public static void setTelefone(int telefone) {
			fornecedor.telefone = telefone;
		}
		public static int getCpf() {
			return cpf;
		}
		public static void setCpf(int cpf) {
			fornecedor.cpf = cpf;
		}
	        public void DeletarFornecedor(fornecedor fornecedor) {
			System.out.println("Deletando fornecedor...");
		}
	
}
