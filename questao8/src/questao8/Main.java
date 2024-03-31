package questao8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Vamos calcular a area de uma circunferência! Nos informe o Raio dela: ");
		double raio = scanner.nextDouble();
		
		double r2 = raio * raio;
		
		double area = Math.PI*r2;
		
		System.out.print("A area da sua circunferência é de "+ area);
		
		scanner.close();

	}

}
