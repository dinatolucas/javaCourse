import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora que você começou a jogar: ");
		int hora1 = sc.nextInt();
		System.out.print("Digite a hora que você terminou de jogar: ");
		int hora2 = sc.nextInt();
		
		int duracao;
		if (hora1 < hora2) {
			duracao = hora2 - hora1;
		}
		else {
			duracao = 24 - hora1 + hora2;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
