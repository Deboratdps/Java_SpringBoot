package sequencial;

import java.util.Scanner;

public class Aumento2 {
	
	public static void main(String[] args) {
		double salarioBruto,percentual;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salario bruto: ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("Informe o percentual de aumento: ");
		percentual = sc.nextDouble();
		
		salarioBruto = salarioBruto * (1+percentual/100);
		System.out.printf("O salario bruto � R$%.2f",salarioBruto);
		
		sc.close();
	}
}
