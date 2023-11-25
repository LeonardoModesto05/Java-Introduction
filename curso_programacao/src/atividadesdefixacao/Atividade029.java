package atividadesdefixacao;


import java.util.Random;
import java.util.Scanner;

public class Atividade029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(1000) + 1;
		int tentativas = 0;
		boolean acertou = false;
		
		while (!acertou)
		{
			tentativas += 1;
			System.out.println("Digite seu palpite " + tentativas + " entre 1 e 1000");
			int palpite = sc.nextInt();
			if (palpite == numeroAleatorio)
			{
				System.out.println("Voce acertou o numero! Parabens!");
				break;
			} else
			if (numeroAleatorio > palpite)
			{
				System.out.println("Seu palpite foi baixo");
			} else
			{
				System.out.println("Seu palpite foi alto");
			}
			if (tentativas == 10)
			{
				System.out.println("Suas chances acabaram! O numero era " + numeroAleatorio);
				break;
			}
			
		}
	}

}
