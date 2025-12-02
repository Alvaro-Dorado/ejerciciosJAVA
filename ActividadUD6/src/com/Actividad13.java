package com;

public class Actividad13 {

	public static void main(String[] args) {
		int total;
		String frase = "En un lugar de la Mancha";
		String abc = "abcdefghijklmnñopqrstuvwxyz";
		for (int i = 0; i < abc.length(); i++) {
			total = contarCaracteres(frase, abc.charAt(i));
			if (total > 0) {
				System.out.println("La letra " + abc.charAt(i) + " tiene" + total);
			}
		}
	}

	public static int contarCaracteres(String frase, char c) {
		int contador = 0;
		for (int i = 0; i < frase.trim().toLowerCase().length(); i++) {
			if (frase.charAt(i) == c) {
				contador++;
			}
		}
		return contador;
	}
}