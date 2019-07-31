package course_java;

import java.util.Locale;
import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int b = sc.nextInt();
		System.out.println("Enter a product price:");
		double p = sc.nextDouble();
		System.out.println("Enter your last name, age and height:");
		String ln = sc.next();
		int age = sc.nextInt();
		double h = sc.nextDouble();

		System.out.println(name);
		System.out.println(b);
		System.out.printf("%.2f%n", p);
		System.out.println(ln);
		System.out.println(age);
		System.out.printf("%.2f%n", h);

		sc.close();

	}

}
