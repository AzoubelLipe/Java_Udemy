package c_EntradaDados;

import java.util.Scanner;

public class A_EntradaBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		System.out.printf("Digite uma string: ");
		x = sc.next();
		
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}

}
