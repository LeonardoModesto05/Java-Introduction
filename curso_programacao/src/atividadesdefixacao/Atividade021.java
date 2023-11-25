package atividadesdefixacao;

import java.util.Scanner;

public class Atividade021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Fim");
		System.out.println("Digite a opcao: ");
		opcao = sc.nextInt();


		while (opcao != 4) {
			switch (opcao) {
			case 1 :
				alcool = alcool + 1;
				break;
			case 2 : 
				gasolina = gasolina +  1;
				break;
			case 3 :
				diesel = diesel + 1;
				break;
			}
				System.out.println("1 - Álcool");
				System.out.println("2 - Gasolina");
				System.out.println("3 - Diesel");
				System.out.println("4 - Fim");
				System.out.println("Digite a opcao: ");
				opcao = sc.nextInt();
		}
		System.out.println("Muito obrigado!");
		System.out.println("Alcool "+ alcool);
		System.out.println("Gasolina "+ gasolina);
		System.out.println("Diesel "+ diesel);
		sc.close();

	}

}
