import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, numPeca1, numPeca2;
		double unitValue1, unitValue2, result;
		
		System.out.println("------------------------------------------");
		System.out.println("             TOTAL DE VENDAS");
		System.out.println("------------------------------------------");
		System.out.println("");
		
		System.out.print("Digite o código da primeira peça: ");
		codPeca1 = sc.nextInt();
		System.out.print("Digite a quantidade da primeira peça: ");
		numPeca1 = sc.nextInt();
		System.out.print("Digite o valor da primeira peça: ");
		unitValue1 = sc.nextDouble();
		System.out.println("");
		System.out.print("Digite o código da segunda peça: ");
		codPeca2 = sc.nextInt();
		System.out.print("Digite a quantidade da segunda peça: ");
		numPeca2 = sc.nextInt();
		System.out.print("Digite o valor da segunda peça: ");
		unitValue2 = sc.nextDouble();
		System.out.println("");
		
		result = numPeca1*unitValue1 + numPeca2*unitValue2;
		System.out.printf("O valor de sua compra é de R$ %.2f", result);
		
		sc.close();
	}

}
