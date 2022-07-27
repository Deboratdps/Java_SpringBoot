package condicional;

import java.util.Scanner;

public class ImpostoRenda {
	public static void main(String[] args) {
		double salarioBruto,salarioDesc,desconto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salario bruto: ");
		salarioBruto = sc.nextDouble();
		
		if(salarioBruto < 1903.98) {
			desconto = 0;
			salarioDesc = 0;
		}
		else if(salarioBruto < 2826.65) {
			desconto = 7.5;
			salarioDesc = 142.8;
		}
		else if(salarioBruto < 3751.06) {
			desconto = 15;
			salarioDesc = 354.8;
		}
		else if(salarioBruto < 4664.68) {
			desconto = 22.5;
			salarioDesc = 636.13;
		} else {
			desconto = 27.5;
			salarioDesc = 869.36;
		}
		
		salarioBruto = salarioBruto - salarioDesc;
		System.out.printf("O salario novo bruto é R$%.2f e o desconto de IR é %.1f %%",salarioBruto, desconto);
		
		sc.close();
	}
}
