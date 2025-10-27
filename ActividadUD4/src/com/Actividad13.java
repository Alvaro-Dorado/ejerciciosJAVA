package com;

public class Actividad13 {
	public static void main(String[] args) {
		int numero = 5;
		int result = factorial(numero);
		System.out.println(numero + "! = " + result);

	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}
}