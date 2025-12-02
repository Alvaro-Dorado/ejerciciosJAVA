package com;

import java.util.Scanner;

public class Actividad4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Estrategia2();
	}

	public static void Estrategia1() {
		System.out.println("Introduzca una frase: ");
		String frase, frase2;
		frase = sc.nextLine().trim();
		frase2 = frase.replaceAll(" ", "");
		int resultado = frase.length() - frase2.length();
		System.out.println("En total hay " + resultado + " espacio/s");
	}

	public static void Estrategia2() {
		String frase;
		int espacio = 0;
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine().trim();
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				espacio++;
			}
		}
		System.out.println("En total hay " + espacio + " espacio/s");
	}
}