package com;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("Introduce el primer número");
		num1 = sc.nextInt();
		System.out.println("Introduce el siguiente número");
		num2 = sc.nextInt();
		System.out.println("Introduce el siguiente número");
		num3 = sc.nextInt();

		if ((num1 > num3) && (num1 < 2)) {
			System.out.println(num2 + ", " + num1 + ", " + num3);
		} else if ((num2 > num1) && (num2 < num3)) {
			System.out.println(num3 + ", " + num2 + ", " + num1);

		} else if ((num3 > num1) && (num3 < num2)) {
			System.out.println(num2 + ", " + num3 + ", " + num1);

		} else if ((num1 < num3) && (num1 > num2)) {
			System.out.println(num3 + ", " + num1 + ", " + num2);
		} else if ((num1 > num3) && (num1 < num2)) {
			System.out.println(num2 + ", " + num1 + ", " + num3);
		} else if ((num2 > num1) && (num2 < num3)) {
			System.out.println(num3 + ", " + num2 + ", " + num1);
		} else if ((num2 < num1) && (num2 > num3)) {
			System.out.println(num1 + ", " + num2 + ", " + num3);
		} else if ((num3 > num1) && (num3 < num2)) {
			System.out.println(num2 + ", " + num3 + ", " + num1);
		} else {
			System.out.println(num1 + ", " + num3 + ", " + num2);
		}

	}

}