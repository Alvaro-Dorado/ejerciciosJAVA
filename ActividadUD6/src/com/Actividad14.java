package com;

import java.util.Random;
import java.util.Scanner;

public class Actividad14 {
	static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Jugador 1: Introduce una palabra que no este vacía");
		int intentos = 0;
		String palabra, palabra_jugador2 = "";
		do {
			palabra = SC.nextLine();
		} while (palabra.isEmpty());
		String anagrama = anagrama(palabra);
		System.out.println("Pista: " + anagrama);
		do {
			System.out.println("Jugador 2: Introduce la palabra adivinar");
			palabra_jugador2 = SC.nextLine();
			intentos++;
			int totalCoincidencia = cuentaTotalCaracterIguales(palabra, palabra_jugador2);
			if (totalCoincidencia != -1) {
				System.out.println("En total ha coincido en " + totalCoincidencia + " caracteres");
			}
		} while (!palabra_jugador2.equals(palabra));
		System.out.println("Lo conseguisten en " + intentos + " intentos");
		System.out.println("FIN");
	}

	private static String anagrama(String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			palabra = mezcla(palabra);
		}
		return palabra;
	}

	private static int cuentaTotalCaracterIguales(String palabra1, String palabra2) {
		int contador = 0;
		if (palabra1.length() != palabra2.length()) {
			System.out.println("No coinciden el número de caracteres");
			return -1;
		} else {
			for (int i = 0; i < palabra1.length(); i++) {
				if (palabra1.charAt(i) == palabra2.charAt(i)) {
					contador++;
				}
			}
		}
		return contador;
	}

	private static String mezcla(String palabra) {
		Random rand = new Random();
		StringBuilder string_anagrama = new StringBuilder();
		int index_1 = rand.nextInt(palabra.length());
		int index_2;
		do {
			index_2 = rand.nextInt(palabra.length());
		} while (index_1 == index_2);
		char[] tabla_caracter = palabra.toCharArray();
		char index1_tabla = palabra.charAt(index_1);
		tabla_caracter[index_1] = tabla_caracter[index_2];
		tabla_caracter[index_2] = index1_tabla;
		string_anagrama.append(tabla_caracter);
		return string_anagrama.toString();
	}
}