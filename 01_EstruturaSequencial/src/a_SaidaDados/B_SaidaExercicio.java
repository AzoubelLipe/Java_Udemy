package a_SaidaDados;
import java.util.Locale;

public class B_SaidaExercicio {
	public static void main(String[] args) {
	
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritório";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.0;
		double medida = 53.234567;
		
		System.out.println("\nProdutos:");
		System.out.printf("%s, preço de: R$ %.2f", produto1, preco1);
		System.out.printf("\n%s, preço de: R$ %.2f", produto2, preco2);
		
		System.out.printf("\n\nRegistro: %d anos de idade, código %d, gênero %s", idade, codigo, genero);
		
		System.out.printf("\n\nMedida com 8 valores decimais: %.8f", medida);
		System.out.printf("\nMedida com 3 valores decimais: %.3f", medida);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("\nMedida com ponto: %.3f", medida);
		
	}
}
