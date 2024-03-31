import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		double horastrabalhadas = scanner.nextDouble();
		
		double taxahoraria = 20.00;
		
		double salario = horastrabalhadas * taxahoraria;
		
		System.out.println(" o salário do opérario é de R$" + salario);
		
		scanner.close();
	}

}
