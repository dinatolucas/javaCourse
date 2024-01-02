package application;

import java.util.Scanner;
import entities.Student;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Nome do aluno: ");
        student.Name = sc.nextLine();
        System.out.println();

        System.out.print("Primeira Nota: ");
        student.Grade1 = sc.nextDouble();

        System.out.print("Segunda Nota: ");
        student.Grade2 = sc.nextDouble();

        System.out.print("Última Nota: ");
        student.Grade3 = sc.nextDouble();

        System.out.println();
        System.out.println(student.finalGradeStatus());
    }
}
