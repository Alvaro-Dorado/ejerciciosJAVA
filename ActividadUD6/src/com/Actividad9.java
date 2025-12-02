package com;

import java.util.Scanner;

public class Actividad9 {
	static Scanner sc = new Scanner(System.in);
	private final static String MULETILLA_INICIAL = "Javalín, javalón";
	private final static String MULTELILLA_FINAL = "javalén, len, len";
	private static String textoPrueba1 = "Javalín, javalón \t esto es texto de prueba \t";
	private static String textoPrueba2 = "Esto no es de javalandia";
	private static String textoPrueba3 = "\nTexto para prueba 3 para probar \t javalén, len, len";
	private static String textoPrueba4 = "NO empieza por Javalín, javalón \t esto es texto de prueba";

	public static void main(String[] args) {
		System.out.println("Escribe texto en idioma de Javalin");
		String entrada = textoPrueba4;
		if (entrada.startsWith(MULETILLA_INICIAL)) {
			System.out.println("El mensaje es de Javalandia:");
			String mensaje = entrada.substring(MULETILLA_INICIAL.length()).trim();
			System.out.println(mensaje);
		} else if (entrada.endsWith(MULTELILLA_FINAL)) {
			System.out.println("El mensaje es de Javalandia:");
			String mensaje = entrada.substring(0, entrada.length() - MULTELILLA_FINAL.length()).trim();
			System.out.println(mensaje);
		} else {
			System.out.println("El mensaje no es de los habitantes de Javalandia");
		}
	}
}