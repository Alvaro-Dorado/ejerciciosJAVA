package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tabla = new int[0];
		int[] tablaMod;
		int numActual;
		do {
			System.out.println("Dime el numero a introducir");
			numActual = sc.nextInt();
			if (numActual != -1) {
				tablaMod = rellenaPares(tabla, numActual);
				tabla = tablaMod;
			}
		} while (numActual != -1);
		System.out.println("Tabla Final:" + Arrays.toString(tabla));

	}

	public static int[] rellenaPares(int[] tabla, int num) {
		int[] tablaMod = Arrays.copyOf(tabla, tabla.length + 1);
		if (num % 2 == 0) {
			tablaMod[tablaMod.length - 1] = num;
			return tablaMod;
		} else {
			return tabla;
		}
	}
}