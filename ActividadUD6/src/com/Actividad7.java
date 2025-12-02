package com;

import java.util.Scanner;

public class Actividad7 {
	static Scanner sc = new Scanner(System.in);
	static String frase = "En un lugar de la mancha cuyo lugar me lo invento ";
	static String palabra = "lugar";

	public static void main(String[] args) {
		int index = 0;
		int contador = 0;
		do {
			index = frase.indexOf(palabra, index);
			if (index >= 0) {
				contador++;
				index++;
			}
		} while (index >= 0);
		System.out.println("Aparece " + contador + " la palabra " + palabra);
	}
}