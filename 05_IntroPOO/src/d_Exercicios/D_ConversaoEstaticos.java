package d_Exercicios;

import java.util.Locale;
import java.util.Scanner;

import a_entities.Conversao;

public class D_ConversaoEstaticos {
    public static void main(String[] args) {
        
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Preço do dolar: ");
    	double precoDolar = sc.nextDouble();
    	System.out.print("Quantos dólares serão comprados: ");
    	double quantidade = sc.nextDouble();
    	
    	double resultado = Conversao.dolarParaReal(quantidade, precoDolar);
    	
    	System.out.printf("\nValor em reais: R$ %.2f\n\n", resultado);
    	
    	
    	sc.close();
    	
    }
}
