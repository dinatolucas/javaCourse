import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do produto: ");
		int cod = sc.nextInt();
		System.out.print("Digite a quantidade do produto: ");
		int qntdd = sc.nextInt();
		
		double result = 0;
		
		switch (cod) {
		case 1:
			result = qntdd*4;
			System.out.printf("Você comprou %d Cachorro-quente(s) e deverá pagar R$ %.2f!", qntdd, result);
			break;
		case 2:
			result = qntdd*4.5;
			System.out.printf("Você comprou %d X-Salada(s) e deverá pagar R$ %.2f!", qntdd, result);
			break;
		case 3:
			result = qntdd*5;
			System.out.printf("Você comprou %d X-Bacon(s) e deverá pagar R$ %.2f!", qntdd, result);
			break;
		case 4:
			result = qntdd*2;
			System.out.printf("Você comprou %d Torrada Simples e deverá pagar R$ %.2f!", qntdd, result);
			break;
		case 5:
			result = qntdd*1.5;
			System.out.printf("Você comprou %d Refrigerante(s) e deverá pagar R$ %.2f!", qntdd, result);
			break;
		default:
			System.out.printf("Temos apenas 5 produtos cadastrados!");
			break;
		}
	
		
		sc.close();
	}

}
