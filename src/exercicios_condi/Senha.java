package exercicios_condi;

import java.util.Scanner;

public class Senha {

	/*
	 * Escreva um programa que repita a leitura de uma senha até que ela seja
	 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
	 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
	 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
	 * correta é o valor 2002
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int pass = sc.nextInt();

		while (pass != 2002) {
			System.out.println("Senha Invalida, digite novamente!");
			pass = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		sc.close();
	}

}
