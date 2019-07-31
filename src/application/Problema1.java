package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/
public class Problema1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println(employee);
		
		System.out.println("Wich percentage to increase salary? ");
		double p = sc.nextDouble();
		employee.IncreaseSalary(p);
		
		System.out.println("Updated data: "+ employee);
		
		
		
		
		
		sc.close();
		

	}

}
