package e_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class E_PrecosProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2, total;
		
		System.out.printf("\nDigite, nesta ordem, código - quantidade - preco: ");
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		System.out.printf("Digite, nesta ordem, código - quantidade - preco: ");
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = preco1 * qtd1 + preco2 * qtd2;
		
		System.out.printf("\nProduto 1: Cód - %d, Qtd - %d, Preço: R$ %.2f", cod1, qtd1, preco1);
		System.out.printf("\nProduto 2: Cód - %d, Qtd - %d, Preço: R$ %.2f", cod2, qtd2, preco2);
		System.out.printf("\n\nValor a pagar: R$ %.2f", total);
		
		sc.close();

	}

}
