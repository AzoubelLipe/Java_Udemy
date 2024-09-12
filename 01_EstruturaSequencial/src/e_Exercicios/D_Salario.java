package e_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class D_Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorHora, salario;
		
		System.out.printf("\nDigite o número do funcionário: ");
		numero = sc.nextInt();
		
		System.out.printf("Digite o número de horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.printf("Digite o valor da hora trabalhada: ");
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("\nNúmero: " + numero);
		System.out.printf("Salário: R$ %.2f\n", salario);
		
		sc.close();
	}

}
