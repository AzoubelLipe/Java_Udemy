package d_Exercicios;

import java.util.Locale;
import java.util.Scanner;

import a_entities.Retangulo;

public class A_Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.print("\nDigite a altura: ");
		ret.altura = sc.nextDouble();
		System.out.print("Digite a largura: ");
		ret.largura = sc.nextDouble();
		
		System.out.printf("\nÁrea: %.2f", ret.area());
		System.out.printf("\nPerímetro: %.2f", ret.perimetro());
		System.out.printf("\nDiagonal: %.2f\n", ret.diagonal());
		
		sc.close();
	}

}
