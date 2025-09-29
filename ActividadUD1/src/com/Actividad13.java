package com;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int notas_primer, notas_segun, notas_tercer;
		double notasfi;

		System.out.println("Indica las notas del primer trimestre");
		notas_primer = sc.nextInt();
		System.out.println("Indica las notas del segundo trimestre");
		notas_segun = sc.nextInt();
		System.out.println("Indica las notas del tercer trimestre");
		notas_tercer = sc.nextInt();

		notasfi = (double) ((notas_primer + notas_segun + notas_tercer) / 3.0);
		System.out.println("Notas del boletin= " + (int) notasfi);
		System.out.println("Notas del boletin= " + notasfi);
	}

}
