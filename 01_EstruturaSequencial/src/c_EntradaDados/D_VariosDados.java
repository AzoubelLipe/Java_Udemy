package c_EntradaDados;

import java.util.Scanner;

public class D_VariosDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.printf("%s - %d - %.2f", x, y, z);
		
		sc.close();

	}

}
