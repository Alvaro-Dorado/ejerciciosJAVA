package com;

import java.util.Scanner;

public class Actividad12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int not1, not2, not3, not4, not5;

		System.out.println("Introduzca la nota del alunmno");
		not1 = sc.nextInt();
		System.out.println("Introduzca la nota del alunmno");
		not2 = sc.nextInt();
		System.out.println("Introduzca la nota del alunmno");
		not3 = sc.nextInt();
		System.out.println("Introduzca la nota del alunmno");
		not4 = sc.nextInt();
		System.out.println("Introduzca la nota del alunmno");
		not5 = sc.nextInt();

		if (not1 < 5) {
			System.out.println("Alumno con nota " + not1 + " Ha suspendido");
		} else if (not2 < 5) {
			System.out.println("Alumno con nota " + not2 + " Ha suspendido");
		} else if (not3 < 5) {
			System.out.println("Alumno con nota " + not3 + " Ha suspendido");
		} else if (not4 < 5) {
			System.out.println("Alumno con nota " + not4 + " Ha suspendido");
		} else if (not5 < 5) {
			System.out.println("Alumno con nota " + not5 + " Ha suspendido");
		} else {
			System.out.println("Ningun alumno ha suspendido");
		}
	}
}
