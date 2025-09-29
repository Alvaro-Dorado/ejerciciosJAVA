package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;

		System.out.println("Introduzca un numero");
		num1 = sc.nextInt();

		if (num1 < 0) {
			System.out.println("Es menor que cero");
		} else if (num1 < 10) {
			System.out.println("Tiene 1 cifra");
		} else if (num1 < 100) {
			System.out.println("Tiene 2 cifras");
		} else if (num1 < 1000) {
			System.out.println("Tiene 3 cifras");
		} else if (num1 < 10000) {
			System.out.println("Tiene 4 cifras");
		} else if (num1 < 100000) {
			System.out.println("Tiene 5 cifras");
		}

	}

}
