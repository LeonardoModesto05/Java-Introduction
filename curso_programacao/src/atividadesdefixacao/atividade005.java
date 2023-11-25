package atividadesdefixacao;

import java.util.Scanner;

public class atividade005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		int b;
		int	c;
		int d;
		int diferenca;
		System.out.println("Digite o valor de a: ");
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();
		System.out.println("Digite o valor de c: ");
		c = sc.nextInt();
		System.out.println("Digite o valor de d: ");
		d = sc.nextInt();
		
		diferenca = (a*b - c*d);
		
		System.out.println("A diferença entre os valores eh igual a " + diferenca);
		sc.close();
	}

}
