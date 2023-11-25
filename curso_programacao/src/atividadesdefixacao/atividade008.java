package atividadesdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class atividade008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double PI = 3.14159;
		
		double a;
		double b;
		double c;
		
		double circulo;
		double triangulo;
		double trapezio;
		double quadrado;
		double retangulo;
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor de a: ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = sc.nextDouble();
		
		triangulo = (a * c) / 2;
		circulo = 	PI * Math.pow(c,2);
		trapezio = ((a+b)* c) / 2;
		quadrado = Math.pow(b,2 );
		retangulo = a * b ;
		
		System.out.printf("Area do triangulo = %.3f%n ", triangulo);
		System.out.printf("Area do circulo = %.3f%n ", circulo);
		System.out.printf("Area do trapezio = %.3f%n ", trapezio);
		System.out.printf("Area do quadrado = %.3f%n ", quadrado);
		System.out.printf("Area do retangulo = %.3f%n ", retangulo);
		
		
		sc.close();
	}

}
