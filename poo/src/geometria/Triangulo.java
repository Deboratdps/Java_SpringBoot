package geometria;

public class Triangulo {
	public double x;
	public double y;
	public double z;
	
	public boolean validar() {
		if(Math.abs(x - y) < z && z < (x + y)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String classificar() {
		String tipo;
		
		if(x == y && y == z) {
			tipo = "equil?tero";
		}else if(x == y || x == z || y == z) {
			tipo = "is?celes";
		}else {
			tipo = "escaleno";
		}
		
		return tipo;
	}
	
	public double perimetro() {
		return (x + y + z) / 2.0;
	}
	
	public double area() {
		return Math.sqrt(perimetro() * (perimetro()-x)*(perimetro()-y)*(perimetro()-z));
	}
	
	public String toString() {
		return "\n\nOs lados " + x + ", " + y + " e " + z + " formam um triangulo " + classificar() +"."
		+ "\nO per?metro do triangulo ? " + String.format("%.2f", perimetro())+"."
		+ "\nA area desse triangulo ? " + String.format("%.2f", area()) + ".\n\n";
	}
	
}
