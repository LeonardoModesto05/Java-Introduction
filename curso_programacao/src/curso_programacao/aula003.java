package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		String x;
		double altura;
		char genero;
		String dado1;
		int dado2;
		double dado3;
		System.out.println("Digite seu nome: ");
		x = sc.next();
		System.out.println("Você digitou " + x);
		System.out.println("Digite sua idade: ");
		y = sc.nextInt();
		System.out.printf("Sua idade eh %d%n", y);
		System.out.println("Qual a sua altura: ");
		Locale.setDefault(Locale.US);
		altura = sc.nextDouble();
		System.out.printf("Voce digitou %.2f%n", altura);
		System.out.println("Qual o seu genero: ");
		genero = sc.next().charAt(0);
		System.out.printf("Voce digitou %c", genero);
		dado1 = sc.next();
		dado2 = sc.nextInt();
		dado3 = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(dado1);
		System.out.println(dado2);
		System.out.println(dado3);

		sc.close();
	}

}
