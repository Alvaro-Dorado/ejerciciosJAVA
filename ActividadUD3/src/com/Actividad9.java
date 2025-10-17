package com;

import java.util.*;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura, id = 0, alturaMax = 0, idMax = 0;

		do {
			System.out.println("Introcuce la altura: ");
			altura = sc.nextInt();

			id++;

			if (altura >= alturaMax) {
				alturaMax = altura;
				idMax = id;

			}
		} while (altura != -1);
		System.out.println("Arbol mas alto:  ID: " + idMax + " Altura: " + alturaMax + "cm.");
		sc.close();
	}
}