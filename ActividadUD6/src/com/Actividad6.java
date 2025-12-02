package com;

public class Actividad6 {
	public static void main(String[] args) {
		String cadena = "Hola mundo";
		System.out.println(invertida(cadena));
	}

	public static String invertida(String cadena) {
		StringBuilder cadena_invertida = new StringBuilder("");
		for (int i = cadena.length() - 1; i >= 0; i--) {
			char caracter = cadena.charAt(i);
			cadena_invertida.append(caracter);
		}
		return cadena_invertida.toString();
	}
}
