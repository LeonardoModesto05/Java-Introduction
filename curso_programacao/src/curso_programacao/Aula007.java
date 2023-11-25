package curso_programacao;

public class Aula007 {

	public static void main(String[] args) {
		double preço = 34.5;
		double desconto = (preço < 20.0) ? preço * 0.1 : preço * 0.05;
		
		System.out.printf("%.2f%n", desconto);
	}

}
