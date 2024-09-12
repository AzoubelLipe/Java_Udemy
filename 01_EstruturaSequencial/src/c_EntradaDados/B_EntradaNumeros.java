package c_EntradaDados;

import java.util.Locale;
import java.util.Scanner;

public class B_EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		double y;
		
		System.out.printf("Digite um inteiro: ");
		x = sc.nextInt();
		System.out.printf("Digite um double: ");
		y = sc.nextDouble();
		
		
		System.out.println("\nVocê digitou: " + x + " e " + y);
		
		sc.close();
	}

}
