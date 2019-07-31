package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ExercicoBanco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double initialValue = 0;
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Is there an initial deposit? y/n ");
		char q = sc.next().charAt(0);
		
		if(q == 'y') {
			System.out.println("enter initial deposit value: ");
			initialValue = sc.nextDouble();
		}
		Account account = new Account(number, holder, initialValue);
		
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();

		System.out.println("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.addValue(value);
		System.out.println("updated account data:" + account);
		System.out.println();

		System.out.println("enter a withdraw value: ");
		value = sc.nextDouble();
		account.removeValue(value);
		System.out.println("updated account data: " + account);
		
	}

}
