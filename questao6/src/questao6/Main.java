package questao6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Para calcularmos a sua média final por favor nos forneça as notas de sua primeira e segunda prova, além do trabalho feito."
				+ " Primeira prova: ");
		double prova1 = scanner.nextDouble();
		
		System.out.println("Segunda prova: ");
		double prova2 = scanner.nextDouble();
		
		System.out.println("Nota do trabalho: ");
		double trabalho = scanner.nextDouble();
		
		double notaf = (prova1 + prova2 + trabalho)/3;
		
		if (notaf >= 7) {
			System.out.println("Parabéns, você foi aprovado!");
		} else if (notaf < 7) {
			System.out.println("Infelizmente você foi reprovado.");
		}
		scanner.close();
	}

}
