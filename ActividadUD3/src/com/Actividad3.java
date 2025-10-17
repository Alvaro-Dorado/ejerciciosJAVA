package com;

import java.util.*;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		// Generar n�mero secreto entre 1 y 100
		int numeroSecreto = random.nextInt(100) + 1;
		int n = 0;

		System.out.println("Introduzca numeros hasta acertar (-1 para salir): ");

		while (n != -1) {
			// Pedimos que introduzca e l numero y leemos los valores
			System.out.print("Numero: ");
			n = sc.nextInt();

			// Mientras no sea 0 hacemos lo que este dentro del bucle
			if (n < numeroSecreto) {
				System.out.println("Numero MENOR que el numero secreto ");
			} else if (n > numeroSecreto) {
				System.out.println("Numero MAYOR que el numero secreto ");
			} else {
				System.out.println("ACERTASTE el numero secreto");
				System.out.println("Numero secreto: " + numeroSecreto);
				break;
			}
		}
		System.out.println("Saliendo...");
		sc.close();
	}
}