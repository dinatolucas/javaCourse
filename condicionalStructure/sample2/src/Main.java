import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/
		
		Scanner sc = new Scanner(System.in);
		
		int num, result;
		
		System.out.print("Digite um valor inteiro: ");
		num = sc.nextInt();
		result = num%2;
		
		if(result == 0) {
			System.out.println("O valor é par!");
		} else {
			System.out.println("O valor é ímpar!");
		}
		

	}

}
