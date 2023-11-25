package atividadesdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		int n = sc.nextInt();
		double a;
		double b;
		double c;
		
		for (int i = 0; i < n; i++)
		{
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
		double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
		System.out.printf("%.1f", media);
		}
		sc.close();

	}

}
