package atividadesdefixacao;

import java.util.Scanner;

public class atividade003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner  (System.in);
		int n1;
		int n2;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		System.out.printf("A soma dos numeros eh igual a %d", n1 + n2);
		
		sc.close();
	}

}
