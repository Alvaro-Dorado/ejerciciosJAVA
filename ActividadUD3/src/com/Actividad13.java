package com;

import java.util.Scanner;

public class Actividad13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alunNota, aprobados = 0, condicionados = 0, suspensos = 0;
		for (int indice = 0; indice < 6; indice++) {
			System.out.println("Introduzca la nota de los alumnos");
			alunNota = sc.nextInt();
			if (alunNota <= 5) {
				aprobados++;
			} else if (alunNota == 4) {
				condicionados++;
			} else {
				suspensos++;
			}
			System.out.println("Aprobados: " + aprobados);
			System.out.println("Condicionados: " + condicionados);
			System.out.println("Suspensos: " + suspensos);
		}
	}
}
