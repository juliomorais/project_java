package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a product data: ");
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int n = sc.nextInt();
		Product product = new Product(name, price, n);

		product.setName("computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200);
		System.out.println("updated price: $" + product.getPrice());

		System.out.println("Product data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();

	}

}
