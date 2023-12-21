import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número que quer fatorar: ");
        int fatorar = sc.nextInt();
        int resultado = 1;

        for (int i = 1; i <= fatorar; i++) {
            resultado *= i;
        }

        System.out.println("O fatorial de " + fatorar + " é: " + resultado);

        sc.close();

	}

}
