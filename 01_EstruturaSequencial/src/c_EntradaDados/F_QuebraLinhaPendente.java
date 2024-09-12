package c_EntradaDados;

import java.util.Scanner;

public class F_QuebraLinhaPendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		
		System.out.printf("Digite um inteiro: ");
		x = sc.nextInt();
		
		/* nextInt e nextDouble leem apenas o valor numérico e
		 * não consomem a quebra de linha, que fica no buffer.
		 * isso causa um erro quando estamos alternando entre a
		 * leitura de tipos primitivos e leitura de strings 
		 * completas. Podemos simplesmente colocar um sc.nextLine()
		 * para consumir a quebra de linha e evitar erros.
		 * Ver artigo no Notion.
		 *  
		 */
		
		sc.nextLine(); // Para evitar o erro
		
		System.out.printf("Digite uma frase: ");
		s1 = sc.nextLine();
		System.out.printf("Digite uma frase: ");
		s2 = sc.nextLine();
		System.out.printf("Digite uma frase: ");
		s3 = sc.nextLine();
		
		System.out.println("\nDados digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
