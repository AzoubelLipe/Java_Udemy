package c_EntradaDados;

import java.util.Scanner;

public class C_EntradaChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char x;
		
		System.out.printf("Digite um caracter: ");
		x = sc.next().charAt(0);
		
		System.out.println("\nVocê digitou: " + x);
		
		sc.close();
	}

}
