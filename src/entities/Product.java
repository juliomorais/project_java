package entities;

public class Product {

	private String name;
	private double price;
	private int n;

		
	//construtor
	
	public Product() {
		
	}
	public Product(String name, double price, int n) {
		this.name = name;
		this.price = price;
		this.n = n;
	}
	//metodos para encapsulamento do private
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getN() {
		return n;
	}
	
	//operações
	public double totalValueinStock() {
			return price * n;
		}

		public void addProducts (int n) {
			this.n += n;
		}
		
		public void removeProducts (int n) {
			this.n -= n ;
		}
		public String toString() {
			return name 
					+ ", $ "
					+ String.format("%.2f ", price)
					+", "
					+ n
					+"Units , Total: $" 
					+  String.format("%.2f ", totalValueinStock());
					
		}
}
