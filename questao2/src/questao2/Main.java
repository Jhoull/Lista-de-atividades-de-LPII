package questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual é a distância até a sua fazenda(em Km)?");
		double distancia = scanner.nextDouble();
		
		System.out.print("Qual o preço do litro da gasolina?");
		double precogasolina = scanner.nextDouble();
		
		double mediakm = 12.0;
		
		double quantidadedegasolina = distancia/mediakm;
		
		double custo = quantidadedegasolina * precogasolina;
		
		System.out.println("É preciso colocar " + quantidadedegasolina + " de gasolina e isso irá custar: " + custo);
		
		scanner.close();
		

	}

}
