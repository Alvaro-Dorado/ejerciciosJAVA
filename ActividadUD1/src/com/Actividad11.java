package com;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PRECIO_MANZANA = 2.35;
		final double PRECIO_PERA = 1.95;

		double kilomanzana1, kilopera1, kilomanzana2, kilopera2;
		double manzanabene, perabene, totalbene;

		System.out.println("¿Cuatos kilos de manzana has vendido en el primer semestre?");
		kilomanzana1 = sc.nextDouble();

		System.out.println("¿Cuatos kilos de pera has vendido en el primer semestre?");
		kilopera1 = sc.nextDouble();

		System.out.println("¿Cuatos kilos de manzana has vendido en el segundo semestre?");
		kilomanzana2 = sc.nextDouble();

		System.out.println("¿Cuatos kilos de pera has vendido en el segundo semestre?");
		kilopera2 = sc.nextDouble();

		manzanabene = (kilomanzana1 + kilomanzana2) * PRECIO_MANZANA;
		perabene = (kilopera1 + kilopera2) * PRECIO_PERA;

		totalbene = manzanabene + perabene;

		System.out.println("¿El importe tortal es = " + totalbene);
	}

}
