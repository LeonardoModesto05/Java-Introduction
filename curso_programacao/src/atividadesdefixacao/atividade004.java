package atividadesdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class atividade004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double pi = 3.14159;
		double raio;
		double area;
		Locale.setDefault(Locale.US);
		System.out.println("Digite o raio do círculo: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A area do circulo eh %.4f%n", area);
		sc.close();

	}

}
