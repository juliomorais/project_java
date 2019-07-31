package entities;

public class Account {

	private int number;
	private String holder;
	private double value;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialValue) {
		this.number = number;
		this.holder = holder;
		addValue (initialValue);
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getValue() {
		return value;
	}
		
	public void addValue(double amount) {
		value += amount;
	}
	public void removeValue(double amount) {
		value -= amount + 5;
	}
	
	public String toString() {
		return "Account: "
				+number
				+ ", holder: " 
				+ holder 
				+ String.format(", Balance: $ %.2f ", value);
				
	}
	
}
