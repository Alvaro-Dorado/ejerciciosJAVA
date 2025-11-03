package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Di cuantas columnas va a tener tu tabla");
		int n = sc.nextInt();
		int[] tabla = new int[n];
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca numero");
			tabla[i] = sc.nextInt();
		}
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}
	}
}
