package repeticao;

import java.util.Scanner;

public class MediaAlunosFor {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double total = 0;
			int contador;
			
			for(contador=0; contador<=9; contador++) {
				System.out.printf("\nDigite a %dª nota: ", contador+1);
				double nota = sc.nextDouble();
				total += nota;
			}
			
			double media = total/contador;
			System.out.printf("O total de todas as notas é %.1f", total);
			System.out.printf("\nTotal de alunos %d", contador);
			System.out.printf("\nA media da turma é %.1f", media);
			
			sc.close();
		}

	}

}
