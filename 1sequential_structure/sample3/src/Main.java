import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("--------------------------------------");
		System.out.println("      DIFERENÇA ENTRE PRODUTOS");
		System.out.println("--------------------------------------");
		System.out.println("");
		
		System.out.print("Digite um valor inteiro A: ");
		A = sc.nextInt();
		System.out.print("Digite outro valor inteiro B: ");
		B = sc.nextInt();
		System.out.print("Digite mais um valor inteiro C: ");
		C = sc.nextInt();
		System.out.print("Digite um último valor inteiro D: ");
		D = sc.nextInt();
		
		diferenca = A*B - C*D;
		
		System.out.println("");
		System.out.println("A diferença entre os produtos AB e CD é " + diferenca);
		
		sc.close();
		
	}

}
