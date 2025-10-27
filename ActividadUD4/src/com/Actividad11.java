package com;

public class Actividad11 {

	public static void main(String[] args) throws Exception {
		System.out.println(interativa(2.0, 3));
	}

	public static double interativa(double a, int n) throws Exception {
		if (n < 0) {
			throw new Exception("N no puede ser negativo");
		}
		double aux = 1;
		for (int i = 1; i < n; i++) {
			aux = aux + a;
		}
		return aux;
	}

	public static double recursiva(double a, int n) throws Exception {
		if (n < 0) {
			throw new Exception("N no puede ser negativo");
		}
		if (n == 0) {
			return 1;
		} else {
			return a * recursiva(a, n - 1);
		}
	}
}
