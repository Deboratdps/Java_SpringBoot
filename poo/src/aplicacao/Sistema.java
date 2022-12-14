package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Departamento;
import entidades.Funcionario;
import entidades.enums.Nivel;

public class Sistema {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Departamento: ");
		String depto = sc.nextLine();
		System.out.println("Funcionario: ");
		String func = sc.nextLine();
		System.out.println("Nivel: ");
		String nivel = sc.nextLine();
		System.out.println("Salario base: ");
		double salario = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(func, Nivel.valueOf(nivel), salario, new Departamento(depto));
		
		System.out.println("Contratos associados: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Contrato n? "+i+":");
			System.out.println("Data (DD/MM/YYYY): ");
			Date data = sdf.parse(sc.next());
			System.out.println("Valor da hora:");
			double valor = sc.nextDouble();
			System.out.println("Quantidade de horas:");
			int horas = sc.nextInt();
			
			Contrato contrato = new Contrato(data, valor, horas);
			funcionario.addContrato(contrato);
		}
		
		System.out.println("Informe m?s e ano(mm/aaaa): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("\nNome: "+funcionario.getNome());
		System.out.println("\nDepartamento: "+funcionario.getDepartamento().getNome());
		System.out.println("\nSalario: "+mesAno+"R$"+String.format("%.2f",funcionario.ganho(ano, mes)));

		sc.close();
	}

}
