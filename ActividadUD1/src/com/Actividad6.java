package com;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num1 = sc.nextInt();
		System.out.println("Dime un numero");
		int num2 = sc.nextInt();
		double calc = (num1 + num2) / 2.0;
		System.out.println("El resultado es: " + calc);
	}
}
