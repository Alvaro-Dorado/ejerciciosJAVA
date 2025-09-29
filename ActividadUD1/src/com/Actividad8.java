package com;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		boolean mayor;

		System.out.println("Dime tu edad");
		edad = sc.nextInt();

		mayor = edad >= 18;

		System.out.println("¿Es mayor?" + mayor);

	}

}
