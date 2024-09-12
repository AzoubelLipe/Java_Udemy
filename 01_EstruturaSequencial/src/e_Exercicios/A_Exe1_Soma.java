package e_Exercicios;

import java.util.Scanner;

public class A_Exe1_Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.printf("\nDigite dois números: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("\nSoma = " + soma);
		
		sc.close();

	}

}
