
public class E_Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println(soma(1, 2));
		System.out.println(multiplicar(3, 5));
		exibirMensagem();
		saudacao("João");
		
	}
	
	// Função Simples
		public static int soma(int a, int b) {
			return a + b;
		}
		
		// Função com Retorno	
		public static double multiplicar(double x, double y) {
			return x * y;
		}
		
		// Função sem Retorno
		public static void exibirMensagem() {
			System.out.println("Bem-vindo!");
		}
		
		// Função com parâmetros
		public static void saudacao(String nome) {
			System.out.println("Olá, " + nome);
		}
		
		// Sobrecarga de funções
		public static double soma(double a, double b) {
			return a + b;
		}

}
