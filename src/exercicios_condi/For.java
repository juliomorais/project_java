package exercicios_condi;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("insira o numero: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n;  i++) {
			
			if(i % 2 !=0 ) {
			System.out.println(i);
			
		}
	}
	}
}
