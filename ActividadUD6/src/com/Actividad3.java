package com;

import java.util.Scanner;

public class Actividad3 {
	static Scanner sc = new Scanner(System.in);
	static String FINAL = "fin";

	public static void main(String[] args) {
		System.out.println("Introduce una frase palabra por palabra hasta que diga 'fin'");
		String palabra = "", frase = "";
		while (!(palabra.compareToIgnoreCase(FINAL) == 0)) {
			System.out.println(">");
			palabra = sc.nextLine().trim();
			if (!(palabra.compareToIgnoreCase(FINAL) == 0)) {
				frase += " " + palabra;
			}
		}
		System.out.println(frase);
	}
}