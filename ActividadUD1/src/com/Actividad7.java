package com;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float radio, logintud, area;
		double PI = Math.PI;

		System.out.println("Dime el radio");
		radio = sc.nextFloat();

		logintud = (float) (2 * PI * radio);
		area = (float) (PI * radio * radio);

		System.out.println("La longitud es = " + logintud);
		System.out.println("El area es = " + area);
	}
}
