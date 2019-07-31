package course_java;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   
		   String sentence = sc.nextLine();
		   String x,y;
		   System.out.println(sentence);
		   x= sc.next();
		   y= sc.next();
		   
		   System.out.println(x);
		   System.out.println(y);
		   
		   
		// 35
		int n1 = sc.nextInt();
		// Bob Brown
		sc.nextLine();
		String name = sc.nextLine();
		// F
		char gender = sc.next().charAt(0);
		// b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		// 4.32
		double n2 = sc.nextDouble();
		// Maria F 23 1.68
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(heig);

	}

}
