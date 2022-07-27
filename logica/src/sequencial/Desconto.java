package sequencial;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		double salarioBruto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salario bruto: ");
		salarioBruto = sc.nextDouble();
		
		salarioBruto = salarioBruto * (1-0.11);
		System.out.printf("O salario bruto é R$%.2f",salarioBruto);
		
		sc.close();

	}

}
