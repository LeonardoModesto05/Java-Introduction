package atividadesdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1;
		double nota2;
		double notaFinal;
		Locale.setDefault(Locale.US);
		System.out.println("Digite a nota do 1° semestre: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a nota do 2° semestre: ");
		nota2 = sc.nextDouble();

		notaFinal = nota1 + nota2;

		System.out.printf("Nota final = %.2f%n", notaFinal);

		if (notaFinal < 60.00)
		{
			System.out.println("Reprovado!");
		} 
		if (notaFinal > 60.00) {
			System.out.println("Aprovado!");
		}

		sc.close();
	}
}
