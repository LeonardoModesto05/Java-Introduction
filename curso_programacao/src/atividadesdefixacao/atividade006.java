package atividadesdefixacao;

import java.util.Locale;
import java.util.Scanner;

public class atividade006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int funcionarioN;
		int	timeWorked;
		double salaryTime;
		double salary;
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite seu N° pessoal: ");
		funcionarioN = sc.nextInt();
		System.out.println("Digite sua hora trabalhada: ");
		timeWorked = sc.nextInt();
		System.out.println("Digite seu salario por hora: ");
		salaryTime = sc.nextDouble();
		
		salary = salaryTime * (double) timeWorked;
		
		System.out.println("Numero pessoal " + funcionarioN);
		System.out.printf("Salario do funcionario eh %.2f", salary);
		
		sc.close();
	}

}
