import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a coordenada x: ");
		float x = sc.nextFloat();
		System.out.print("Digite a coordenada y: ");
		float y = sc.nextFloat();
		
		if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println((x > 0) ? ((y > 0) ? "Q1" : "Q4") : ((y > 0) ? "Q2" : "Q3"));
        }

		
		sc.close();
	}

}