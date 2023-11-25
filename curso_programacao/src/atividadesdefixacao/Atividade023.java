package atividadesdefixacao;

import java.util.Scanner;

public class Atividade023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = 0;
		int in = 0;
		int out = 0;
		for (int i = 0; i < n; i++) {
			y = sc.nextInt();
			if (y >= 10 && y <= 20 )
			{
				in += 1;
			} else
			{
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();

	}

}
