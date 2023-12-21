import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um valor inteiro: ");
		num = sc.nextInt();
		
		if (num>0) {
			System.out.println("O valor é Positivo!");
		} else if (num==0) {
			System.out.println("O valor é Zero!");
		} else {
			System.out.println("O valor é Negativo!");
		}
		
		sc.close();
	}

}
