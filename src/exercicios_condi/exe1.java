package exercicios_condi;

import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.


public class exe1 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira um numero:");
		int n1 = sc.nextInt();
		
		if (n1 >0 ) {
		System.out.println("N�o negativo");
		}
		else{
			System.out.println("negativo");
		}
		
		sc.close();
	}

}
