package exercicios_condi;

import java.util.Scanner;
/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*/
public class exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira 2 valores:");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 % n2 == 0) {
			System.out.println("São multiplos");
						
		}else {
			System.out.println("Não São multiplos");
		}
		
	}

}
