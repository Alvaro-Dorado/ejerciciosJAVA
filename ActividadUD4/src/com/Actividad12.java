package com;

public class Actividad12 {

	public static void main(String[] args) throws Exception {
		System.out.println(calc(5, 2, 1));

	}

	public static double calc(int a, int b, int op) throws Exception {
		double resultado = 0.0;
		switch (op) {
		case 1:
			System.out.println("La operacion de la suma de " + a + " + " + b + " es " + (resultado = a + b));
			break;
		case 2:
			System.out.println("La operacion de la resta de " + a + " + " + b + " es " + (resultado = a - b));
			break;
		case 3:
			System.out.println("La operacion de la multiplicacion de " + a + " + " + b + " es " + (resultado = a * b));
			break;
		case 4:
			if (b != 0) {
				System.out.println(
						"La operacion de la division de " + a + " + " + b + " es " + (resultado = (double) a / b));
			}
			break;
		default:
			throw new Exception("No existe la operacion indicad");
		}
		return (op);
	}
}
