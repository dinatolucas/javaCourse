import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("---------------------------------------------");
		System.out.println("  CALCULADORA DE ÁREA DE UMA CIRCUNFERÊNCIA");
		System.out.println("---------------------------------------------");
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A área para o raio de %.2f cm é de %.2f cm2!%n", raio, area);
		

		sc.close();
	}

}
