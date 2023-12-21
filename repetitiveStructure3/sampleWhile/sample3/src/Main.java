import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------");
        System.out.println("  COMBUSTÍVEL PREFERENCIAL");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("Escolha uma opção:");
        System.out.println("");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. FIM");

        int choose = sc.nextInt();

        int clientesAlcool = 0;
        int clientesGasolina = 0;
        int clientesDiesel = 0;

        while (choose != 4) {
            switch (choose) {
                case 1:
                    clientesAlcool++;
                    System.out.println("Você escolheu Álcool como seu combustível favorito!");
                    break;
                case 2:
                    clientesGasolina++;
                    System.out.println("Você escolheu Gasolina como seu combustível favorito!");
                    break;
                case 3:
                    clientesDiesel++;
                    System.out.println("Você escolheu Diesel como seu combustível favorito!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Escolha uma opção:");
            choose = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Quantidade de clientes que escolheram Álcool: " + clientesAlcool);
        System.out.println("Quantidade de clientes que escolheram Gasolina: " + clientesGasolina);
        System.out.println("Quantidade de clientes que escolheram Diesel: " + clientesDiesel);

        sc.close();
    }
}
