package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExec3 {

	public static void main(String[] args) {
		Triangulo a = new Triangulo();
		Triangulo b = new Triangulo();
		
		entrada(a);
		//TrianguloA	
		if(a.validar() == true) {
			System.out.println(a.toString());
		}else {
			System.out.println("\nOs lados informados não são de um triangulo\n\n");
		}
		
		entrada(b);
		//TrianguloB
		if(b.validar() == true) {
			System.out.println(b);
		}else {
			System.out.println("\nOs lados informados não são de um triangulo\n\n");
		}
	}
	
	public static void entrada(Triangulo lado) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite os valores de dos lados: ");
		lado.x = sc.nextDouble();
		lado.y = sc.nextDouble();
		lado.z = sc.nextDouble();
	}
}
