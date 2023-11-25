package curso_programacao;

import java.util.Scanner;

public class Aula006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String dia;
		System.out.println("Digite um dia da semana");
		n = sc.nextInt();

		switch (n) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "Segunda - feira";
			break;
		case 3:
			dia = "Terça - feira";
			break;
		case 4:
			dia = "Quarta - feira";
			break;
		case 5:
			dia = "Quinta - feira";
			break;
		case 6:
			dia = "Sexta - feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido!";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
