package atividadesdefixacao;

import java.util.Scanner;

public class Atividade019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int password = 0;

		while (password != 2002) {
			System.out.println("Digite a senha!");
			password = sc.nextInt();
			if (password != 2002) {
				System.out.println("Senha incorreta!");
			} else
			{
				System.out.println("Senha correta!");
			}
		}

		sc.close();
	}

}
