package com;

import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("➤ Dime un número <n> para el tamaño de la tabla");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.println(" Dime un número: ");
			int numero = sc.nextInt();
			numeros[indice] = numero;
		}
		int totalDeCeros = cuentaCero(numeros);
		System.out.println("El total de ceros es " + totalDeCeros);
		System.out.println("El total de media de positivos " + mediaPositivos(numeros));
		System.out.println("El total de media de negativos " + mediaNegativos(numeros));
		System.out.println("☠ Fin ");
	}

	private static double mediaNegativos(int[] t) {
		int contador = 0;
		double resultado = 0.0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] < 0) {
				contador++;
				resultado += t[i];
			}
		}
		return resultado;
	}

	public static double mediaPositivos(int[] tabla) {
		int contador = 0;
		double resultado = 0.0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > 0) {
				contador++;
				resultado += tabla[i];
			}
		}
		return resultado / contador;
	}

	public static int cuentaCero(int[] nums) {
		int contador = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				contador++;
			}
		}
		return contador;
	}

}