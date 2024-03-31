package questao11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor nos forneça dois números aleatórios. Número 1: ");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Número 2: ");
		double numero2 = scanner.nextDouble();
		
		double numero3 = numero1 + numero2;
		
		if (numero3 >= 10) {
			
			double numero4 = numero3 + 5;
			
			System.out.print("Este é o resultado do seu numero + 5: "+ numero4);
		} else if (numero3 < 10) {
			
			double numero5 = numero3 - 7;
			
			System.out.print("Este é o resultado do seu numero - 7: "+ numero5);
		}
		
		scanner.close();
		
	}

}
