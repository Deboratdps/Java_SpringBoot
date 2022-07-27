package aplicacao;

import java.util.Scanner;
import entidades.Veiculo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pas;
		double tanque, consumo, km, valor;
		
		System.out.println("\nQtde passageiros: ");
		pas = sc.nextInt();
		System.out.println("\nCapacidade do tanque: ");
		tanque = sc.nextDouble();
		System.out.println("\nConsumo por litro: ");
		consumo = sc.nextDouble();
		System.out.println("\nDistância em KM: ");
		km = sc.nextDouble();
		System.out.println("\nValor do combustível: ");
		valor = sc.nextDouble();
		
		Veiculo fit = new Veiculo(pas, tanque, consumo);
		System.out.println(fit.toString());
		
		double tanques = fit.tanqueViagem(km);
		double rateio = fit.dividirDespesas(km, valor);
		
		System.out.printf("Para a viagem vamos precisar de %.1f tanque(s) e cada passageiro contribuirá com R$ %.2f.\n", tanques, rateio);
		
		sc.close();
	}

}
