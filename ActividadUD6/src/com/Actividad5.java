package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5 {
	private static final String VOCALES = "aeiouAEIOUÁÉÍÓÚáéíóú";

	public static Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Dime nombre y apellidos: ");
		String nombre_apellido = SCANNER.nextLine();
		StringBuilder sb = new StringBuilder();
		for (char caracter : nombre_apellido.toCharArray()) {
			if (VOCALES.contains(Character.toString(caracter))) {
				sb.append("");
			} else {
				sb.append(caracter);
			}
		}
		System.out.println(sb.toString());
	}
}