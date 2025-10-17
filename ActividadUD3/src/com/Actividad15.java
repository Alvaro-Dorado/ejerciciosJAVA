package com;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, contadorPrimos = 0;
		System.out.print("Ingrese un número n: ");
		n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			boolean esPrimo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo) {
				contadorPrimos++;
				System.out.println(i + " primo");
			} else {
				System.out.println(i + " no primo");
			}
		}
		System.out.println("Total: " + contadorPrimos + " números primos");
		sc.close();
	}
}