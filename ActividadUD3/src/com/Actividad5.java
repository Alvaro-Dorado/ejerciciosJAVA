package com;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, min, num;

		System.out.println("Introduzca el numero minimo");
		min = sc.nextInt();
		System.out.println("Introduzca el numero maximo");
		max = sc.nextInt();
		System.out.println("Introduzca un numero que es dentro del rango " + min + " y " + max);
		num = sc.nextInt();
		while (num > min || num < max) {
			System.err.println("No esta dentro del rango");
			num = sc.nextInt();
		}
		System.out.println("Esta dentro del rango " + min + " y " + max);

	}
}
