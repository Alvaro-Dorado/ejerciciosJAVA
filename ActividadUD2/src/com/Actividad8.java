package com;

import java.util.Scanner;

public class Actividad8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, resul1, resul2;

		System.out.println("Introduzca el primer numero");
		a = sc.nextDouble();
		System.out.println("Introduzca el segundo numero");
		b = sc.nextDouble();
		System.out.println("Introduzca el tercer numero");
		c = sc.nextDouble();

		if (a == 0) {
			System.out.println("No tiene solucion");
		} else {
			resul1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
			resul2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
			resul1 = (int) resul1;
			resul2 = (int) resul2
		}

	}
}
