package exercicios_condi;

import java.util.Scanner;


/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

public class exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner sc = new Scanner (System.in);
			
			System.out.println("insira o tempo inicial:");
			int t1 = sc.nextInt();
			System.out.println("Insira o tempo final:");
			int t2 = sc.nextInt();

					int duracao;
			if (t1 < t2) {
				duracao = t1 - t2;

			}else {
				duracao = 25 - t1+t2;
			}
	System.out.println("O jogo durou " + duracao + " Horas");
	
	}

}
