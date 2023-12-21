import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double value1, value2, value3, areaTri, areaCir, areaTra, areaQua, areaRet;
		
		System.out.println("--------------------------------------");
		System.out.println("    CALCULADORA GEOMETRICA DE ÁREA");
		System.out.println("--------------------------------------");
		
		System.out.println("");
		System.out.print("Digite o primeiro valor: ");
		value1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		value2 = sc.nextDouble();
		System.out.print("Digite o último valor: ");
		value3 = sc.nextDouble();
		System.out.println("");
		
		areaTri = 0.5*value1*value3;
		areaCir = Math.PI * Math.pow(value3, 2);
		areaTra = (value1 + value2) * value3 / 2;
		areaQua = value2*value2;
		areaRet = value1*value2;
		
		System.out.println("");
		System.out.printf("Triângulo: %.2f%n", areaTri);
		System.out.printf("Círculo: %.2f%n", areaCir);
		System.out.printf("Trapézio: %.2f%n", areaTra);
		System.out.printf("Quadrado: %.2f%n", areaQua);
		System.out.printf("Retângulo: %.2f%n", areaRet);
		
		
		sc.close();
	}

}
