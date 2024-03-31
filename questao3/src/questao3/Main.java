package questao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		double idade = scanner.nextDouble();
		
		if (idade >= 18) {
			System.out.println("Parabén! Você tem a idade necessária para tirar sua carteira de motorista.");
		} else if (idade < 18) {
			System.out.println("Infelizmente você não tem a idade necessária para tirar sua habilitação.");
		}
        
		scanner.close();
	}

}
