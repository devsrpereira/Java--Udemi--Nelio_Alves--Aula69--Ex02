package application;

import entities.Funcionario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println();

        System.out.printf("Name: ");
        funcionario.name = s.nextLine();

        System.out.printf("Gross salary: ");
        funcionario.grossSalary = s.nextDouble();

        System.out.printf("Tax: ");
        funcionario.tax = s.nextDouble();

        System.out.printf("%nEmployee: %s%n", funcionario);

        System.out.printf("%nWhich percentage to increase salary? ");
        funcionario.increaseSalary(s.nextDouble());

        System.out.printf("%nUpdate data: %s%n", funcionario);


    }
}