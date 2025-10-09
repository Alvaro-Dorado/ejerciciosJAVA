package com;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora, min, seg;

		System.out.println("Introduzca una hora");
		hora = sc.nextInt();
		System.out.println("Introduzca los minutos");
		min = sc.nextInt();
		System.out.println("Introduzca los segundos");
		seg = sc.nextInt();

		if (hora >= 24 || min >= 60 || seg >= 60) {
			System.err.println("La hora no existe");
		} else {
			seg++;
			if (seg == 60) {
				min++;
				seg = 00;
				if (min == 60) {
					hora++;
					seg = 00;
					min = 00;
					if (hora == 24) {
						hora = 00;
						min = 00;
						seg = 00;
					}
				}
			}
			System.out.println("La hora es: " + hora + " : " + min + " : " + seg);
		}
	}

}
