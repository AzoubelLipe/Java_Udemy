package e_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class F_AreasDiversas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo;
		
		System.out.printf("\nDigite o valor de A: ");
		A = sc.nextDouble();
		System.out.printf("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.printf("Digite o valor de C: ");
		C = sc.nextDouble();
		
		aTriangulo = A * C / 2.0;
		aCirculo = Math.PI * Math.pow(C, 2);
		aTrapezio = (A + B) / 2.0 * C;
		aQuadrado = B * B;
		aRetangulo = A * B;
		
		System.out.printf("\n\nTriângulo: %.3f", aTriangulo);
		System.out.printf("\nCírculo: %.3f", aCirculo);
		System.out.printf("\nTrapézio: %.3f", aTrapezio);
		System.out.printf("\nQuadrado: %.3f", aQuadrado);
		System.out.printf("\nRetângulo: %.3f", aRetangulo);
		
		
		sc.close();

	}

}
