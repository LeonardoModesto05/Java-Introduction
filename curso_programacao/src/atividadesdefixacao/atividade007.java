package atividadesdefixacao;

import java.util.Scanner;

public class atividade007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int codPiece1;
		int numberPiece1;
		double valueUnit1;
		
		int codPiece2;
		int numberPiece2;
		double valueUnit2;
		
		double total;
		
		System.out.println("Digite os valores da peça (cód, number, val.unit ): ");
		codPiece1 = sc.nextInt();
		numberPiece1 = sc.nextInt();
		valueUnit1 = sc.nextDouble();
		
		System.out.println("Digite os valores da peça (cód, number, val.unit ): ");
		codPiece2 = sc.nextInt();
		numberPiece2 = sc.nextInt();
		valueUnit2 = sc.nextDouble();
		
		total = ((double) numberPiece1 * valueUnit1) + ((double)numberPiece2 * valueUnit2);
		
		System.out.println("Total = " + total);
	
		
		
		sc.close();
	}

}
