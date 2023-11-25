package atividadesdefixacao;

import java.util.Scanner;

public class Atividade012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero1;
		int numero2;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = sc.nextInt();
		
		if (numero2 % numero1 == 0)
		{
			System.out.println("Sao multiplos!");
		} else
		if (numero1 % numero2 == 0)
		{
			System.out.println("São multiplos!");
		} else
		{
			System.out.println("Não são multiplos!");
		}
		sc.close();

	}

}
