package exercicios_condi;

import java.util.Scanner;

public class exe2 {
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
				int n1 = sc.nextInt();
		if(n1 % 2 == 0) {
			System.out.println("numero PAR!");
		}else {
		System.out.println("Numero Impar");
		}
			sc.close();
	}

}
