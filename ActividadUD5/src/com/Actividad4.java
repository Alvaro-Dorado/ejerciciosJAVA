package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = { 2, 5, 13, 6, 9, 10 };
		int aux;

		System.out.println("Inicio: ");
		mostrarTabla(numeros);

		do {
			System.out.println("Dime el indice: ");
			int indice = sc.nextInt();
			if (indice >= numeros.length || indice < 0) {
				continue;
			}
			aux = numeros[numeros.length - 1];
			numeros[indice] = aux;
			numeros = Arrays.copyOf(numeros, numeros.length - 1);
			mostrarTabla(numeros);
		} while (numeros.length > 0);
		System.out.println("FIN");
	}

	public static void mostrarTabla(int[] tabla) {
		System.out.print("[ ");
		for (int elemento : tabla) {
			System.out.print(elemento + "\t");
		}
		System.out.print("]");
	}
}