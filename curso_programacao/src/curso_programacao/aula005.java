package curso_programacao;

import java.util.Scanner;

public class aula005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Que horas sao? ");
		hora = sc.nextInt();

		if (hora >= 0 && hora < 12) {
			System.out.println("Bom dia!");
		} else {
			if (hora >= 12 && hora < 18) {
				System.out.println("Boa tarde!");
			}
		}
		 if (hora >= 18 && hora < 24) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Valor incorreto!");
		}

		sc.close();
	}

}
