package condicional;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.printf("O número %d é Domingo", opcao);
			break;
		case 2:
			System.out.printf("O número %d é Segunda-Feira", opcao);
			break;
		case 3:
			System.out.printf("O número %d é Terça-Feira", opcao);
			break;
		case 4:
			System.out.printf("O número %d é Quarta-Feira", opcao);
			break;
		case 5:
			System.out.printf("O número %d é Quinta-Feira", opcao);
			break;
		case 6:
			System.out.printf("O número %d é Sexta-Feira", opcao);
			break;
		case 7:
			System.out.printf("O número %d é Sábado", opcao);
			break;
		default:
			System.out.println("Opção Invalida");
		}
		
		sc.close();

	}

}
