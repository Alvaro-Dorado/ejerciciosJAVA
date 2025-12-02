package com;

public class Actividad11 {
	public static void main(String[] args) {
		String mensaje = "matqvko";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mensaje.length(); i++) {
			char descodificado = decodificar(Actividad10.devolverConjunto1(), Actividad10.devolverConjunto2(),
					mensaje.charAt(i));
			sb.append(descodificado);
		}
		System.out.println(sb.toString());
	}

	public static char decodificar(char conjunto1[], char conjunto2[], char c) {
		return Actividad10.codifica(conjunto2, conjunto1, c);
	}
}