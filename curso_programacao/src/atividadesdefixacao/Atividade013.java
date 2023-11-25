package atividadesdefixacao;

import java.util.Scanner;

public class Atividade013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int horaComeco;
		int horaTermino;
		int horaTotal;
		
		
		System.out.println("Que horas começou o jogo? ");
		horaComeco = sc.nextInt();
		System.out.println("Que horas terminou o jogo? ");
		horaTermino = sc.nextInt();
		
		horaTotal = horaTermino - horaComeco;
		
		if (horaTermino == horaComeco)
		{
			System.out.println("O jogo durou 24 horas.");
		} else
		{
			System.out.println("O jogo durou " + horaTotal + "horas");
		}
		
		sc.close();
	}

}
