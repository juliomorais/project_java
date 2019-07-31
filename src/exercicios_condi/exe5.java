package exercicios_condi;

import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("informe o codigo e a quantidade: ");
		
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		double total = 0;				

		if (codigo == 1) {
	
			total = qtd * 4.0;
			
		}else if (codigo == 2) {
			
			total = qtd * 4.5;
		
		}else if (codigo == 3) {
			
			total = qtd * 5.0;
		
		}else if (codigo == 4) {
		
			total = qtd * 2.0;
		
		}else if (codigo == 5) {
		
			total = qtd * 1.5;
		}
		
		System.out.printf("o Total de R$ %.2f", total);
		
		sc.close();
	}

}
