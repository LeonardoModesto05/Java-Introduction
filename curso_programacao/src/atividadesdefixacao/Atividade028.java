package atividadesdefixacao;

import java.util.Scanner;

public class Atividade028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)
		{
			int primeiroNumero = i;
			int quadrado = i*i;
			int cubo = i*i*i;
			
			System.out.printf("%d %d %d%n",primeiroNumero,quadrado,cubo);
		}
		sc.close();

	}

}
