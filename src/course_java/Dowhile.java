package course_java;

import java.util.Locale;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char r;
		
		do {
			System.out.println("Enter a number: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Square root = %.3f%n", sq);
			
			System.out.println("Repeat? Y/N");
			r = sc.next().charAt(0);
		
		} While (r != 'n');
		sc.close();	
		}

}
