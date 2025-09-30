package com;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String Capicua = " Es Capicua";
		final String NoCapicua = " No es Capicua";
		int num, unidades, decenas, centenas, millares;

		System.out.println("Introduzca un numero max 4 cifras");
		num = sc.nextInt();

		if (num < 10) {
			System.out.println(NoCapicua);
		} else if (num < 100) {
			unidades = num % 10;
			decenas = num / 10;
			if (unidades == decenas) {
				System.out.println(num + Capicua);
			} else {
				System.out.println(num + NoCapicua);
			}
		} else if (num < 1000) {
			unidades = num % 10;
			centenas = num / 100;
			if (unidades == centenas) {
				System.out.println(num +  Capicua);
			} else {
				System.out.println(num + NoCapicua);
			}
		} else if (num < 10000) {
			unidades = num % 10;
			decenas = (num / 10) % 10;
			centenas = (num / 100) % 10;
			millares = num / 1000;
			if ((unidades == millares) && (decenas == centenas)) {
				System.out.println(num + Capicua);
			} else {
				System.out.println(num + NoCapicua);
			}
		} else {
			System.out.println("Numero demasiado grande");
		}
	}

}
