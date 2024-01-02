package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.*/
		
		Scanner sc = new Scanner(System.in);
		
		//Assim como a classe acima, eu importei da mesma forma!		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
				
		//Tive que mencionar a entidade usando o atributo da classe com ponto e o nome dela
		System.out.print("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.print("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		System.out.printf("Triangle X area: %.4f%n", areaX);
		
		double areaY = y.area();
		System.out.printf("Triangle X area: %.4f%n", areaY);		
		
		if (areaX > areaY) {
			System.out.printf("Larger area X: %.4f", areaX);
		} else {
			System.out.printf("Larger area Y: %.4f", areaY);
		}
			
		sc.close();

	}

}
