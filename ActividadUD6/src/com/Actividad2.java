package com;

import java.util.Scanner;

public class Actividad2 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String password;
		System.out.println("Jugador 1: Escribe una constraseña: ");
		password = sc.nextLine().trim();
		System.out.println("¿Qué versión quieres jugar (1 o 2)?");
		int version = sc.nextInt();
		sc.skip("\n");
		switch (version) {
		case 1:
			System.out.println("Version 1:");
			version_juego_1(password);
			break;
		case 2:
			System.out.println("Versión 2:");
			version_juego_2(password);
		default:
			System.out.println("No existe esa versión");
			break;
		}
	}

	private static void version_juego_2(String password) {
		String intentoPassword;
		while (true) {
			System.out.println("Jugador 2: Adivina la contraseña: ");
			intentoPassword = sc.nextLine();
			if (intentoPassword.compareTo(password) > 0) {
				System.out.println("La palabra buscada es anterior a la ingresada");
			} else if (intentoPassword.compareTo(password) < 0) {
				System.out.println("La palabra buscada es posterior a la ingresada");
			} else {
				break;
			}

		}
		System.out.println("¡Enhorabuena! Has acertado");
	}

	private static void version_juego_1(String password) {
		String intentoPassword;
		System.out.println("## PISTAS ##");
		System.out.println("El número de carácteres " + password.length());
		System.out.println("El primer carácter: " + password.charAt(0));
		int ultimo = password.length() - 1;
		System.out.println("El último carácter: " + password.charAt(ultimo));
		do {
			System.out.println("Jugador 2: Adivina la contraseña: ");
			intentoPassword = sc.nextLine();
		} while (!password.equals(intentoPassword));
		System.out.println("¡Enhorabuena! Has acertado");
	}
}