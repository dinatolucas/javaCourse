import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número de repetições: ");
		int x = sc.nextInt();
		System.out.println("---------------------------------------");
		System.out.println("");
		
		for(int i=0; i<x; i++) {
			System.out.print("Digite o valor a ser analisado: ");
			int guardar = sc.nextInt();
			if(guardar > 10 || guardar > 20) {
				System.out.printf("O valor "+guardar+" está fora do intervalo!%n%n");
			} else {
				System.out.printf("O valor "+guardar+" está dentro do interevalo!%n%n");
			}
		}
		
		System.out.println("---------------------------------------");
		System.out.println("O programa foi FINALIZADO!");
		
		
		sc.close();
	}

}
