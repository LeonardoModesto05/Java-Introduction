package curso_programacao;

import java.util.Locale;

public class aula001 {

	public static void main(String[] args) {
		double x = 10.357;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(x);
		System.out.printf ("%.2f%n", x);
		System.out.printf ("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf ("%.4f%n", x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n",x);
		System.out.printf("%s tem %d anos e recebe %.2f reais por mes%n", nome, idade, renda);
	}

}
