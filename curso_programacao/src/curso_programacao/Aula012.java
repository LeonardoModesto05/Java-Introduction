package curso_programacao;

import java.util.Scanner;

public class Aula012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double celsius = 0;
		char novamente = 's';
		
		do
		{
			System.out.println("Digite o valor em Celsius: ");
			celsius = sc.nextDouble();
			double farenheit = (9*celsius)/5+32;
			System.out.println(farenheit);
			System.out.println("Deseja repetir? (S/N)");
			novamente = sc.next().charAt(0);
		} while (novamente != 'n');
		sc.close();

	}

}
