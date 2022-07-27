package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExec2 {

	public static void main(String[] args) {
		Triangulo a = new Triangulo();
		Triangulo b = new Triangulo();
		
		a.x = 7;
		a.y = 8;
		a.z = 8;
		
		b.x = 15;
		b.y = 10;
		b.z = 13;
		
		double area, perimetro;
		String tipo;
		
		//TrianguloA	
		if(Math.abs(a.x - a.y) < a.z && a.z < (a.x + a.y)) {
			if(a.x == a.y && a.y == a.z) {
				tipo = "equilátero";
			}else if(a.x == a.y || a.x == a.z || a.y == a.z) {
				tipo = "isóceles";
			}else {
				tipo = "escaleno";
			}
		
			perimetro = (a.x + a.y + a.z) / 2.0;
			area = Math.sqrt(perimetro * (perimetro-a.x)*(perimetro-a.y)*(perimetro-a.z));
			
			System.out.printf("\nOs lados de A %.1f, %.1f e %.1f formam um triangulo %s.", a.x, a.y, a.z, tipo);
			System.out.printf("\nO perímetro do triangulo é %.1f.", perimetro);
			System.out.printf("\nA area desse triangulo é %.1f.", area);
		}else {
			System.out.println("\nOs lados informados não são de um triangulo\n\n");
		}
		
		//TrianguloB
		if(Math.abs(b.x - b.y) < b.z && b.z < (b.x + b.y)) {
			if(b.x == b.y && b.y == b.z) {
				tipo = "equilátero";
			}else if(b.x == b.y || b.x == b.z || b.y == b.z) {
				tipo = "isóceles";
			}else {
				tipo = "escaleno";
			}
		
			perimetro = (b.x + b.y + b.z) / 2.0;
			area = Math.sqrt(perimetro * (perimetro-b.x)*(perimetro-b.y)*(perimetro-b.z));
			
			System.out.printf("\n\nOs lados de B %.1f, %.1f e %.1f formam um triangulo %s.", b.x, b.y, b.z, tipo);
			System.out.printf("\nO perímetro do triangulo é %.1f.", perimetro);
			System.out.printf("\nA area desse triangulo é %.1f.", area);
		}else {
			System.out.println("\nOs lados informados não são de um triangulo\n\n");
		}
	}
}
