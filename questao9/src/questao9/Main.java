package questao9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor da hora trabalhando como professor? ");
	        double valorHoraAula = scanner.nextDouble();

	        System.out.println("Digite o número de horas trabalhadas no mês: ");
	        double horasTrabalhadas = scanner.nextDouble();

	        System.out.println("Digite o percentual de desconto do INSS: ");
	        double percentualINSS = scanner.nextDouble();

	        double salarioBruto = valorHoraAula * horasTrabalhadas;

	        double descontoINSS = (percentualINSS / 100) * salarioBruto;

	        double salarioLiquido = salarioBruto - descontoINSS;

	        System.out.println("Salário bruto: " + salarioBruto);
	        System.out.println("Desconto do INSS: " + descontoINSS);
	        System.out.println("Salário líquido: " + salarioLiquido);

	        scanner.close();
	}

}
