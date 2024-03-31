package questao10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor, nos forneça dois números aleatórios. Número 1: ");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Número 2: ");
		double numero2 = scanner.nextDouble();
		
		double numero3 = numero1 + numero2;
		
		if (numero3 >= 10) {
			System.out.print("Esta é a soma dos seus sois números: "+ numero3);
		} else if (numero3 < 10) {
			System.out.print("A soma de seus números não conseguiu alcançar o valor minimo necessário para seer visualizado.");
		}
        scanner.close();
	}

}
