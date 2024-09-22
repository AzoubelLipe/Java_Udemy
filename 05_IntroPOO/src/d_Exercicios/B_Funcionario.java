package d_Exercicios;

import a_entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class B_Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("\nNome: ");
		func.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.printf("\nFuncionário: %s\n", func);
		
		System.out.print("\nPorcentagem de aumento: ");
		double porcentagem = sc.nextDouble();
		func.aumentaSalario(porcentagem);
		
		System.out.printf("\nDados atualizados: %s\n", func);
		
		
		sc.close();
	}

}
