package course_java;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVect;

public class Vect2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ProductVect[] vect = new ProductVect[n];
		
		for (int i =0; i<vect.length ; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVect(name, price);
			
		}
		
	double sum = 0.0;
	for (int i = 0; i<n; i++) {
		sum += vect[i].getPrice();
	}
	double avg = sum/n;
	System.out.printf("Avarage: %.2f%n ", avg);
	
	
	}
}
