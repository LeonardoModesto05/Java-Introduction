package atividadesdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class atividade002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double largura;
		double comprimento;
		double metroQuadrado;
		double area;
		double valor;
		Locale.setDefault(Locale.US);
		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		valor = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Valor = %.2f%n", valor);
		
		sc.close();
	}

}
