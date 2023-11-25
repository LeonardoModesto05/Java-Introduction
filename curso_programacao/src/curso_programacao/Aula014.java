package curso_programacao;

import java.util.Scanner;

public class Aula014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int mask = 0b100000;
		
		if ((n & mask) != 0)
		{
			System.out.println("The 6th bit is true");
		} else
		{
			System.out.println("The 6th bit is false");
		}
		sc.close();

	}

}
