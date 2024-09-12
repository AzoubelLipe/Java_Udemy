package e_Exercicios;

import java.util.Scanner;

public class C_DiferencaProds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.printf("\nDigite 4 valores inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("Diferença: " + diferenca);
		
		sc.close();

	}

}
