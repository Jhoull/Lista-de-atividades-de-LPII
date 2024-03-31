package questao4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual a temperatura do corpo mostrada pelo termômetro? ");
		double temperatura = scanner.nextDouble();
		
		if (temperatura > 37) {
			System.out.print("O paciente está febril. É reconmendado o paciente tomar um antitérmico, mas se o sintoma persistir, leve-o para o hospital.");
		} else if (temperatura <= 37) {
			System.out.print("O paciente está com a temperatura normal.");
		}
		scanner.close();
	}

}
