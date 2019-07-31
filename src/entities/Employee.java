package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax = 1000;
	
	public double NetSalary() {
		return grossSalary - tax;
		
	}
	public void IncreaseSalary(double p) {
		grossSalary += grossSalary * p / 100.0;
	}
	
	public String toString() {
		return name
				 +", $" + String.format("%.2f",NetSalary());
		
	}
}
