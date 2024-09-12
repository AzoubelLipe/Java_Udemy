package e_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class B_AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi;
		pi = 3.14159;
		
		System.out.printf("\nDigite o raio: ");
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("\n\nÁrea: %.4f\n", area);
		
		sc.close();

	}

}
