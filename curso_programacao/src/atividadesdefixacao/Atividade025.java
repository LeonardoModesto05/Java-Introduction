package atividadesdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade025 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			double numerador = sc.nextDouble();
			double divisor = sc.nextDouble();
			double divisao = numerador / divisor;
			if (divisor == 0)
			{
				System.out.println("divisao impossivel");
			} else
			{
				System.out.printf("%.1f",divisao);
			}
		}
		sc.close();
	}

}
