package questão5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Escolha dois números aleatórios. Número 1: ");
	double numero1 = scanner.nextDouble();
	
	System.out.print("Número 2: ");
	double numero2 = scanner.nextDouble();
	
	if (numero1 > numero2) {
		System.out.print("O seu primeiro número escolhido é maio que o segundo!");
	} else if (numero1 < numero2) {
		System.out.print("O seu segundo número é maior que o primeiro!");
	}
	scanner.close();
	}

}
