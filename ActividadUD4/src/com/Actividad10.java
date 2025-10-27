package com;

import java.util.Scanner;

public class Actividad10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, suma_divi1, suma_divi2;
		final String mensaje = "La suma de los divisores de ";
		System.out.println("Dime 2 numero para saber si son amigos o no");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		suma_divi1 = divisores(num1);
		System.out.println(mensaje + num1 + " es: " + suma_divi1);
		suma_divi2 = divisores(num2);
		System.out.println(mensaje + num2 + " es: " + suma_divi2);
		if (suma_divi1 == num2 && suma_divi2 == num1) {
			System.out.println("Son amigos");
		} else {
			System.out.println("No son amigos");
		}

		sc.close();
	}

	public static int divisores(int x) {
		int acum_divisores = 0;
		for (int iteracion = 1; iteracion < x; iteracion++) {
			if (x % iteracion == 0) {
				acum_divisores += iteracion;
			}
		}
		return acum_divisores;
	}
}