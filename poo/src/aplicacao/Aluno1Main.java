package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Aluno1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("Data de nascimento (dd/mm/aaaa):");
		String nascimento = sc.next();
		System.out.println("Turma:");
		String turma = sc.next();
		sc.nextLine();
		System.out.println("Data de matrícula  (dd/mm/aaaa)");
		String matricula = sc.next();
		
		Aluno aluno = new Aluno(nome, nascimento, turma, matricula);
		System.out.println(aluno);
		
 		sc.close();
	}
}
