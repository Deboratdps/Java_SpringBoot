package condicional;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		double peso, altura;
		String classificacao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		peso = sc.nextDouble();
		
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		double imc = peso/Math.pow(altura, 2);
		
		if(imc < 18.5) {
			classificacao = "abaixo do peso";
		} else if(imc < 25) {
			classificacao = "peso normal";
		}
		else if(imc < 30) {
			classificacao = "sobrepeso";
		}
		else if(imc < 35) {
			classificacao = "obesidade nivel 1";
		}
		else if(imc < 40) {
			classificacao = "obesidade nivel 2";
		} else {
			classificacao = "obesidade morbida";
		}

		System.out.printf("O seu IMC é %.2f e sua classificalção é %s",imc, classificacao);
		sc.close();
	}

}
