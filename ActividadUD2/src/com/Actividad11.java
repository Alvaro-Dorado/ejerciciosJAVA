package com;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota;

		System.out.println("Introduzca la nota");
		nota = sc.nextDouble();

		if ((nota > 0) && (nota <= 4)) {
			System.out.println("Insuficiente");
		} else if (nota <= 5) {
			System.out.println("Suficiente");
		} else if (nota <= 6) {
			System.out.println("Bien");
		} else if (nota <= 8) {
			System.out.println("Notable");
		} else if (nota <= 10) {
			System.out.println("Sobresaliente");
		}

	}

}
