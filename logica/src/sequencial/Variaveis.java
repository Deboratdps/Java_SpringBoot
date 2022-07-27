package sequencial;

public class Variaveis {

	public static void main(String[] args) {
		int quantidade = 1500;
		float valorMercadoria = 750.28f;
		double peso = 78.3;
		char genero = 'F';
		
		System.out.printf("Quantidade de itens em estoque %d\n",quantidade);
		System.out.printf("O valor da mercadoria é R$%.1f\n",valorMercadoria);
		System.out.printf("O peso é %f\n",peso);
		System.out.printf("Do genero %c tem matriculadas %d alunas\n",genero, quantidade);
	}

}
