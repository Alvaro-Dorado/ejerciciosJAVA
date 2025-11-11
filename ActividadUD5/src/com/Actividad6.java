package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad6 {
	public static void main(String[] args) {
		int tempPuntuacion, contador = 0;
		int posicionExtra;
		int[] puntos = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la puntuación: ");
		for (int i = 0; i < puntos.length; i++) {
			puntos[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(puntos));
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
		do {
			System.out.println("Introduce una puntuación: ");
			tempPuntuacion = sc.nextInt();
			if (tempPuntuacion == -1) {
				break;
			}
			puntos = Arrays.copyOf(puntos, puntos.length + 1);
			posicionExtra = puntos.length - 1;
			puntos[posicionExtra] = tempPuntuacion;
			contador++;
		} while (contador < 3);
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
	}
}