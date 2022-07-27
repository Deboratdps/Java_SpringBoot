package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class ProdutoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nInformar os dados do produto");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("\nQuantidade: ");
		int quantidade = sc.nextInt();
		System.out.print("\nValor unitário: ");
		double valor = sc.nextDouble();
		
		Produto celular = new Produto(nome, valor, quantidade);
		System.out.printf("\n%s ",celular.nome);
		System.out.printf("\n%s ",celular.quantidade);
		System.out.printf("\nR$ %.2f ",celular.valorUnitario);
		
		System.out.printf("\nImposto: R$:%.2f", celular.valorImposto());
		System.out.printf("\nTotal em estoque: R$:%.2f", celular.valorEstoque());
		
		sc.close();
	}

}
