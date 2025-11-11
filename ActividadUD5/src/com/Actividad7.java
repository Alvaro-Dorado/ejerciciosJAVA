package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String MENSAJE_NUMEROS = "Dime 6 números";
		int it1 = 0, it2 = 0, it3 = 0;
		int[] tabla1 = { 5, 7, 8, 3, 1, 2 };
		int[] tabla2 = { 9, 8, 5, 2, 3, 4 };
		int[] tabla3 = new int[tabla1.length + tabla2.length];
		System.out.println("antes: " + Arrays.toString(tabla1));
		Arrays.sort(tabla1);
		System.out.println("después: " + Arrays.toString(tabla1));
		System.out.println("antes: " + Arrays.toString(tabla2));
		Arrays.sort(tabla2);
		System.out.println("después: " + Arrays.toString(tabla2));
		while (it1 < tabla1.length && it2 < tabla2.length) {
			if (tabla1[it1] <= tabla2[it2]) {
				tabla3[it3] = tabla1[it1];
				it1++;
			} else {
				tabla3[it3] = tabla2[it2];
				it2++;
			}
			it3++;
		}
		while (it1 < tabla1.length) {
			tabla3[it3] = tabla1[it1];
			it1++;
			it3++;
		}
		while (it2 < tabla2.length) {
			tabla3[it3] = tabla2[it2];
			it2++;
			it3++;
		}
		System.out.println(Arrays.toString(tabla3));

	}
}