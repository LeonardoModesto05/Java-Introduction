package atividadesdefixacao;

import java.util.Scanner;

public class Atividade010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero;
		
		System.out.println("Digite um numero qualquer: ");
		numero = sc.nextInt();
		
		if (numero < 0)
		{
			System.out.println("Número negativo!");
		} else
		{
			System.out.println("Número positivo!");
		}
		
		
		sc.close();

	}

}
