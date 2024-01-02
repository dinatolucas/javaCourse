package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	//Criando as funções

	public double TotalValueInStock() {
		return quantity * price;
	};
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	};
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total $ "
				+ String.format("%.2f", TotalValueInStock());
	}
}