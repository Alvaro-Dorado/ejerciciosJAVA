package calculadora;

public class Calculadora {
	private int num1;
	private int num2;

	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int sumar(int num1, int num2) {
		int sumar = num1 + num2;
		return sumar;
	}

	public int restar(int num1, int num2) {
		int restar = num1 - num2;
		return restar;
	}

	public int multiplicar(int num1, int num2) {
		int multiplicar = num1 * num2;
		return multiplicar;
	}

	public double dividir(double num1, double num2) {
		if (num2 == 0) {
			System.err.println("No se puede");
		} else {
			double dividir = num1 / num2;
		}
		return dividir(0, 0);
	}
}
