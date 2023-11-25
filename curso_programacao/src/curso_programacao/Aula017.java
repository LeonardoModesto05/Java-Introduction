package curso_programacao;

import java.util.Scanner;

public class Aula017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os tres numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max (a,b,c);
		showResult(higher);
		sc.close();
			
		sc.close();

	}
	public static int max (int x, int y, int z)
	{
		int aux = 0;
		if (x > y && x > z )
		{
			aux = x;
		} else 
		if (y > x && y >z)
		{
			aux = y;
		} else
		if (z > x && z > y)
		{
			aux = z;
		}
		return aux;
	}
	public static void showResult (int value)
	{
		System.out.println("O maior numero é " + value);
	}
}

