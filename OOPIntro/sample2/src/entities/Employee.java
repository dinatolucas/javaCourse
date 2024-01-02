package entities;

public class Employee {
	
	public String Name;
	public Double GrossSalary;
	public Double Tax;

	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * (percentage / 100.0);
	}
	
	public String toString() {
        return "Employee: " + Name + ", " +
               "$ " + String.format("%.2f", NetSalary()) + "\n";
	}
}