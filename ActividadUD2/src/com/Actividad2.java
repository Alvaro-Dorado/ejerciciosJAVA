package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.println("Introduzca el primer numero");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println("son iguales");
		} else {
			System.out.println("no son iguales");
		}

	}
}
