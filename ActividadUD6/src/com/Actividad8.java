package com;

import java.util.Scanner;

public class Actividad8 {

	static Scanner sc = new Scanner(System.in);
	static final String PALINDROMA = "Dábale arroz a la zorra el abad";

	public static void main(String[] args) {
		System.out.println("Dime una frase si es palíndroma: ");
		String frase = PALINDROMA;
		String normalizada = frase.trim().replaceAll(" ", "").toLowerCase();
		StringBuilder sb = new StringBuilder(normalizada);
		String invertida = sb.reverse().toString();
		if (invertida.equalsIgnoreCase(normalizada)) {
			System.out.println("La frase es palíndroma");
		} else {
			System.out.println("No lo es");
		}
	}

	public static String limpiarAcentos(String texto) {
		return texto.toLowerCase().replaceAll("á", "a").replaceAll("è", "e").replaceAll("í", "i").replaceAll("ù", "u")
				.replaceAll("ó", "o");
	}
}