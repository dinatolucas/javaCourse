package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		
		Rectangle x = new Rectangle();				
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();		
		
		System.out.println(x);
						
		sc.close();	
		
	}

}
