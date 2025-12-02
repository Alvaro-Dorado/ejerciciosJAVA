package com;

import java.util.Scanner;

public class Actividad10 {

	static Scanner SCAN = new Scanner(System.in);
	private static final String conjunto1 = "eikmpqrstuv";
	private static final String conjunto2 = "pviumterkqs";
	public static String mensaje_a_codificar = "PaquiTo"; 

	public static void main(String[] args) {
		System.out.println("Dime una palabra para codificar");
		mensaje_a_codificar = SCAN.nextLine();
		StringBuilder cadena_codificada = new StringBuilder();
		for (int i = 0; i < mensaje_a_codificar.length(); i++) {
			char c_actual = mensaje_a_codificar.charAt(i);
			char codificado = codifica(conjunto1.toCharArray(), conjunto2.toCharArray(), c_actual);
			cadena_codificada.append(codificado);
		}
		System.out.println(cadena_codificada.toString());
	}

	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		c = Character.toLowerCase(c);
		for (int i = 0; i < conjunto1.length; i++) {
			if (conjunto1[i] == c) {
				return conjunto2[i];
			}
		}
		return c;
	}

	public static char[] devolverConjunto1() {
		return conjunto1.toCharArray();
	}

	public static char[] devolverConjunto2() {
		return conjunto2.toCharArray();
	}
}