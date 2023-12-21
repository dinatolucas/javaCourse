import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de repetições: ");
        int repetitions = sc.nextInt();

        for (int i = 0; i < repetitions; i++) {
        	System.out.print("");
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();

            if (num2 == 0) {
                System.out.println("Divisão impossível! Denominador igual a zero.");
            } else {
                double divisao = (double) num1 / num2;
                System.out.printf("A sua divisão resulta em: %.2f%n", divisao);
            }
        }

        sc.close();
		
	}

}
