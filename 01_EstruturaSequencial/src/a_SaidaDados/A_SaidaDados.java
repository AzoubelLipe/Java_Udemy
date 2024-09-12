package a_SaidaDados;
import java.util.Locale;

public class A_SaidaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nOlá mundo!");
		
		int numInteiro = 10;
		double numFloat = 10.35784;
		
		System.out.println(numInteiro);
		System.out.printf("%.2f", numFloat);
		
		// Para mudar de vírgula para ponto nos flutuantes
		Locale.setDefault(Locale.US);
		
		System.out.printf("\n%.2f\n", numFloat);
		
		// Concatenação
		double totalMetros = 20.23312;
		System.out.println("Distância: " + totalMetros + " metros");
		System.out.printf("Distância: %.2f metros\n", totalMetros);
		
		String nome = "Maria";
		int idade = 30;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade, renda);
		
		
		
		
	}

}
