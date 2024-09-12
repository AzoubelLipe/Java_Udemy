package c_EntradaDados;

import java.util.Scanner;

public class E_EntradaAteQuebraLinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		System.out.printf("Digite uma frase: ");
		s1 = sc.nextLine();
		System.out.printf("Digite uma frase: ");
		s2 = sc.nextLine();
		System.out.printf("Digite uma frase: ");
		s3 = sc.nextLine();
		
		System.out.println("\nDados digitados");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
