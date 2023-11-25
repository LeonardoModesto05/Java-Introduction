package curso_programacao;

import java.util.Scanner;

public class Aula008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area;
		double price;
		
		area = largura * comprimento;
		price = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %,2f%n", price);
		sc.close();

	}

}
