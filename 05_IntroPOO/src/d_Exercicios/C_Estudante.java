package d_Exercicios;

import java.util.Locale;
import java.util.Scanner;

import a_entities.Estudante;

public class C_Estudante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.print("\nNome: ");
		estudante.nome = sc.nextLine();
		System.out.print("Nota 1: ");
		estudante.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		estudante.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		estudante.nota3 = sc.nextDouble();
		
		System.out.printf("\nNOTA FINAL: %.2f\n", estudante.notaFinal());
		
		if(estudante.notaFinal() < 60.0) {
			System.out.printf("\nReprovado. Pontos faltando: %.2f", estudante.pontosFaltando());			
		}
		else {
			System.out.println("\nAprovado.\n");
		}
		
		sc.close();
	}

}
