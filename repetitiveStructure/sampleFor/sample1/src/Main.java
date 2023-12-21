import java.util.Scanner;

public class Main {
	
	/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
	X, se for o caso.*/

    public static void main(String[] args) {
    	
    	
    	Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Digite um valor inteiro X (1 <= X <= 1000): ");
        x = sc.nextInt();

        while (x < 1 || x > 1000) {
            System.out.print("Valor inválido. Digite novamente (1 <= X <= 1000): ");
            x = sc.nextInt();
        }

        for (int i = 1; i <= x; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}