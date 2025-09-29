package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime el número: ");

		int num = scanner.nextInt();

		boolean par = num % 2 == 0;

		System.out.println("¿Es par? " + par);

	}

}
