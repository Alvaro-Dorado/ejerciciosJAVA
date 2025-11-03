package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = { 2, 4, 5, 22, 29, 19 };
		Arrays.copyOf(numeros, 2);
		do {
			System.out.println("Dime el indice: ");
			int num = sc.nextInt();
			if (num >= numeros.length || num < 0) {
				continue;
			}
			System.out.println(numeros[num]);
		} while (numeros.length > 0)
	}

	public static void borrarElemento(int[] t, int pos) {

	}
}
