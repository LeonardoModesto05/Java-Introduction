package atividadesdefixacao;

import java.util.Locale;

public class atividade001 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 32;
		int code = 5920;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.printf("%s, wich price is %.2f%n", product1, price1);
		System.out.printf("%s, wich price is %.2f%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender %c%n", age, code,gender);
		
		System.out.printf("Measure eight decimal places: %f%n", measure);
		System.out.printf("Three decimal places: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Three decimal places: %.3f%n", measure);

	}

}
