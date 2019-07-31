package course_java;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira um numero: ");
		
		double n1 = sc.nextDouble();
		
		while (n1 > 0.0) {
			double sr = Math.sqrt(n1);
			System.out.printf("%.3f%n", sr);
			System.out.println("entre com outro numero: ");
			n1 = sc.nextDouble();
		}
		System.out.println("Negative number!");
		sc.close();

	}

}
