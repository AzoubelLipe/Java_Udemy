package c_Estoque;

import java.util.Locale;
import java.util.Scanner;

import a_entities.Product;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("\nNome: ");
		product.name = sc.nextLine();
		System.out.printf("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println("\nProduct data: " + product + "\n");
		
		System.out.print("Add products: ");
		int quantity = sc.nextInt();
		
		product.addProducts(quantity);
		
		System.out.print("Remove products: ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		
		System.out.println("\nUpdated product: " + product);
		
		sc.close();
	}

}
