package course_java;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros vc quer entrar: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1;i <= n ; i++) {
			System.out.println("Value number #"+ i +": ");
			int x = sc.nextInt();
			sum += x;
		}
	System.out.println("SUM: " + sum);
	}

}
