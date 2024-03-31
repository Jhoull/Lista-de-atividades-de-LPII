package questao7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Vamos calcular seu IMC! Para isso precisamos de sua altura e peso. Qual a sua altura? ");
		double altura = scanner.nextDouble();
		
		System.out.print("Qual é seu peso? ");
		double peso = scanner.nextDouble();
		
		double imc = peso/altura;
		
		if (imc > 30) {
			System.out.print("Você está se tornando uma pessoa obesa.");
		} else if (imc < 30) {
			System.out.print("Parabéns! Seu IMC está agradável.");
		}
		scanner.close();

	}

}
