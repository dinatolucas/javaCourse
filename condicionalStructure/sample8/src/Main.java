import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.0*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		double salario = sc.nextDouble();
		
		double taxa = 0;
		
		if (salario <= 2000) {
			System.out.println("Você é isento de pagamento de impostos");
		} else if (salario <= 3000) {
            taxa = (salario - 2000) * 0.08;
            System.out.printf("Você deve pagar 8%% de imposto, ou seja, deverá pagar R$ %.2f", taxa);
        } else if (salario <= 4000) {
            taxa = 1000 * 0.08 + (salario - 3000) * 0.18;
            System.out.printf("Você deve pagar 18%% de imposto, ou seja, deverá pagar R$ %.2f", taxa);
        } else {
            taxa = 1000 * 0.08 + 1000 * 0.18 + (salario - 4000) * 0.28;
            System.out.printf("Você deve pagar 28%% de imposto, ou seja, deverá pagar R$ %.2f", taxa);
        }
		
		
		sc.close();
	}

}
