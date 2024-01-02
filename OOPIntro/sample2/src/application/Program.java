package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
        Employee x = new Employee();

        System.out.print("Name: ");
        x.Name = sc.nextLine();
        System.out.print("Gross salary: ");
        x.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        x.Tax = sc.nextDouble();

        System.out.println(x);

        System.out.print("Enter the percentage to increase salary: ");
        double percentageIncrease = sc.nextDouble();
        x.IncreaseSalary(percentageIncrease);

        System.out.println();
        System.out.print("Updated data: " + x);

        sc.close();

	}

}
