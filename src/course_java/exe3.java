package course_java;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite 3 números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b & a>c) {
			System.out.println(a);
		}
		else if (b>a & b>c){
			System.out.println(c);
		}
		else if (c>b & c>a) {
		System.out.println(c);
		}
		else if (a == b || a == c ) {
			System.out.println(a);
		}
		else if (b == c) {
			System.out.println(b);
		}
	

}
}
