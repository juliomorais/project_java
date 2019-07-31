package course_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class ExeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee2> list = new ArrayList();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			
			System.out.println("Employee # "+i);
			System.out.println("ID: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee2(id, name, salary));
			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("Id does not exists!");
		}
		else {
			System.out.println("Enter de percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			}
		System.out.println("list of employees: ");
		for (Employee2 obj : list){
			System.out.println(obj);
		}
		
	sc.close();
	}

}
