package com;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, factorial = 1;

		System.out.println("Introduce un numero: ");
		n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			factorial *= i;
		}
		System.out.println("El factorial de " + n + " es: " + factorial);
		sc.close();
	}
}