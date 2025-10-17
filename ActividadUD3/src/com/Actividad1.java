package com;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = 1.2;
		
		System.out.println("Introduce n�meros (0 para salir):");

		while (n != 0) {
			// Pedimos que introduzca e l numero y leemos los valores
			System.out.print("N�mero: ");
			n = sc.nextDouble();

			// Mientras no sea 0 hacemos lo que este dentro del bucle
			if (n != 0) {

				// si es par
				if (n % 2 == 0) {
					System.out.println("Si es par");
				} else {
					System.out.println("No es par");
				}

				// si es positivo
				if (n >= 0) {
					System.out.println("Si es positivo");
				} else {
					System.out.println("No es positivo");
				}

				// su cuadrado
				double cuadrado = n * n;
				System.out.println("Cuadrado: " + cuadrado);

				// si es cero salimos
			} else {
				System.out.println("El numero introducido es CERO");
				System.out.println("Saliendo del programa...");
			}
		}
		sc.close();
	}
}