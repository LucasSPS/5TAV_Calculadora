package calculadora;

public class Calculadora {
	public double somar(double a, double b) {
		return a + b;
	}

	public double subtrair(double a, double b) {
		return a - b;
	}

	public double multiplicar(double a, double b) {
		return a * b;
	}

	public double dividir(double a, double b) {
		double res = 0;
		res = a / b;

		return res;
	}

	public double porcentagem(double a) {
		return a%100;
	}

	public double raizQuadrada(double a) {
		return Math.sqrt(a);
	}

	public double exponenciacao(double a) {
		return a*a;
	}

}
