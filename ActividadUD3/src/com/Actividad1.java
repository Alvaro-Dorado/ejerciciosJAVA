package com;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1, cuadrado = 0;

		while (num != 0) {
			System.out.println("Introduzca un numero");
			num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
			if (num < 0) {
				System.out.println("Es negativo");
			} else {
				System.out.println("Es positivo");
			}
			cuadrado = (num * num)
		}
	}
}
