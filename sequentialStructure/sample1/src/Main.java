import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/** Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.**/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.out.println(" CALCULADORA DE SOMA DE 2 VALORES");
		System.out.println("----------------------------------");
		
		System.out.print("Digite o primeiro valor da soma: ");
		int valor1 = sc.nextInt();
		System.out.print("Digite o segundo valor da soma: ");
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		System.out.println("A soma dos valores é igual a " + soma + "!");
	

	}

}
