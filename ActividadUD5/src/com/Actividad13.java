package com;

import java.util.Scanner;

public class Actividad13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tabla = { 1, 15, 4, 2, 8, 6, 9 };
		int maximo;
		maximo = maximoTabla(tabla);
		System.out.println("El máximo es: " + maximo);
	}

	public static int maximoTabla(int[] t) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i];
			}
		}
		return max;
	}
}