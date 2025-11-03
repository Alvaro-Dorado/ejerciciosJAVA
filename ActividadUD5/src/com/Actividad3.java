package com;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Di cuantas columnas va a tener tu tabla");
		int n = sc.nextInt();
		int[] tabla = new int[n];
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca numero");
			tabla[i] = sc.nextInt();
		}
		System.out.println("Los numero positivos son: " + mediaPositivos(tabla) + " los negativos son: "+ mediaNegativos(tabla) + " los ceros son: " + mediaCeros(tabla));
	}

	public static double mediaPositivos(int[] numeros) {
		int contPositivo = 0;
		for (int numero : numeros)
			if (numero > 0) {
				contPositivo++
			}
		return contPositivo ;
	}

	public static double mediaNegativos(int[] numeros) {
		int contNegativo = 0;
		for (int numero : numeros)
			if (numero < 0) {
				contNegativo++;
			}
		return contNegativo ;
	}

	public static int mediaCeros(int[] numeros) {
		int contCero = 0;
		for (int numero : numeros)
			if (numero == 0) {
				contCero++;
			}
		return contCero ;
	}

}
