package com;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		int dia, mes, año;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el dia");
		dia = sc.nextInt();
		System.out.println("Introduce el mes");
		mes = sc.nextInt();
		System.out.println("Introduce el año");
		año = sc.nextInt();

		if ((mes == 1) && (dia >= 1 && dia <= 31)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 2) && (dia >= 1 && dia <= 28)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 3) && (dia >= 1 && dia <= 31)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 4) && (dia >= 1 && dia <= 30)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 5) && (dia >= 1 && dia <= 31)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 6) && (dia >= 1 && dia <= 30)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 7) && (dia >= 1 && dia <= 31)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 8) && (dia >= 1 && dia <= 30)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 9) && (dia >= 1 && dia <= 31)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 10) && (dia >= 1 && dia <= 30)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 11) && (dia >= 1 && dia <= 31)) {
			System.out.println("Es una fecha válida");
		} else if ((mes == 12) && (dia >= 1 && dia <= 30)) {
			System.out.println("Es una fecha válida");
		} else {
			System.out.println("No es una fecha válida");
		}
	}

}