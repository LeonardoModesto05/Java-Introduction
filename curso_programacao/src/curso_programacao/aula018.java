package curso_programacao;

import java.util.Scanner;

import entitites.Triangle;

public class aula018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		// calcula o p e a area do triangulo A
		System.out.println("Digite os lados do triangulo A");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		double area1 = x.area();
		// calcula o p e a area do triangulo B
		System.out.println("Digite os lados do triangulo B");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double area2 = y.area();
		System.out.printf("Area do triangulo A %.4f%n", area1);
		System.out.printf("A area do triangulo B %.4f%n", area2);
		if (area1 > area2)
		{
			System.out.printf("A area maior é o triangulo A %.4f%n", area1);
		} else
		{
			System.out.printf("A area maior é o triangulo B %.4f%n", area2);
		}
		

		
		
		sc.close();
	}

}
