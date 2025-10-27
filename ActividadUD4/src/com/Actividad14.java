package com;

public class Actividad14 {
	public static void main(String[] args) {
		int n = 7;
		int fibonacci = fibonacci(n);
		System.out.println("El " + n + "º número de la secuencia de fibonacci es: " + fibonacci);
	}

	public static int fibonacci(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return fibonacci(x - 1) + fibonacci(x - 2);
		}

	}
}