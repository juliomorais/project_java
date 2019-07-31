package exercicios_condi;

import java.util.Scanner;

public class asdasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();
		String day;

		switch (id) {
		case 1:
			day = "monday";
			break;
		case 2:
			day = "tuesday";
			break;
		case 3:
			day = "wednesday";
			break;
		case 4:
			day = "thursday";
			break;
		case 5:
			day = "friday";
			break;
		case 6:
			day = "saturday";
			break;
		case 7:
			day = "sunday";
			break;
		default:
			day = "invalid value";

		}
		System.out.println("Day: " + day);
		sc.close();
	}

}
